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
- [ ] Kalo fieldnya sama berarti buat formDef baru kah?


TODO:
- [x] Rich Text
- [x] Complete Knowledge Base
- [x] Perhalus Buka Tutup Knowledge Base
- [x] Perhalus Buka Tutup Quiz 
- [x] Fix Bug DnDkit height berbeda

Refactor:
- [ ] Detail Page / Dialog ketinggalan di komen figma
- [ ] Refactor paths.tsx
- [ ] Refactor AppRouter.tsx
- [ ] Ganti table padding jadi lebih kecil, sesuai sama figma
- [ ] Refactor useDelete, useDetail, etc. to accept objects, not id string
- [ ] Selectable Table Row
- [ ] Refactor Dialog bisa di refactor atau bahkan pake satu aja, tergantung sama implementasi useQuery
- [ ] Chore rename mau Definitions apa def
- [ ] Refactor zod profy
- [ ] Kalo gaada news, jadiin gap 4 gacor sih
- [ ] Bug fix, something not appearing on system dark theme
- [ ] Rich Text nya ga kepencet kalo di bawahan karena masalah max height, coba cek di create quiz
- [ ] Rich Text ga muncul pada saat accordion create quiz di close
- [ ] Accordion Create Quiz kalo pertanyaannya lebih dari batas overflownya dibenerin
- [ ] Rich Text ngebug, kayak misalnya nge blok dll ga keliatan
- [ ] Lagi di menu quiz saat sidebarnya di collapse highlightnya berantakan