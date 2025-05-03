- `Object & scene detection`
- `Image moderation`
- `Facial analysis`
- `Celebrity recognition`
- `Face comparison`
- `Text in image`
- `Video analysis`
	- Objects / people / celebrities marked on timeline
	- People pathing

Specifics:
- Images come from S3 / provide image bytes as part of request 
- Video must come from Kinesis Video Streams
	- H.264 encoded
	- 5-30 FPS
	- Favor resolution over framerate
- Can use with Lambda to trigger image analysis upon upload

![[Pasted image 20250503161049.png]]


