Machine Learning

Generative Classifier: Understanding what dogs and look like and what cats look like, berarti dia akan ada probabilitas ini berapa kemungkinan kucing dan anjing

Discriminative Classifier - Trying to learn distinguish the classes without learning much about them (Jadi dia langsung dibedain aja tanpa memahami secara langsung)

Logistic Regression
- Metric: How close the current label is to the true gold label
- Optimization algorithm: Iteratively updating weights so as to minimize the loss function

![[Pasted image 20240423111924.png]]
Tinggal dikali aja weight dengan xnya, lalu masukkan ke function sigmoid

Perlu belajar: Praktek Gradient Descent

Softmax

---



Logistic Regression: Predict yes/no

Binomial / Multinomial -> The difference is the amount of variables used

b0, b1, b2 awalnya bebas

Log likelihood buat logaritma dari probability, fungsinya untuk nentuin solver decision variables (b0, b1, b2)

Logit
![[Pasted image 20230829133950.png]]

Exponential of Logit
![[Pasted image 20230829134828.png]]


Probability Value
![[Pasted image 20230829134730.png]]

Log Likelihood
![[Pasted image 20230829134700.png]]

![[Pasted image 20230829135034.png]]