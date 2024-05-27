
## Introduction

**Dataset**
Group of data that will be used by our AI Model to learn

Dataset is divided into 3
1. Training set (approx. 60%)
   Used to train data into our model
2. Validation set
   Used to validate the training result, to try validate the model that was trained
3. Testing set
   Used by our model to predict

**Metric Evaluation**
Accuracy
Loss

**Model Classification**
How good our model is:
- Underfit: The model is not properly trained enough yet, it doesn't recognize the pattern enough
- Overfit: The model is trained very hard that it is accurate to only by the training data, it doesn't recognize 
- Balance Model

**Epochs**: 
Iteration of the data trained to the model

**Input Layer**
What is inputted, can be more than one node

**Hidden Layer**
Activation function, can be more than one node

**Output Layer**
What is outputted, can be more than one node

We are calculating which weight is suitable for the output that was wanted, we are adjusting bias value so that the output is 

`w0 * x0 + w1 * x1 + bias`

# What is preprocessing?
We want to delete unwanted/noise data by preprocessing

**Strides**: Pergeseran yang ada untuk filternya berapa strides/step
**Max Pooling**: Searching for the biggest number in the filter
**Padding**: We gives more padding / pixel outside of the border, either 0 or 1