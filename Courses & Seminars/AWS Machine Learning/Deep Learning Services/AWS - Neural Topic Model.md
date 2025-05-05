`Unsupervisedly organize documents into topics (to non-human readable topics)` → using Neural Variational Inference

Training Input:
- recordIO-protobuf / CSV
	- must be tokenized into integers
	- every document must contain a count for every word in the vocabulary in CSV
- File / Pipe mode

- Define how many topics you want in the end
- Latent representation based on top ranking words
- One of two topic modelling algorithm in sagemaker

Inference Types: 
- CPU / GPU
- GPU recommended for training, CPU OK for inference