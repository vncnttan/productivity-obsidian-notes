`Unsupervised clustering by dividing data into k-groups`

[[K-Means]]
→ Usually uses measured by Euclidean distance

AWS Exclusive: Web-scale K-Means clustering

Training Input:
- Train channel, optional test
	- Train SharedByS3Key, Test FullyReplicate
- recordIO-protobuf / CSV
- File / Pipe available


- Work by optimizing the center of K clusters
	- “extra cluster centers” → can be used to improve accuracy (start big, but end up getting reduced to k over time)
- Initial cluster center:
	- Random
	- K-means++ (tries to make initial clusters far apart)
		- Lloyd methods is used for reducing extra cluster center if uses k-means++ algorithm

> Choosing K! using elbow method to optimize tightness of clusters

Instance Types:
- CPU / GPU (recommended CPU)
- Only one GPU per instance used on GPU
	- GPU: ml.g4dn.xlarge 
	- CPU: p2, p3, g4dn, and g4 supported