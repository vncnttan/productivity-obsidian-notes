24 Session - 4 SKS
#COMPSCIBINUS🏫4tSEM #AI

Dosen Machine Learning
Whatsapp - 082122770499


### Session 1 - Introduction to Machine Learning
[[Introduction to Machine Learning]]

### Session 2 - Exploratory Data Analysis and Preprocessing Data
[[Explanatory Data Analysis - ML]]
[[Defining Variables]]
[[Data Preprocessing]]

### Session 3 - Linear Regression

### Session 4 - Logistic Regression

### Session 5 - Model Selection & Regularization
[[L1 & L2 Regularization]]


### Session 6 - Bayes Naive
[[UTS Machine Learning]]
### Session 7 - Recommender System

### Session 8 - Decision tree and Ensemble Learning

### Session 9 - Support Vector Machine
[[GSLC Machine Learning Sesi 17]]
[[GSLC Machine Learning Sesi 18]]

### Session 10 - Clustering

### Session 11 - Dimensionality Reduction

### Session 12 - Machine Learning Operation

MLOps, set of practices that aim to streamline and automate the end-to-end machine learning lifecycle that encompasses the entire process from data preparation and model development to deployment.


### Session 13 - Review and Presentation
[[UAS Machine Learning]]

Cara memilih jumlah k yang cocok
![[Pasted image 20240520154748.png]]
Gap terbesar, jadinya paling cocok k=4

### DBScan 
Sometimes the cluster is not always circular, it can
Density based scan can cluster point based on their density
![[Pasted image 20240520154946.png]]

Epsilon: Radius
MinPts: Min points

Core Points: Has more than specified number of points (MinPts) in Epsilon (radius), else it is border points or noise points.
- Border Point: If any of the neighboring is a core point
- Noise Point
![[Pasted image 20240520155802.png]]

	Step 1. Search for core points, border points, and noise points.
	Step 2. Remove noise points.
	Step 3. Reachable is if the core point is within the epsilon radius, if connected, then join the reachable core points into one. If not, then create the new cluster for the new core points.
	Step 4. Border Point will search for nearest core point, then join that cluster.
