`Used to deal with sparse data`

Examples: 
- Click prediction
- Item Recommendations
	- Since individual user doesn’t interact with most pages / products → the data is parse

- Supervised
	- Classification / Regression
Limited to pair-wise interactions


Input
- recordIO-protobuf with Float32
	- Sparse data means CSV is inneffective!

Finds factors we can use to predict a classification → Use it to make a matrix representings some pair of things

Intance Types
- CPU recommended
- GPU only works with dense data → but when dealing with dense data, other approach are recomended