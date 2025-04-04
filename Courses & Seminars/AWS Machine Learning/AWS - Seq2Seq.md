`Input a sequence of token and output a sequence of token`

Input:
- RecordIO-Protobuf (Tokens must be integers)
- Start with tokenized text files
- Convert to protobuf using sample code 
  → Must provide: 
	- Training data
	- Validation Data
	- Vocabulary Files 

Can be optimized on:
- Accuracy
- BLEU score → Compares against multiple reference translations
- Perplexity → Cross-entropy

Instance Type:
- Can only use GPU instance types (P3)
- Can only use a single machine for training
	- But can use multi-GPU’s on one machine