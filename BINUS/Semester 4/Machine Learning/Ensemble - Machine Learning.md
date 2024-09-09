#### Ensemble Learning
Metode untuk membuat beberapa model, lalu digabungkan dengan harapan untuk mendapatkan hasil lebih baik. 
Menggabungkan strength dari beberapa model simple yang lemah (*weak learners*) 

###### Bagging
Bootstrap & Aggregating
![[Pasted image 20240708215844.png]]


Bootstrapping: Mengambil sample populasi dari beberapa group
Masing-masing model **membuat vote** untuk hasil prediksi yang dilakukan
`contoh: Random Forest Classifier (RFC)`

Fungsi: Mengurangi variance di dalam dataset yang memiliki value tidak berarti (noisy dataset)
Contoh di RFC adalah ketika di task classification ada kolom dengan strong predictor, di Random Forest ada beberapa tree yang tidak memiliki kolom tersebut sebagai feature, sehingga feature yang strong predictor tidak mendominasi fitur-fitur lainnya.

Bagging Prediction
Estimasi test error dari Baggin didapatkan menggunakan OOB (Out of Bag) observations. 


###### Boosting
Takes multiple weak learneers to make stronger model with lower bias
![[Pasted image 20240708215827.png]]
Boosting bekerja dengan memasukkan data menuju ke beberapa weak learners secara berurutan. Weak learners disebut dengan stump, dan hasil dari stump akan dimasukkan ke stump berikutnya. Hal ini menyelesaikan permasalahan Bias-Variance Trade off

- Adaptive Boosting
  Initialize all stump with equal weights to all data
  Then all of the stump is trained all at once
- Gradient Boosting
  Trees are created one at a time, existing trees aren't changed
  Gradient Descent is performed to minimize loss

###### Voting
Combining strengths of different models

![[Pasted image 20240708221013.png]]
- Hard Voting: Winner takes all system, the majority output is taken
- Soft Voting: Every classifier's output are taken into account (each class has a percentage), final classification is the one with highest probability

###### Stacking
![[Pasted image 20240708221750.png]]
Training a new learning algorithm to combine the predictions of several base learners

The meta-learner (used to combine the predictions of several strong base learners) will be used to predict the correct class
