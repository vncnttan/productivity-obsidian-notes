- SVM
- Ensemble Learning
- MLOps
- Case: PCA + Clustering (+ EDA & Preprocessing)


#### Support Vector Machine (SVM)

`Linearly Separable`: Class dari prediktor terpisah satu sama lain dan tidak menyatu, dan bisa dibuat garis pembatas diantara seluruh classnya
![[Pasted image 20240708193453.png]]

`Separating Hyperplane`: Garis yang memisahkan class-class tersebut


1. Maximal Margin Classifier
	*Hanya cocok untuk Linearly Separable data*  
    Fungsi: Klasifikasi
    Cara klasifikasi dengan membuat sebuah garis margin (dengan minimal distance dengna hyperplane) terjauh dari seluruh class
    
    Cara: 
    - Ambil point yang dekat memisahkan class A dan B (Support Vector)
    - Margin -> Di tengah-tengah antara point tersebut
      
    Sensitif terhadap outlier
    
2. Support Vector Classifier (Soft-Margin)
	*Ketika kedua class non-linearly separable, tidak ada garis yang mungkin untuk memisahkan kedua class*
	Ide: Memperbolehkan misklasifikasi selama training untuk mengeneralisasi data hasilnya
	Support Vector yang digunakan: Beberapa point di edge yang berada di dalam soft margin
	
	Cara kerja: 
	- Setiap data point memiliki slack variable e(i) yang memperbolehkan beberapa data point berada di sisi margin atau separating hyperplane yang salah
	- ![[Pasted image 20240708194634.png]]
	
	Cross Validations dapat digunakan untuk menetukan soft margin terbaik
  
3. Support Vector Machine (SVM)
    Idea: Mapping to a higher dimesion, lalu mengembalikannya ke dimension semula
    
    SVM mendukung penggunaan non-linear terms untuk menghindari masal linear effects.
    ![[Pasted image 20240708195101.png]]

4. Support Vector Regressor (SVR)
   ![[Pasted image 20240708195407.png]]

Kernel Functions
Simulate the calculations without needing to add extra dimensions
- Gaussian RBF Kernel
- Sigmoid Kernel
- Polynomial Kernel

Good to know:
![[Pasted image 20240708195540.png]]
