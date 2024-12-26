Why RAG?
1. To prevent hallucinations
2. Work with custom data


Why Local?
- Privacy
- Speed 
- Cost


Steps:
1. Open the document
2. Format the text of the document ready for an embedding model
3. Embed all of the chunks of the textbook and turn them into embedding which can store for later
4. Create a prompt that incorporates the retrieved pieces of text
5. Generate an answer to a query based on the passages of the textbook with an LLM

Why would we care about token count?
1. Embedding models dont deal with infinite tokens
2. LLMs dont deal with infinite tokens
