`The heart of implementing machine learning in AWS`
##### Recommended Machine Learning Workflow
![[Pasted image 20250404195256.png]]

![[Pasted image 20250404195509.png]]

### Sagemaker Notebooks can direct the process
- Notebook instances on EC2 are spun up from the console
	- S3 data access
	- scikit_learn, Spark, Tensorflow
	- Wide variety of built-in models
	- Ability to spin up training instances
	- Ability to deploy trained models for making predictions at scale

### Sagemaker Console
- See how models are doing


### Data Prep on Sagemaker
- Data usually comes from S3
	- Ideal format varies with algorithm, often it is RecordIO / Protobuf
- Can also ingest from
	- Athena
	- EMR
	- Redshift
	- Amazon Keyspaces DB
- Apache Spark integrates with Sagemaker
- Many library is integrated within the notebook (pandas, numpy, etc.)

![[Pasted image 20250404201239.png]]

### Training on Sagemaker
- Create a training job
- There is many training options, including Built-in training algorithms, Spark MLLib, Custom Python Tensorflow, Custom Docker Image, XGBoost, Huggingface, and many others!

### Deploying Trained Models
- Save trained model to S3
- Can deploy in two ways:
	- Persistent endpoint for making individual predictions on demand
	- Sagemaker Batch Transform to get predictions for an entire dataset
- Lots of cool options 
	- Inference Pipelines for more complex processing 
	- SageMaker Neo for deploying to edge devices 
	- Elastic Inference for accelerating deep learning models 
	- Automatic scaling (increase # of endpoints as needed) 
	- Shadow Testing evaluates new models against currently deployed model to catch errors