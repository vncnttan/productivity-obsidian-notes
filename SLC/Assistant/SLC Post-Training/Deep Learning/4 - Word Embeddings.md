Essentially, converting words (that human understands) to numbers (that machine understands).

**Text Vectorization vs. Word Embeddings**:
- **Text vectorization** is like assigning numbers to words based on their position in a sentence, without considering their meaning.
- **Embedding layer** is like learning to represent words as points in a space where similar words are closer together.

Problems with only vectorizing text without embedding them:
- Some words might have **different meaning** depending on the context
  Sentence1: I like the cook so much!
  Sentence2: I like to cook!
- Some related words (similar semantics) should have similar embedding to improve model accuracy
  I like Troll 2 movie!
  I like Gymkata movie!
  (Here the movie name can be used interchangably, so the embedding should be similar)

Word embeddings can be used for multiple different tasks like:
- Next word prediction
- Translation prediction
- Sentiment analysis
- etc.

![[Pasted image 20240721190341.png]]



**To obtain word embeddings, you'll need to use an Embedding layer.** This layer takes the integer indices outputted by the Text Vectorization layer and maps them to dense vectors. These vectors are learned during the model training process and capture the semantic and syntactic relationships between words.