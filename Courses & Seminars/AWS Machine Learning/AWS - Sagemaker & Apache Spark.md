`Use sagemaker capabilities within Apache Spark`

Use spark notebook code to:
- Pre-process data as normal with Spark
	- Generate DataFrames
- Use sagemaker-spark library
- SageMakerEstimator *(MLLib alternative)*
	- KMeans, PCA, XGBoost
- SageMakerModel


How to:
- Connect notebook to a remote AWS EMR cluster / Zepellin
- Training dataframe should have:
	- Features (vector of doubles)
	- Label (vector of doubles)
- Call fit on SageMakerEstimator to get a SageMakerModel
- Call transform on SageMakerModel to make inferences

> Works with Spark Pipelines as well


