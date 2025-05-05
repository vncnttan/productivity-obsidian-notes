`Creates low-dimensional dense embeddings of high-dimensional objects` → ***Encoding***

Use cases:
- Compute nearest neighbors of objects
- Visualize clusters
- Genre prediction
- Recommendations (similar items or users)

Training Input:
- Data must be tokenized into integers
- Training data consists of pairs of tokens 
	- Sentence - sentence
	- Labels - sequence (example: List of users and all of the music lists they listen to)

![[Pasted image 20250405162950.png]]

Instance Type:
- Train on a single machine:
	- CPU / GPU, multi-GPU OK
	- ml.m5.2xlarge 
	- ml.p2.xlarge 
	- If needed, go up to ml.m5.4xlarge or ml.m5.12xlarge 
	- GPU options: P2, P3, G4dn, G5 
- Inference: use ml.p3.2xlarge 
	- Use INFERENCE_PREFERRED_MODE environment variable to optimize for encoder embeddings rather than classification or regression.