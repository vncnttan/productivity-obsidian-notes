# Pertemuan 1
[[Basic Python]]
[[Python - OpenCV Basic]]

### Histogram Equalization
```python
import cv2
import numpy as np
import matplotlib.pyplot as plt

image = cv2.imread('model.jpg')
igray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

def showResult(label = None, image = None, cmap = None ):
    plt.figure(figsize=(8, 8))
    plt.subplot(1, 2, 1)
    plt.hist(image.flat, bins=256, range=(0, 256)) # bins adalah pembagian dari histogramnya
    plt.title(label)
    plt.xlabel('Intensity value')
    plt.ylabel('Intensity quantity')
    plt.subplot(1, 2, 2)
    plt.imshow(image, cmap=cmap)
    plt.axis('off')
    plt.show()

normal_image = igray.copy()
showResult("Normal Image", normal_image, 'gray')
```

### Normal Equalization
```python
# Equalization using equalization histogram
nequ_hist = cv2.equalizeHist(igray)
showResult("Nequ", nequ_hist, 'gray')
```

### CLAHE
```python
clahe = cv2.createCLAHE(clipLimit=2.0, tileGridSize=(8, 8))
cequ_hist = clahe.apply(igray)
showResult("Cequ", cequ_hist, 'gray')
```

# Pertemuan 2
### Detecting Edge
```python
import cv2
import numpy as np
import matplotlib.pyplot as plt

image = cv2.imread('model.jpg')
igray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

def showResult(label = None, image = None, cmap = None ):
    plt.figure(figsize=(8, 8))
    plt.subplot(1, 2, 1)
    plt.hist(image.flat, bins=256, range=(0, 256)) # bins adalah pembagian dari histogramnya
    plt.title(label)
    plt.xlabel('Intensity value')
    plt.ylabel('Intensity quantity')
    plt.subplot(1, 2, 2)
    plt.imshow(image, cmap=cmap)
    plt.axis('off')
    plt.show()

normal_image = igray.copy()
# showResult("Normal Image", normal_image, 'gray')

# Equalization using equalization histogram
nequ_hist = cv2.equalizeHist(igray)
# showResult("Nequ", nequ_hist, 'gray')

clahe = cv2.createCLAHE(clipLimit=2.0, tileGridSize=(8, 8))
cequ_hist = clahe.apply(igray)
# showResult("Cequ", cequ_hist, 'gray')


hist_labels = ['normal', 'nequ', 'cequ']
hist_images = [normal_image, nequ_hist, cequ_hist]

plt.figure(figsize=(12, 12))
for i, (lbl, img) in enumerate(zip(hist_labels, hist_images)):
    plt.subplot(3, 1, i+1)
    plt.hist(img.flat, bins=256, range=(0, 256)) # bins adalah pembagian dari histogramnya
    plt.title(lbl)
    plt.xlabel('Intensity value')
    plt.ylabel('Intensity quantity')
plt.show

plt.figure(figsize=(12, 12))
for i, (lbl, img) in enumerate(zip(hist_labels, hist_images)):
    plt.subplot(1, 3, i+1)
    plt.imshow(img, cmap='gray')
    plt.title(lbl)
    plt.axis('off')
plt.show()
```

# Pertemuan 3
### Gray
``` python
import cv2
import matplotlib.pyplot as plt
import numpy as np

image = cv2.imread('lena.jpg')
def show_result(nrow = None, ncol = None, res_stack = None):
    plt.figure(figsize=(12, 12))
    for i, (lbl, img) in enumerate(res_stack):
        plt.subplot(nrow, ncol, i+1)
        plt.imshow(img, cmap='gray')
        plt.title(lbl)
        plt.axis('off')
    plt.show()

gray_ocv = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
gray_avg = np.dot(image, [0.33, 0.33, 0.33])

image_b, image_g, image_r = image[:, :, 0], image[:, :, 1], image[:, :, 2]

max_cha = max(np.max(image_b), np.max(image_g), np.max(image_r))
min_cha = min(np.max(image_b), np.max(image_g), np.max(image_r))

gray_light = np.dot(image, [(max_cha + min_cha) / 2, (max_cha + min_cha) / 2, (max_cha + min_cha) / 2])
gray_lum = np.dot(image, [0.07, 0.71, 0.21])
gray_wag = np.dot(image, [0.114, 0.587, 0.299])

gray_labels = ['ocv', 'avg', 'lig', 'lum', 'wag']
gray_images = [gray_ocv, gray_avg, gray_light, gray_lum, gray_wag]

show_result(3, 2, zip(gray_labels, gray_images))
```

