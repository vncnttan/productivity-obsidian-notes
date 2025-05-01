`No-code machine leraning for business analysts`

- Upload CSCV data → select target column → build model & make predictions
	- Can join dataset
	- Classification / Regression
	- Automatic data cleaning 
		- Missing values
		- Outliers
		- Duplicates
	- Share models & datasets with SageMaker Studio

 - Local file uploading from S3 must be setup with appropriate CORS permission
 - Canvas lives within a Sagemaker Domain that must be manually updated
 - Integration:
	 - Okta SSO → Automatic permission for guest
	 - Redshift
	 - Time Series Forecasting (enabled via IAM)
	 - VPC
 - Pricing: $1.09 / hr plus a charge based on number of training cells in a model