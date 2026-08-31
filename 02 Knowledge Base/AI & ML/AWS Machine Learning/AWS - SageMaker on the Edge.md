`Deploying SageMaker model to edge devices`

##### SageMaker Neo
`Train once, run anywhere`

Optimizes code for specific devices → Deployed locally on the machine to minimize latency
- Supports Tensorflow, MXNet, PyTorch, ONNX, XGBoost, DarkNet, Keras
- Consists of a compiler and a runtime

#### Neo + AWS IoT Greengrass
`Option1: Neo-compiled models can be deployed to an HTTPS endpoint`
- Hosted on C5, M5, M4, P3, or P2 instances
- Must be smae instance type used for compilation

`Option2: Deploy through IoT Greengrass`
- Get the model to an actual edge device
- Inference at the edge with local data using model trained in the cloud
- Uses Lambda inference applications