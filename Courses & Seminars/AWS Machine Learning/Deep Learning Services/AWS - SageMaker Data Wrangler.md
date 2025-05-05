`ETL pipeline that is baked into SageMaker Studio` → Similar to [[Glue ETL]]

- Visual Interface to prepare data for machine learning
- Import Data
- Visualize Data
- Transform Data 
	- (300+ transformations)
	- Integrates with pandas, pyspark, pyspark SQL
- Quick Model: Train model with data and measure its results
- Code Generation Tool → Create an endpoint where it dumps this data too (can be :
	- SageMaker Processing → train a model, 
	- SageMaker Pipelines → a part of larger process, 
	- SageMaker Feature Store → to make these transformed feature available to other model)

![[Pasted image 20250501150532.png]]


Common Problems:
- Studio User doesn’t have appropriate IAM roles
- Data source allow Data Wrangler Access
	- AmazonSageMakerFullAccess policy
- EC2 instance limit
	- The following instance type is not available… error
	- May need to request quota increase
	- Services Quotas / Amazon SageMaker / Studio Kernel Gateways Apps → Wait for approval     