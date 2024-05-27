Vincent Tanjaya
2602128346

#### Maximal Margin Classifier vs Soft Margin Classifier

SVM is a powerful machine learning method to do classification and regression, that uses a support vector as a base for the classification and regression. If a point falls on the area A in the hyperplane that is separated by the support vector, then it will be predicted as A, et cetera. 

##### Maximal Margin Classifier:
Find the widest possible margin (separator) between the hyperplane and the closest data points from each class in the training data.
It assumes the data is perfectly linear separable, meaning a straight line can perfectly divide the data points into their respective classes. 
Advantages:
- Simple
- Less prone to overfitting 
Disadvantages:
- Not realistic for most real-world datasets which often have noise / non-linear relationship
- Highly sensitive to outliers

##### Soft Margin Classifier:
Allows misclassification during training by introducing a penalty term. Acknowledges that real-world data might not be perfectly separable.
Advantages:
- More Robust
- Less Sensitive to outliers
- Can be more generalizable to unseen data by allowing flexibility in the decision boundary
Disadvantages:
- Requires choosing a cost parameter for the penalty term
- Might be slightly more complex due to allowed misclassification
