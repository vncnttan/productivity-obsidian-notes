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



**Weekly (03/11)**
// SIMOTANDI
Issue: Overfitting (Training Acc 80%)
Solution to do:
- Parameter Tuning
- Augment preprocess data

Multiclass vs Binary → Accuracy yang multiclass lebih tinggi, namun ketika di inference hasilnya ga beda jauh.

→ Cuman ada puluhan point di dataset (kurang bisa untuk mencapai yang bagus)
→ Bisa dicoba cari dataset

Udah ada progress methodnya → Bisa di update ke user

To Do Documentation:
- [ ] Progress (method & model yang digunakan) & Obstacles
	- [ ] Obstacle 1: Minimnya data point dari dataset yang diberikan
	- [ ] Obstacle 2: Masih low-code → Bisa diberikan tools untuk dashboard / ETL / DWH / Clickhouse / Hex
- [ ] Tools untuk solusi obstacles yang dimiliki 
      (contoh: tools untuk data collection untuk menambahkan data point dari dataset, atau dashboard yang diberikan)

// UPH Chatbot

New Requirements:
1. 
2. Chatbot Memory (personalized for each user)
3. Call to Action (CTA) Sales Automation → ingin AInya soft selling untuk pembelian formulir, jadi engagementnya kuat ke user terkait.

New tools for search:
1. Collaboration tools untuk config chatbotnya secara langsung, contoh: ketika ada event early bird untuk discount di hari itu jg dll.
2. Supportive tools untuk menjelaskan ke user

TODO:
- [ ] Integrate Langfuse
- [ ] Integrate Human-in-the-loop
- [ ] Integrate Whatsapp
- [ ] Expose Langgraph Dev
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