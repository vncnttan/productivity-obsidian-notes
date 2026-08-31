`Unsupervised anomaly detection`

- RecordIO-protobuf / CSV
- Can use File or Pipe mode on either
- Optional test channel for computing accuracy, precision, etc. for labeled data

- Forest Tree → Each tree si a partition of the training data
	- Look at expected change in complexity of the tree as a result of adding a point into it
- Data is sampled randomly

Instance Type:
- Does not take any advantage of GPUs
- Training: M4, C4, or C5
- Inference: ml.C5.xl