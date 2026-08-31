## Regularization

Regularization is a technique that are used to calibrate the machine learning models in order to minimize the adjusted loss function and prevent overfitting and underfitting. Overfitting occurs when a machine learning model learns irrelevant details from the training data that don't generalize well to new data. This leads to poor performance on unseen data. 

Regularization is a technique used to combat overfitting by adding a penalty to the model's loss function. This penalty encourages the model to be simpler and focus on capturing broader patterns in the data.

## L1 Regularization (Lasso Regression)
L1 Regularization adds a penalty to the loss function that's proportional to the magnitude (absolute value) of the model's coefficients. This penalty encourages the model to have many coefficients close to zero, effectively making the model simpler.

` Loss = Loss_data + λ * Σ |w_i| `
Loss_data: The loss function without regularization
λ: Hyperparameter controlling the strength of regularization
w_i: Coefficients of the model


## L2 Regularization (Ridge Regression)
L2 Regularization adds a penalty to the loss function that's proportional to the square of the magnitude of the model's coefficients. This penalty encourages the model to have smaller coefficients, but not necessarily zeroes like L1 Regularization.

` Loss = Loss_data + λ * Σ w_i^2 `
Loss_data: The loss function without regularization
λ: Hyperparameter controlling the strength of regularization
w_i: Coefficients of the model