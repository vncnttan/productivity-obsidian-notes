TODO:
- [ ] Explore Langgraph Studio for Visualization to help explainability for Product Manager etc.
- [ ] Explore Playground WebUI for Langgraph
    - AssistantUI (sempat issue TPM di LLM) -> sempat diintegrasikan dengan Mastra -> kemungkinan karena dari implementasinya
    - Harus ada batasan dari banyak token yang di return untuk issue TPM
- [ ] Human-in-the-loop Langgraph → Create architecture and human-in-the-loop 

#### Exploration Result
###### Langgraph Studio ✅
→ Integrated with **Langsmith**
Developer plan (5000 traces / month)
*Mission*: Use langgraph studio & langsmith for development purposes only (with PM and developer access), the use FastAPI for staging (optional) & production
###### AssistantUI ❌
→ Create UI Playground for the Chatbot (no node visualization included yet)
Completely free
→ Alternative di production / staging

#### TODO:
- [ ] Implement minimal MCP for new langgraph and langsmith integration to view how the graph visualization works
- [ ] Setup CI/CD Infrastructure for FastAPI deployment with langsmith dev 
- [ ] Finalize Tech Stack
- [ ] Create architecture for UPH
	- [ ] Collect requirements and resources
	- [ ] Create architecture LLM graph flow proposal
