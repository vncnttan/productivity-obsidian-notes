`Optimized compiler training jobs on GPU instances`
- Integrated into AWS Deep Learning Containers (DLCs)
	- Can’t bring your own container
- Accelerate training up to 50%
- Converts models into hardware optimized instructions
- Tested with Hugging Face Transformers library / bring your own model

- Incompatible with Sagemaker Distributed Training Libraries

- **Best Practices**
	- GPU Instances (ml.p3 / ml.p4)
	- PyTorch must use PyTorch/XLA’s model save function
	- Enable debug flag in compiler_config → to enable debugging
