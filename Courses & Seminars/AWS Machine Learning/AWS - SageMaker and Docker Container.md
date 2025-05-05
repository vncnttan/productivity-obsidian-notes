[[Amazon Sagemaker]] + [[🛥️Docker]]

- All models in SageMaker are hosted in Docker containers
	- Pre-built deep learning
	- Pre-built scikit-learn and Spark ML
	- Pre-built Tensorflow, MXNet, Chainer, PyTorch
		- **Distributed training** only via Horovod / Parameter servers → doesn’t automatically support Multi-Machine GPU
	- Your own training and inference code! or extend pre-built image.
- This allows us to use any script/algo within SageMaker, regardless of runtime / language

![[🛥️Docker#Summary]]

|          Container Diagram           |                                                                                         |
| :----------------------------------: | --------------------------------------------------------------------------------------- |
| ![[Pasted image 20250505190331.png]] | Trained models are saved in S3 Model artifacts and runned by the script in docker image |

| Training Container Structure                                                                      | Inference Container Structure                                                     |
| :------------------------------------------------------------------------------------------------ | --------------------------------------------------------------------------------- |
| ![[Pasted image 20250505190533.png]]                                                              | ![[Pasted image 20250505191357.png]]                                              |
| - Everything lives in /opt/ml<br>- The actual script to run the code should be in opt/ml/code dir | - Everything lives in /opt/ml<br>- Deployment model should go in opt/ml/model dir |

##### Structure of the Docker Image 
**WORKDIR**
- nginx.conf → Webserver configuration
- predictor.py → The program that implements a flask web server (can be any other framework) for making predictions at runtime (customize your own code!)
- serve/ → program that will be started when the container is started (automatically generated file that launch GUnicorn server)
- train/ → program that is invoked when you run the container for training (model definition, creation, etc. put your code in this dir)
- wsgi.py → wrapper that is invoke when flask is served

`(inference & training can be combined / in separate docker image)`

##### DockerFile

``` Dockerfile
FROM tensorflow/tensorflow:2.0.0a0

RUN pip install sagemaker-training

# Copies the training code to inside the container
# Sagemaker expect all the code that need to be run for training is in /opt/ml/code
COPY train.py /opt/ml/code/train.py

# Defines train.py as script entrypoint (must specify!)
ENV SAGEMAKER_PROGRAM train.py
```

##### Common Environment Variables:
- SAGEMAKER_PROGRAM
	- Run a script inside /opt/ml/code
- SAGEMAKER_TRAINING_MODULE
- SAGEMAKER_SERVICE_MODULE
	- Loading up the tensorflow / mxnet module
- SM_MODEL_DIR
	- Model checkpoints are saved & pushed into S3
- SM_CHANNELS / SM_CHANNEL_* → \[TRAIN/TEST/VALIDATION]
	- Where train / test  / validation channel coming from
- SM_HPS / SM_HP_*
	- Define Hyperparameters that is exposed and can be tuned
- SM_USER_ARGS


##### Using your own image
> In this case, the image name is “foo”

``` python
cd dockerfile
!docker build -t foo

from sagemaker.estimator import Estimator
estimator = Estimator(image_name='foo',
							role='SageMakerRole',
			train_instance_count=1,
			 train_instance_type='local')
estimator.fit()
```
