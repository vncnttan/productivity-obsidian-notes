TODO:
- [x] Explore Langgraph Studio for Visualization to help explainability for Product Manager etc.
- [x] Explore Playground WebUI for Langgraph
    - AssistantUI (sempat issue TPM di LLM) -> sempat diintegrasikan dengan Mastra -> kemungkinan karena dari implementasinya
    - Harus ada batasan dari banyak token yang di return untuk issue TPM
- [x] Human-in-the-loop Langgraph → Create architecture and human-in-the-loop 

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
- [x] Implement minimal MCP for new langgraph and langsmith integration to view how the graph visualization works
- [x] Setup CI/CD Infrastructure for FastAPI deployment with langserve

- [ ] Search tracing alternatives (langfuse ?)
- [ ] Finalize Tech Stack
- [ ] Create architecture for UPH
	- [ ] Collect requirements and resources
	- [ ] Create architecture LLM graph flow proposal



SIMOTANDI Problem:
→ Imbalance Dataset
Dataset binary, yang bukan crop itu 90%, sedangkan yang crop 10%
→ Unprobable Dataset
Dataran di Indonesia ada yang dataran rendah & tinggi, jadi perlu di explore lagi, Forest dan rumput biasa ga termasuk crop

Tujuan: 
→ Mengecek segmentasi ada pertambahan / engga dll
Training pake yang 2020, terus di training pake yang lain.