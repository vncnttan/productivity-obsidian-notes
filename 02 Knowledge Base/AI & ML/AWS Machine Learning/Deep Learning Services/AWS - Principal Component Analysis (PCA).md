`Unsupervised Dimensionality Reduction`

→ Project higher-dimensional data into lower-dimensional while minimizing loss of information
→ The reduced dimensions are called components:
	First component has largest possible variability, second has the next largest, etc.

Training Input:
- recordIO-protobuf / CSV
- File / Pipe mode available  

- Covariance matrix is created, then SVD (Singular Value Decomposition)
- Two modes:
	- Regular → For sparse data and moderate number of observations and features
	- Randomized → For large number of observations and features
		- Uses approximation algorithm

Instance Types:"
- GPU / CPU
	- Depends on the “specifics of the input data”