### Threshold Manual
``` python
import cv2
import matplotlib.pyplot as plt
import numpy as np


def show_result(nrow = None, ncol = None, res_stack = None):
    plt.figure(figsize=(12, 12))
    for i, (lbl, img) in enumerate(res_stack):
        plt.subplot(nrow, ncol, i+1)
        plt.imshow(img, cmap='gray')
        plt.title(lbl)
        plt.axis('off')
    plt.show()

image = cv2.imread('lena.jpg')
                        
thresh = 100
gray_ocv = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
thresh_img = gray_ocv.copy()

height, width = image.shape[:2]
for i in range(height):
    for j in range(width):
        if(thresh_img[i, j]) > thresh :
            thresh_img[i, j] = 255
        else: 
            thresh_img[i, j] = 0

show_result(1, 1, zip(['Manual Threshold'], [thresh_img]))
```

# Pertemuan 4 - Edge Detection
```python
import cv2
import numpy as np
import matplotlib.pyplot as plt

image = cv2.imread('fruits.jpg')
igray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

# cv2.imshow('gray', image)
# cv2.waitKey(0)
# cv2.destroyAllWindows()

laplace_8u = cv2.Laplacian(igray, cv2.CV_8U)
laplace_16s = cv2.Laplacian(igray, cv2.CV_16S)
laplace_32f = cv2.Laplacian(igray, cv2.CV_32F)
laplace_64f = cv2.Laplacian(igray, cv2.CV_64F)

def show_result(nrow = None, ncol = None, res_stack = None):
    plt.figure(figsize=(12, 12))
    for i, (lbl, img) in enumerate(res_stack):
        plt.subplot(nrow, ncol, i+1)
        plt.imshow(img, cmap='gray')
        plt.title(lbl)
        plt.axis('off')
    plt.show()

laplace_labels = ['8u', '16s', '32f', '64f']
laplace_images = [laplace_8u, laplace_16s, laplace_32f, laplace_64f]

show_result(2, 2, zip(laplace_labels, laplace_images))

ksize = 3
sobel_x = cv2.Sobel(igray, cv2.CV_32F, 1, 0, ksize)
sobel_y = cv2.Sobel(igray, cv2.CV_32F, 0, 1, ksize)

sobel_labels = ['sobel x', 'sobel y']
sobel_images = [sobel_x, sobel_y]

show_result(1, 2, zip(sobel_labels, sobel_images))

merged_sobel = np.sqrt(np.square(sobel_x) + np.square(sobel_y))
merged_sobel *= 255/merged_sobel.max()

show_result(1, 1, zip(['merged sobel'], [merged_sobel]))


canny_50100 = cv2.Canny(igray, 50, 100)
canny_50150 = cv2.Canny(igray, 50, 150)
canny_75150 = cv2.Canny(igray, 75, 150)
canny_75225 = cv2.Canny(igray, 75, 225)

canny_labels = ["canny_50100", "canny_50150", "canny_75150", "canny_75225"]
canny_images = [canny_50100, canny_50150, canny_75150, canny_75225]

show_result(2, 2, zip(canny_labels, canny_images))
```
# Pertemuan 5 - Corner Detection
``` python
import cv2
import numpy as np
import matplotlib.pyplot as plt

image = cv2.imread('chessboard.jpg')
igray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

igray = np.float32(igray)

def show_result(source, cmap):
    plt.imshow(source, cmap = cmap)
    plt.show()

harris = cv2.cornerHarris(igray, 2, 5, 0.04)

without_subpix = image.copy()
without_subpix[harris > 0.01 * harris.max()] = [0, 255, 0]

# show_result(without_subpix, 'gray')
# show_result(harris, 'gray')

_, thresh = cv2.threshold(harris, 0.01 * harris.max(), 255, 0)
thresh = np.uint8(thresh)

_, _, _, centroids = cv2.connectedComponentsWithStats(thresh)
centroids = np.float32(centroids)


criteria = (cv2.TERM_CRITERIA_MAX_ITER + cv2.TERM_CRITERIA_EPS, 100, 0.0001)
enchanced_criteria = cv2.cornerSubPix(igray, centroids, (2, 2), (-1, -1), criteria)

enchanced_criteria = np.uint16(enchanced_criteria)

with_subpix = image.copy()

for i in enchanced_criteria:
    x, y = i[:2]
    with_subpix[y, x] = [255, 0, 0]

show_result(with_subpix, 'gray')
```

