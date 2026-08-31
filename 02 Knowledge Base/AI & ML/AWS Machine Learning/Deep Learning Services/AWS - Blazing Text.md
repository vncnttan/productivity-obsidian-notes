Only can be used for:
- Supervised Text Classification → Blazing Text can only be used for sentences, not documents 
- Word2Vec → This too only works on individual words, not sentences or documents

Training Input:
- Supervised Mode (for classification): 
	- One sentence per line
	- First word is the string
	  \_\_label\_\_<sentiment\> \<sentence> 
	  example → \_\_label\_\_4 i love this course …
- Augmented Manifest Text Label (for classification):
	- {“source”:  “i love this course“, “label”: 1}

- Word2Vec → Just text file with one training sentence per line

Word2Vec modes:
- CBow (Continuous Bag of words) 
- Skip-Gram 
- Batch skip-gram → Can be distributed over many CPU nodes

Instance types:
- For cbow and skipgram, recommend a single ml.p3.2xlarge
	- Any single CPU or single GPU instance will work
- For batch_skipgram, can use single or multiple CPU instances
- For text classification, C5 recommended if less than 2GB training data. For larger data sets, use a single GPU instance (ml.p2.xlarge or ml.p3.2xlarge)