==Made by NJ23-1==

Neural network architecture that is usually used for image classification and identification. This architecture used convolutional layers to extract important features from images. This can be achieved by using filter/small kernel that is **shifted** through the entire picture to detect feature and patterns.

The magic of CNN:
![[Pasted image 20240721181118.png]]

4 main layers of typical DCNN:
- Convolutional Layer
- Pooling Layer
- Flatten Layer
- Fully Connected Layer

![[Pasted image 20240721173404.png]]

#### Convolution Layer
Hidden layer that contains several convolution units that extract features from a kernel with the specified size. One kernel will calculate for values in their own area *(applying the filter)*, so they will output one new value. The kernel will shifted through the entire space of the input data and the results will be saved into a **feature map** matrix.

Feature map (collection of output of the kernel) will represent the important features extracted from the input data.

**Strides**: Pergeseran yang ada untuk filternya berapa strides/step
![[Pasted image 20240721173615.png]]

**Padding**: We gives more padding / pixel outside of the border, filled with typically zero or ones (Tensorflow default uses zeros).

**Advantage**:
- Preserves Spatial Information
- Improved Model Performance

**Disadvantage**:
- Increased computational cost & memory usage

Types of paddings:
- **Valid Padding** (no padding)
  Not adding any extra element to the data (resulted in a smaller output size compared to the output)
- **Same Padding**
  Most commonly used
  Ensure that the output size matches the input size 

The number of units typically grows after each convolutional layer, see architecture image an the magic of CNN for better understanding.

#### Pooling Layer
Layers that is used to **reduce the number of dimension** in the feature map, this is executed without losing any important informations. Purpose: to fasten computations. 

**Max Pooling**: Searching for the biggest number in the filter
**Min Pooling**: Searching for the smallest number in the filter
**Average Pooling**: Searching for the average number in the filter

![[Pasted image 20240721181528.png]]

#### Flatten Layer
Layer that is used to flatten (reduce) the dimension of the data to be an array with **one dimension**. **Spatial data** (more than one dimension) is converted to be one dimensional data so that the data can be fed into the **fully connected layer**.

Example of converting 2D data to 1D:
![[Pasted image 20240721182310.png]]
#### Fully Connected Layers
Similar to what is being used in Multi Layer Perceptron, layer in neural network where every neuron is connected to every neuron in the previous layer. Softmax layer is a layer that was activated with softmax function for predictions.

![[Pasted image 20240721182543.png]]

# DCNN Architectures

Architectures of DCNN can be found from previous researchs and some arrangement of layers is found more effective. Architectures are made to combat some of the weakness DCNN typically have.

Some popular architectures are:
- ResNet
- AlexNet
- LeNet
- VGG
- GoogLeNet
- etc.

[CNN Architectures: LeNet, AlexNet, VGG, GoogLeNet, ResNet and more… | by Siddharth Das | Analytics Vidhya | Medium](https://medium.com/analytics-vidhya/cnns-architectures-lenet-alexnet-vgg-googlenet-resnet-and-more-666091488df5)

Example of problem that they are trying to solve:
- **Vanishing Gradient**
  Vanishing gradient occurs when gradients, which are used to update the network's weights during backpropagation, become extremely small or "vanish" as they propagate from the output layer to the earlier layers. This phenomenon slows down the training process significantly or even prevents the network from learning effectively.
  
  **Solution in Resnet**: Introduce skip connections that allow gradients to flow directly to earlier layers, bypassing some layers.

#### Reading Architectures Layers from papers

Resnet 18: [slc-post-training-deep-learning/Session 03. Convolutional Neural Networks/digit-recognition-using-resnet-18.py at main · vncnttan/slc-post-training-deep-learning (github.com)](https://github.com/vncnttan/slc-post-training-deep-learning/blob/main/Session%2003.%20Convolutional%20Neural%20Networks/digit-recognition-using-resnet-18.py)

![[Pasted image 20240721184752.png]]
![[Pasted image 20240721184115.png]]

