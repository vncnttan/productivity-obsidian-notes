`EMR supports Apache MXNet and GPU instance types`

- P3: 8 Tesla V100 GPU’s (stronger)
- P2: 16 K80 GPU’s (recommended for experimentation and cheaper)
- G3: 4 M60 GPU’s (all NVIDIA Chips)
- G5g: AWS Graviton 2 processors / NVIDIA T4G Tensor Core GPU’s
	- Not yet available for EMR
	- Originally used for Android Game Streaming
- P4d: A100 “UltraCluster” for supercomputing


or you can use Deep Learning AMI’s


##### Machine Learning Instance Type
- Trn1 instances
	- “Powered by Trainium” 
	- Optimized for training (50% savings) 
	- 800 Gbps of Elastic Fabric Adapter (EFA) networking for fast clusters