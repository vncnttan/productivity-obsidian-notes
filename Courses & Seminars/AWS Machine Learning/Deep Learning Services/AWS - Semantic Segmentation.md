`Pixel-level object classification`
→ Produces a segmentation mask

Training Input:
- Training and Validations: JPG and PNG images with annotations
	- Label maps to describe annotations
	- Augmented manifest image format supported for Pipe mode
- JPG images accepted for inference

- Built on MXNet Gluon and Gluon CV
- Algorithms:
	- Fully-Convolutional Network (FCN)
	- Pyramid Scene Parsing (PSP)
	- DeepLabV3
- Choice of backbones:
	- ResNet50
	- ResNet101
	- Both trained on ImageNet
- Support incremental training / training from scratch

Instance Types: 
- Training: GPU
	- P2, P3, G4dn, G5
	- Single machine only
- Inference: CPU (C5 or M5) / GPU (P3 or G4dn)