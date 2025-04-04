`eXtreme Gradient Boosting` → Boosted group of decision trees

[[Ensemble - Machine Learning]]

- Input:
	- CSV / libsvm
	- recordIO-protobuf and parquet as well
- Serialized & Deserialized using Pickle
- Can be used as a framework within notebooks
- Instance Type:
	- Memory Bound not comput-bound
	- M5 is a good choice
	- As of XGBoost 1.2, single instance GPU training is available
		- For example P2, P3
		- Must set tree_method to gpu_hist
		- Trains more quicky and cost effective
	- XGBoost 1.5+: Distributed GPU Training