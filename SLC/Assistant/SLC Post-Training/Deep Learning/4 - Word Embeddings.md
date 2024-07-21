Essentially, converting words (that human understands) to numbers (that machine understands).

Problems with assigning random number for each words:
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




