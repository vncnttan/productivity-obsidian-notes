``` python
import cv2

img = cv2.imread("kittens.jpg")
cv2.imshow("Shown Image", flag= )

cv2.waitkey(0)
```

- imread = open img
- imshow = show img
- waitKey - nunggu user key before sleep

Imshow Flags: 
- cv2.imread_ANYCOLOR 4
- cv2.imread_COLOR 1
- cv2.imread_GRAYSCALE 0
- cv2.imread_UNCHANGED -1

### Basic Show Image
``` python
import cv2

image = cv2.imread('./lena.jpg')

def showResult(winname = None, img = None):
    cv2.imshow(winname, img)
    cv2.waitKey()
    cv2.destroyAllWindows()

showResult('Model Image', image)

image_b = image.copy()
image_g = image.copy()
image_r = image.copy()

print(image.shape)
image_b[:, :, (1, 2)] = 0
image_g[:, :, (0, 2)] = 0
image_r[:, :, (0, 1)] = 0

showResult('Image Blue', image_b)
showResult('Image Green', image_g)
showResult('Image Red', image_r)
```

### Stacking Images
```python
import numpy as np
image_vstack = np.vstack((image_b, image_g, image_r))
image_hstack = np.hstack((image_b, image_g, image_r))

showResult('Image vstack', image_vstack)
showResult('Image hstack', image_hstack)
```