Deep Learning model that focuses on unsupervised learning

**Generative Deep Learning** model that focuses on the ability to generate new data that is similar to the training data that is used to train the model.

**Boltzman Machine** does not have any output layer, because the model does not generate any output value, but creating a model that creates description about the observed system.

Extremely difficult due to the complex dependencies between units.

![[Pasted image 20240722153116.png]]

Disadvantages:
- High Complexity
- Very High Training Difficulty
- Limited Practicallity

To combat these disadvantages, **Restricted Boltzman Machine** is invented. The restriction on connectivity in RBMs make them significantly more practical for real-world applications while still maintaining powerful capabilities.

# Restricted Boltzmann Machine (RBM)

**Key Restriction**: No connections between units within the same layer (visible or hidden)
- Simpler
- Effective
- Often used as the foundation for deeper architectures like Belief Networks

Structure: 
- Visible Units
  Represent input data
- Hidden Units
  Learn complex patterns and representations of the input data.

TODO: How does RBM work?
