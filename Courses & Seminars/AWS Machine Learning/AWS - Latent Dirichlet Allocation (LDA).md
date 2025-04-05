`Unsupervised topic modelling algorithm (to non-human readable topics)`

usage is the same as [[AWS - Neural Topic Model]], but can be used for other things than words like Cluster customer based on purchases/harmony analysis in music

Training Input:
- recordIO-protobuf / CSV
	- Tokenize!
	- Each document must be with word count
- Pipe model only supported with recordIO

- Optional test channel can be used for scoring results

Instance Type:
- Single CPU only!