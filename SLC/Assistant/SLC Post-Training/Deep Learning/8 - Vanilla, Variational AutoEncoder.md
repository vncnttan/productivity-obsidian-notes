Unsupervised Artificial Neural Network that learns how to efficiently compress and encode data then learns how to reconstruct the data back from the reduced encoded representation to a representation that is as close to the original input as possible.

![[Pasted image 20240723052951.png]]
- **Encoder**
  Receive original input to encode the input to smaller dimension
- **Latent Space**
  Compressed representation that is outputted from the **encoder**. When fed into the **decoder**, it will try it best to reconstruct the input
- **Decoder**
  Return back the format/dimension (decoding) to generate the appropriate output

![[Pasted image 20240723053121.png]]


# Vanilla Autoencoder
Appropriate for non complex data
- Consists of one layer encoder and one layer decoder 
- Loss Calculation: Reconstruction Loss.

![[Pasted image 20240723053301.png]]

**One of the problem with Vanilla Autoencoder**:
Points on the latent space is **non-continuous**, can create problem on reconstructing back because there was a hole on the information given.

![[Pasted image 20240723053423.png]]

When there are slight different on the input image, it will not recognize the image so well.

Solution: **Variational Autoencoder**

# Variational Autoencoder
Type of autoencoder that learns by compressing data with encoder and decoder and introducing a **probabilistic** approach to the encoding process. This enables model to generate new data points with similar properties to the training set.

The value in the latent space is consists of two part:
- Mean value
- Standard Deviation value

Mean value & Standard deviation then is used to create samples by using the reparameterization trick. This sample then will be fed into the decoder.
![[Pasted image 20240723054135.png]]

**How Variational Autoencoder can fix the problem?**
Latent space will be defined as a mean and standard deviation (**probabilities**), not a point. So, when trying to reconstruct the image and it falls on a point in the area of the latent space, it will recognize them.

![[Pasted image 20240723054239.png]]


#### Reparameterization Trick
Reparametrized form is used for the model in back propagation so that z is **deterministic**. 

One of the rules of backpropagation is that the node must be **deterministic**, but when introducing mean and standard deviation, the z become probabilistic. So epsilon is introduced to convert the autoencoder from the original form to the reparameterised form.

![[Pasted image 20240723054526.png]]


#### Loss Calculation:
VAE introduces **Kullback Leibler Divergence** that measures of how one probability distribution differs from a second, reference probability distribution. In simpler terms, it quantifies the "distance" between two probability distributions.

**KL divergence is crucial in VAEs for ensuring the latent space is well-structured and informative.**

- **KL Divergence as a Regularizer:** 
  KL divergence measures the difference between the learned posterior distribution of the latent code (given the input data) and the prior distribution. By minimizing this divergence, the model is pushed to produce latent codes that are closer to the prior, promoting a well-structured latent space.

![[Pasted image 20240723055037.png]]
