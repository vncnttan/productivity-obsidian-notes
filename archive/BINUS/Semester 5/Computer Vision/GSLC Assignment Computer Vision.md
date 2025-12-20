> **Vincent Tanjaya**
> **2602128346**

![[Keypoints 3.png]]

**Hasil dari perbandingan**



1. **What are differences found in my experiment between 2 algorithm and based on across the variety images?**
   **Accuracy of Keypoint Detection**
   From the oreo image we can see that the SIFT can accurately pinpoint where is the Oreo logo located in variety of other snack logos. This highlight SIFT ability to detect detailed and fine-grained features, rather than Orb that performs poorly on searching the Oreo logo (it matches all over the place).
   
   **Rotation and Scale**
   From the observation, both did a good job at recognizing images that are distorted or flipped. but from the phone example, we can see that orb are more confident on guessing the similarity on the **text and lock icon**, meanwhile SIFT is more confident on identifying the **logos**.
   When rotating 3D image, SIFT can identify the features better (the dinosaurus feet is matched with the second image feet, etc.) meanwhile sometimes ORB can mispredict something. 
   
   **Sensitivity to Noise**
   ORB is more sensitive to noises, so that's why when there are too much noise (in the oreo image there was so many unrelated image) ORB performs poor
   References: 
   - [A comparison of prefilters in ORB-based object detection - ScienceDirect](https://www.sciencedirect.com/science/article/abs/pii/S0167865516303300)
   - [opencv - Why ORB is not as good as SIFT in matching for these two images? - Stack Overflow](https://stackoverflow.com/questions/37617023/why-orb-is-not-as-good-as-sift-in-matching-for-these-two-images)

---

2. **Based on my observation, do these 2 algorithm failed in certain cases in my samples?**
   - SIFT perform well across all images, but in case 2 (the bottle images), SIFT fails to generalize the bottle neck, bottle cap, etc., meanwhile ORB can identify them better.
   
   - Meanwhile ORB can fail when they are a lot of noise in the image, the background is not plain, and the scale of the image that want to be compared is a lot different. ORB performance in image 1 is also slightly worse considering the 3D rotated images

---

3. **Which one is the robust feature extractor for the keypoint matching task? Explain!**
   SIFT is the more robust feature extractor for keypoint matching task because they accurately gives the matches across all images, despite their weaknesses. This is also because SIFT is prone less to noises in images, and unrelated image that was happening in the background. 
   
   But ORB is still a good alternative, considering they can recognize pattern/feature in texts, and logos quite well. ORB can also generalize something that was not exactly the same shape, pattern, etc. But it might sometimes give the wrong prediction on the keypoint matching.
   
   Reference: [A Comparison of SIFT, SURF and ORB on OpenCV | by Mikhail Kennerley | Medium](https://mikhail-kennerley.medium.com/a-comparison-of-sift-surf-and-orb-on-opencv-59119b9ec3d0)
---

