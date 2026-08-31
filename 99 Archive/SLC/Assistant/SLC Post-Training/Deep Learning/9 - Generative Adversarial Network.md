==Made by NJ23-1==

Artificial intelligence algorithm used in **unsupervised machine learning** that consists of two networks:
- Generator
- Discriminator
which are trained simultantenously through adversarial training.

![[Pasted image 20240723100653.png]]
# How do GANs work?
1. **Generator (G)**
   Generates new data instances, takes random noise as input and transforms it into data that ideally should be distinguishable from real data.
2. **Discriminator (D)**
   Evaluates the **generated data** (from generator) and **real data**. Distinguish between real and generated data, essentially acts as a binary classifier, assigning a probability that a given instance is real.

# How GANs trained?
The training involves a constant back-and-forth between the generator and discriminator
- **Generator Training**
	- Create synthetic data, try to make it as realistic as possible
	- Fed the generated data to discriminator
- **Discriminator Training**
	- Evaluates both real and the generated data (from discriminator) trying to correctly classify them.
	- **Goal**: Discriminator become adept at distinguishing between real and generated data.
- The process will be continued iteratively, with the generator and discriminator improving their abilities through this adversarial feedback loop.
- **Ultimate aim**: Generator create data that is indistinguishable from real data, fooling the discriminator. 


# Deep Convolutional Generative Adversarial Networks (DCGANs)
Specific type of GAN designed for image generation. DCGANs were introduced to address challenges related to the training and stability of GANs when applied to image synthesis tasks. 

DCGANs incorporate **convolutional layers** in both the generator and discriminator, leveraging the power of CNN to handle spatial hierarchies and capture local patterns in images.

- **Convolutional Layers**
  DCGANs use convolutional layers in the architecture of both the generator and discriminator
- **Strided Convolution** and **Transposed Convolution**
  Strided convolution used in the ==discriminator== to **downsample the spatial dimensions** of the input while **transposed convolution** (fractionally strided convolution/deconvolution) is used in ==generator== to **upsample the spatial dimensions**.

![[Pasted image 20240723104819.png]]
