`Simple classification / regression algorithm`
Algorithm: [[K-Nearest Neighbor]]

Regression → The average value of K closest points to a sample

Training Input: 
- recordIO-protobuf / CSV
- File / Pipe mode available

Misc
- Data is sampled 
- Dimensionality Reduction Stage:
	- Avoid sparse data → can affect of noise / accuracy
	- “sign” / “fjlt” methods
- Build an index for looking up neighbors
- Serialize the model

Instance Type:
- Train on CPU / GPU
	- Ml.m5.2xlarge
	- Ml.p2.2xlarge
- Inference
	- CPU for lower latency
	- GPU for higher throughput on larger batches