# Pertemuan 6 - Feature Detection
```python
import cv2
import numpy as np
import matplotlib.pyplot as plt

image_obj = cv2.imread("marjan.png")
image_scn = cv2.imread("marjan_banyak.png")

SIFT = cv2.SIFT_create()
ORB = cv2.ORB_create()
AKAZE = cv2.AKAZE_create()

sift_kp_obj, sift_ds_obj = SIFT.detectAndCompute(image_obj, None)
sift_kp_scn, sift_ds_scn = SIFT.detectAndCompute(image_scn, None)

orb_kp_obj, orb_ds_obj = ORB.detectAndCompute(image_obj, None)
orb_kp_scn, orb_ds_scn = ORB.detectAndCompute(image_scn, None)

akaze_kp_obj, akaze_ds_obj = AKAZE.detectAndCompute(image_obj, None)
akaze_kp_scn, akaze_ds_scn = AKAZE.detectAndCompute(image_scn, None)

#SIFT, AKAZE - Euclidean ubah jadi float32 si descriptornya
sift_ds_obj = np.float32(sift_ds_obj)
sift_ds_scn = np.float32(sift_ds_scn)

akaze_ds_obj = np.float32(akaze_ds_obj)
akaze_ds_scn = np.float32(akaze_ds_scn)

#ORB - hamming
flann = cv2.FlannBasedMatcher(dict(algorithm = 1), dict(checks = 50))
bfmatcher = cv2.BFMatcher(cv2.NORM_HAMMING, crossCheck = True)

#matching
sift_match = flann.knnMatch(sift_ds_obj, sift_ds_scn, 2)
akaze_match = flann.knnMatch(akaze_ds_obj, akaze_ds_scn, 2)

orb_match = bfmatcher.match(orb_ds_obj, orb_ds_scn)
orb_match = sorted(orb_match, key = lambda x : x.distance)

#create masking
def createMasking(mask, match):
    for i, (fm, sm) in enumerate(match):
        if(fm.distance < 0.7 * sm.distance):
            mask[i] = [1, 0]
    return mask

sift_matches_mask = [[0, 0] for i in range(0, len(sift_match))]
akaze_matches_mask = [[0, 0] for i in range(0, len(akaze_match))]

sift_matches_mask = createMasking(sift_matches_mask, sift_match)
sift_matches_mask = createMasking(sift_matches_mask, sift_match)

sift_res = cv2.drawMatchesKnn(
    image_obj, sift_kp_obj,
    image_scn, sift_kp_scn,
    sift_match, None,
    matchColor=[255, 0, 0], singlePointColor=[0, 255, 0],
    matchesMask = sift_matches_mask
)

akaze_res = cv2.drawMatchesKnn(
    image_obj, akaze_kp_obj,
    image_scn, akaze_kp_scn,
    akaze_match, None,
    matchColor=[255, 0, 0], singlePointColor=[0, 255, 0],
    matchesMask = akaze_matches_mask
)

orb_res = cv2.drawMatches(
    image_obj, orb_kp_obj,
    image_scn, orb_kp_scn,
    orb_match[:20], None,
    matchColor=[255, 0, 0], singlePointColor=[0, 255, 0],
    flags=2
)

res_labels = ['sift', 'akaze', 'orb']
res_images = [sift_res, akaze_res, orb_res]
plt.figure(figsize=(12, 12))
for i, (lbl, img) in enumerate(zip(res_labels, res_images)):
    plt.subplot(2, 2, 2+i)
    plt.imshow(img, cmap='gray')
    plt.title(lbl)
plt.show()
```

