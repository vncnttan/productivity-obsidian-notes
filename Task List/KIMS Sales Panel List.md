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
- [x] Basic Protected Routes
- [x] Refactor paths.tsx
- [x] Refactor AppRouter.tsx
- [ ] Refactor Query Keys
- [ ] Refactor Invalidate Queries
	- [ ] ### Refetching Data By Invalidating Queries
	- [ ] Create helper for this
- [ ] Refactor useDelete, useDetail, etc. to accept objects, not id string
- [ ] Refactor Dialog bisa di refactor atau bahkan pake satu aja, tergantung sama implementasi useQuery
- [ ] Chore rename mau Definitions apa def
- [ ] Refactor zod profy
- [ ] Fetch Roles Admin User Create
- [ ] Kalo gaada news, jadiin gap 4 gacor sih
- [ ] Bug fix, something not appearing on system dark theme
- [ ] Rich Text nya ga kepencet kalo di bawahan karena masalah max height, coba cek di create quiz
- [ ] Rich Text ga muncul pada saat accordion create quiz di close
- [ ] Accordion Create Quiz kalo pertanyaannya lebih dari batas overflownya dibenerin
- [ ] Rich Text ngebug, kayak misalnya nge blok dll ga keliatan
- [ ] Lagi di menu quiz saat sidebarnya di collapse highlightnya berantakan
- [ ] Detail Page / Dialog ketinggalan di komen figma
- [ ] Ganti table padding jadi lebih kecil, sesuai sama figma
- [ ] Dashboard should have key props
- [ ] Selectable Table Row
- [ ] Validasi Password & Confirm Password
- [ ] Toast success and error message fetching from backend


Backend Notes:
- Country
	- Total City for each country
- All Endpoint
	- Items Per page
	- Buat Country & City Endpoint tanpa pagination untuk di fetch ketika dimunculkan di field select country (isinya label dan value idnya aja)
	- Gaada endpoint summary untuk setiap page → yang dimunculkan dalam bentuk card di setiap page
- Merchant List
	- Calculated total sales
	- Country Object
	- City Object
	- Bug (?), the email cannot be taken again padahal merchantnya udah di delete
- Merchant Detail
	- Get Sales Person By Merchant
- Sales Person
	- API buat filteringnya gimana ya? Soalnya di postman gaada paramsnya


- Not Implemented Yet: GET API Sales Person by status (status=1, status=0)
- Not Implemented Yet: PUT API Verify Sales Person
- Delete Sales Person itu sama dengan Delete User kah? soalnya di sales person gaada method DELETE
	- Berarti untuk delete sales person dengan id 4, bisa langsung /api/user/delete/4
- Delete User Error Route Not Found"
	  ![[Pasted image 20250713214310.png]]
- Inconsistent Method:
	- Update Merchandise POST , padahal yang lain kalau edit menggunakan PUT