Transformer is started from Machine Translation

Encoder and Decoder, iteratively generate the next word translation.
The encoder is consists of FFN and Self Attention

Transformer will give the number of output equals to the number of input. It will transform embedding from the original embedding to some features that have more context inside of them.

Attention Layer
Attention will give a value that the word is more connected to the other word in the sentence with the context.
![[Pasted image 20240504082424.png]]
For example, the word "it" is giving more attention to "The animal" because the it specifically revering to **the animal**, not **the street**

How Self Attention Works? -- Information Retrieval
![[Pasted image 20240504083246.png]]



Source
[The Illustrated Transformer – Jay Alammar – Visualizing machine learning one concept at a time. (jalammar.github.io)](https://jalammar.github.io/illustrated-transformer/)
