[[Common EDA Python Libraries]]
The main reason:
- Detection of mistakes
- Checking of assumptions
- Preliminary Selection of appropriate models
- Determining Relation

Attribute
Sample
Type Attribute: [[Defining Variables]]
Outlier Analysis

### Univariate -> Analisis per kolom
Univariate non-graphical EDA
- Central Tendency: mean, median, modus. Best for categorical data
- Spread: Variance, Std, Q1 Q2 Q3 
- Skewness and Kurtosis
  Skewness: 0 = Symmetrical Distribution
![[Pasted image 20240219141612.png]]
	Kurtosis: Keruncingan


Univariate graphical EDA
![[Pasted image 20240219143238.png]]
- Histograms 
	Discretization -> Mengconvert data numerical menjadi categorical 
- Boxplots
	Interquartile Range -> Selisih Q3 dengan Q1
	Outlier bila lebih dari 1.5 Quartal


### Mulivariate -> Analisis menggunakan beberapa kolom
Multivariate non-graphical EDA
- Cross Tabulation
- Correlation: Relation between two variables -> Semakin linear semakin mendekati 1

Mulivariate graphical EDA
- Scatterplots
![[Pasted image 20240219143458.png]]
Correlation Coefficient semakin liner semakin mendekati 1 atau -1

Correlation Matrix -> Menggambarkan korelasi antar 2 attribute
Fungsi: Mau mencari atribut mana saja yang mempengaruhi atribut tujuan
Jika 2 variable independen memiliki korelasi tinggi, bisa saja menjadi redundan