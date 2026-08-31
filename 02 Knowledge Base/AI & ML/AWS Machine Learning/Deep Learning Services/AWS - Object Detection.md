`Identify all objects in an image with bounding boxes`

Can train from scratch or use pre-trained models based on imageNet

Two variants: 
- MXNet 
	- CNN with Single Shot multibox Detector algorithm (SSD)
		- VGG-16 / RESNET-50
	- Transfer learning mode / incremental training
	
- Tensorflow
	- Uses ResNet, EfficientNet, MobileNet from the Tensorflow Model Garden

Training Input:
- RecordIO / Image Format (JPEG, PNG) → MXNet
	- With image format, supply a JSON file for annotation data for each image
- Varied for which model is selected → Tensorflow

Instance Type:
- Training: GPU instances
	- Multi-GPU and Multi-machine GPU OK
	- ml.p2.xlarge, ml.p2.16xlarge, ml.p3.2xlarge, ml.p3.16xlarge, G4dn, G5
- Inference: CPU/GPU Inference
	- M5, P2, P3, G4dn all OK