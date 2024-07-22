Model training method which uses unlabeled data, similar to unsupervised learning.
The difference are:
- Unsupervised Learning: Search pattern on the input data to do **clustering**
- Self-Supervised Learning: Learn structure input data to **generate labels**

**Why Self-Supervised Learning**:
- Labeled data reliability reduced
- Resource for labeled data reduced
- Limitation on labeled datas

2 Primary Steps:
- Pre-text task
- Downstream task (knowledge transfer)

![[Pasted image 20240722103934.png]]

# Pretext Task
Training that is executed by model that is **different** or **varied** from the **main task** of the model.

Example: 
- **Main Task**: Animal Recognition from image
- **Pretext Task**: 
	- Colorizing a black and white images
	- Solving Jigzaw Puzzle
	- Inpainting
	- Predicting relative position
	- Estimating rotation angle
	- and many more..!

![[Pasted image 20240722104242.png]]
This task can help models recognize the elements that can be important on animal recognition, such as the relative position of the features of the animal, the color of the animal, etc.

# Downstream Task / Knowledge Transfer

Using pretext task model by **changing the output layer** to adapt for the **main task**.

![[Pasted image 20240722112622.png]]


# Multi Head Attention
Mechanism used in neural networks, particularly transformer models, that allows the model to focus on different parts of the input sequence simultantenously. It's essentially **multiple attention mechanisms** working in parallel.

![[Pasted image 20240722145603.png]]

**How it works?**
- **Splitting the input**
  The input is divided to multiple parts (heads)
- **Independent attention calculations**
  Each head performs its own attention calculatiion, focusing on different aspects of the input.
- **Concatenation**
  The outputs from all heads are concatenated
- **Linear Transformation**
  The concatenated output is transformed into the desired output dimension

![[Pasted image 20240722144121.png]]

Behind the scene of Multi head attention:
1. Mapping inputs onto the outputs
2. Changing matrix/vector dimensions

![[Pasted image 20240722145303.png]]

![[Pasted image 20240722145739.png]]
