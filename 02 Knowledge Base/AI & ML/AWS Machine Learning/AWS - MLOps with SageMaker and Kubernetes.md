`Integrates SageMaker with Kubernetes-based ML infrastructure`

Two options:
- Amazon SageMaker Operators for Kubernetes
- Components for Kubeflow pipelines


- Enables hybrid ML workflows (on-prem + cloud)
- Enables integration of existing ML platform built on Kubernetes/Kubeflow


##### Option 1: Amazon SageMaker Operators for Kubernetes
![[Pasted image 20250513171644.png]]
 Utilizes: **Amazon Elastic Kubernetes Service (EKS)**
`Creates SageMaker jobs natively using Kubernetes API`


##### Option 2: SageMaker Components for Kubeflow Pipelines
![[Pasted image 20250513172025.png]]
`Separate components available for each steps:`
- Spark container for **Processing**
- SageMaker **Hyperparameter Tuning**
- SageMaker **Training**
- SageMaker Hosting (**Inference**)

##### Option 3: SageMaker Studio’s native MLOps solution with CI/CD
`Without kubernetes and using SageMaker only`
![[Pasted image 20250513172457.png]]
- Build images 
- Prep data, feature engineering 
- Train models 
- Evaluate models 
- Deploy models 
- Monitor & update models


- SageMaker Projects uses code repositories for building & deploying ML solutions
- **SageMaker Pipelines** define steps and chain them together

![[Pasted image 20250513172817.png]]