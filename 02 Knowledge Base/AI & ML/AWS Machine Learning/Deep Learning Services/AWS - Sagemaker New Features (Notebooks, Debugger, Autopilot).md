`Visual IDE for machine learning`

##### SageMaker Notebooks `(Google colab alternatives)`
- Create & share Jupyter notebooks with sagemaker studio
- Switch between hardware configurations (no infrastructure to manage)

##### SageMaker Experiments:
- Organize, capture, compare, and search your ML jobs

##### SageMaker Debugger
- Saves internall model state at periodic intervals 
	- Gradent / tensors over time as model is trained
	- Define rules for detecting unwanted conditions while traiing
	- Debug job is run for each rule
	- Logs & fires a CloudWatch event when the rule is hit
- SageMaker Studio Debugger dashboards *(integration to SageMaker Studio)*
- Auto-generated training reports
- Built-in rules
	- Monitor system bottlenecks
	- Profile model operations
	- Debug model parameters

- Supported Framework:
	- Tensorflow
	- PyTorch
	- MXNet
	- XGBoost
	- Sagemaker Generic Estimator
- Debugger API available for Github
	- Construct hook & rules 
		- CreateTrainingJob
		- DescribeTrainingJob
	- SMDebug → client library to register hooks for accessing training data

New Features in Sagemaker Debugger
- Sagemaker Debugger Insights Dashboard
- Debugger ProfileRule
	- ProfilerReport
	- Hardware system metrics
	- Framework metrics 
- Built-in actions
	- StopTraining(), Email(), or SMS()
	- In response to Debugger Rules

##### SageMaker Autopilot
`Wrapper for AutoML`
- Automates:
	- Algorithm selection
	- Data preprocessing
	- Model tuning
	- All infrastructure
- Does all the trial & error for you

Workflow:
- Load Data from S3 for training
- Select targe column for prediction
- Automatic model creation
- Model notebook is available for visibility & control
- Model leaderboard 
	- Ranked list of recommended models
	- You can pick one
- Deploy & monitor the model

misc.
- Can add in human guidance
- With / without code in Sagemaker Studio / AWS SDKs
- Problem Types:
	- Binary Classification
	- Multiclass Classification
	- Regression
- Algorithm Types for HPO:
	- Linear Learner
	- XGBoost
	- Deep Learning (MLP’s)
	- Ensemble Mode

Autopilot Training Modes
- HPO (Hyperparameter Optimization)
	- Select algorithm most relevant to the dataset
	- Select best range of hyperparameters (runs up to 100 trials)
		- Bayesian optimization used if data < 100MB
		- Multi-fidelity optimization if > 100MB → Early stopping if perofming poorly
- Ensembling
	- Trains several base model using AutoGluon library
		- Wider range of models, including more tree-based and NN algo
	- Runs 10 trials with different model and parameter settings
	- Models are combined with a stacking model ensemble method
- Auto
	- HPO if data > 100 MB,, else Ensembling
	- Autopilot needs to be able to read the size of the dataset,, if not, default: HPO. How this can happen:
		- S3 bucket hidden inside a VPC
		- S3DataType is ManifestFile
		- S3URI contains more than 1000 items

Integrates with SageMaker Clarify → Tells how each feature went into the predictions
- Transparency on how models arrive at predictions
- Feature attribution
	- Use SHAP Baselines
	- Research from cooperative game theory
	- Assigns each feature an importance value for a given prediction