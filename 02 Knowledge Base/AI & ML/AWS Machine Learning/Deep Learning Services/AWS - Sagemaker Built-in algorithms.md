### Linear Learner
- Linear regression
	- Fit a line to your training data (can be curved)
	- Predications based on that line
- Can handle both regression (numeric) predictions and classification predictions
	- For classification, a linear threshold function is used.
	- Can do binary or multi-class
- Input: 
	- RecordIO-wrapped protobuf Float32
	- CSV
	- File or Pipe mode both supported

- Preprocessing:
	- Normalized
	- Shuffled
- Training
	- SGD
	- Choose optimization algorithm
	- Multiple models are optimized in parallel
	- Tune L1, L2 regularization

- Instance Type:
	- **Single / Multi Machine** CPU / GPU
	- Multip-GPU does not help → many machine of GPU help


- Example: Simple Handwritten Digit Recognition