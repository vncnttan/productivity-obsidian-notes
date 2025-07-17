[]()Framework: 
- Vite + React 19
- Typescript with ESLint support

UI Libraries:
- Tailwind v4
- shadcn/ui
	- Also used to create charts
- **Rich Text**: TipTap

misc. Libraries:
- TanStack Query (useQuery)
- React lodash
- React useForm



Meeting Notes:
- Register dari sisi admin
- Reseller == Merchant
- Add new SalesPerson tidak perlu di approve lagi
- Daftar Negara fetch dari DB


TODO Core:
- [x] AppendableForm Builder
- [ ] 

TODO: 
- [x] Sidebar Active Tab highlight
- [x] Table Showing n of n
- [x] Table No. column
- [x] Table Alternating Color
- [x] Table Sort Highlight Current
- [x] Field disable bg color ganti
- [x] Pertimbangkan apakah SalesDetail perlu componentize considering yang lain engga
- [x] useMemo untuk table tab
- [x] useMemo untuk semuanya
- [x] Lanjutin page baru
- [x] Kalo fieldnya sama berarti buat formDef baru kah?


TODO:
- [x] Rich Text
- [x] Complete Knowledge Base
- [x] Perhalus Buka Tutup Knowledge Base
- [x] Perhalus Buka Tutup Quiz 
- [x] Fix Bug DnDkit height berbeda

Refactor:
- [x] Basic Protected Routes
- [x] Refactor paths.tsx
- [x] Refactor AppRouter.tsx
- [x] Refactor Query Keys
- [x] Refactor Invalidate Queries
	- [x] Refetching Data By Invalidating Queries
	- [x] Create helper for this
- [x] Refactor useDelete, useDetail, etc. to accept objects, not id string
- [x] Refactor Dialog bisa di refactor atau bahkan pake satu aja, tergantung sama implementasi useQuery
- [x] Chore rename mau Definitions apa def
- [x] Refactor zod profy
- [x] Fetch Roles Admin User Create
- [x] Kalo gaada news, jadiin gap 4 gacor sih
	- [ ] Jadinya fix knowledge basenya turun out of scope
- [ ] Ganti table padding jadi lebih kecil, sesuai sama figma
- [ ] Dashboard should have key props
- [ ] Preview Dialog
- [ ] Make Profile Picture Validation pake helper
- [ ] Validasi Password & Confirm Password pake helper
	- [ ] Consider renaming confirmPass?
- [ ] Rich Text nya ga kepencet kalo di bawahan karena masalah max height, coba cek di create quiz
- [ ] Rich Text ga muncul pada saat accordion create quiz di close
- [ ] Accordion Create Quiz kalo pertanyaannya lebih dari batas overflownya dibenerin
- [ ] Rich Text ngebug, kayak misalnya nge blok dll ga keliatan
- [ ] Lagi di menu quiz saat sidebarnya di collapse highlightnya berantakan
- [ ] Detail Page / Dialog ketinggalan di komen figma
- [ ] Selectable Table Row
- [ ] Toast success and error message fetching from backend
- [ ] Bug fix, something not appearing on system dark theme


  

Bug:
- API POST Create Tutorial & QNA tertukar (current backend QnA ask for “Title” and “Description”, meanwhile the Tutorial ask for “Question” and “Answer” → should be the opposite)


Backend Not Implemented Yet:
- API Get Search Country (Get All Country No Pagination ditambahin biar ada params untuk search querynya berdasarkan name)
- API Get Search City in Country (Get All City No Pagination ditambahin biar ada params untuk search querynya berdasarkan name)
- API Sales Person by status (status=1, status=0)
- API Edit User by ID (dari adminnya yang mengedit user lain) 
- Delete Sales Person by ID (dari adminnya yang delete user ini)
- API Get Sales Person By Merchant (untuk ditampilkan di Merchant Detail)
- API untuk Training Resource (Video & PDF)
- API untuk Quiz
- API Verify Sales Person
- Gaada endpoint summary untuk setiap page → yang dimunculkan dalam bentuk card di setiap page
- Preview Dialog benerin
- Dialog untuk reject implementation yang bener

Incomplete data:
- Field Product Stock, Available, Scanned Count di Get Product List tidak ada
- Product Object (Product code & name), Merchant Object (Merchant name), Scanned Date di Get Product List tidak ada
- Calculated Total Sales, Country Object, City Object di Merchant List tidak ada



New founding:
- API Reset Password Profile
- Update Training Resource seharusnya tidak terima status, dan dibiarkan saja
- 