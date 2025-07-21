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
	- [x] Jadinya fix knowledge basenya turun out of scope

Progress (16/07 - 23/07)
- [x] Detail Page / Dialog yang ketinggalan di komen figma
- [x] Ganti table padding jadi lebih kecil, sesuai sama figma
- [x] Sidebar should have key props
- [x] Toast success and error message fetching from backend
- [x] Profile Picture API Fix
- [x] Fetch Dynamic Select from API
- [x] Profile Picture Validation pake helper
- [x] Jahit Revision Backend dari mas Farrel
- [x] Get City by Id Country yang diisi 
- [x] Preview Dialog (tunggu QRnya)
- [x] Ganti QnA dan tutorial rich text untuk pakai html tag
- [x] Sales Transaction dibagi menjadi 2 bank dan withdraw
	- [x] Buat category namenya berubah sesuai dengan params type
	- [x] Title di navbar untuk pake yang sidebar punya daripada pake yang itemnya punya title
	- [x] Make sure only one collapsible sidebar opened
- [ ] Login Register dibenerin titlenya
- [ ] Forgot Password UI
- [ ] Withdraw and Unverified Sales Person yang di dashboard
- [ ] Verify Sales Dialog & Type Password Dialog
- [ ] Edit Sales Add Bank (ini tanya mbak wike sih, kenapa ada di dialog lagi di figmanya?)

- [ ] Quiz UI
- [ ] Beresin axiosClient.ts pakai helper
- [ ] Jadiin required pakai mode !== detail semua seragamin
- [ ] Validasi Password & Confirm Password pake helper
	- [ ] Consider renaming confirmPass?
- [ ] Clear form on dialog close
- [ ] Disable Button on Submitting
- [ ] Sort By Server :(
- [ ] Selectable Table Row
- [ ] Accordion Create Quiz kalo pertanyaannya lebih dari batas overflownya dibenerin
- [ ] Rich Text di table view
- [ ] Rich Text nya ga kepencet kalo di bawahan karena masalah max height, coba cek di create quiz
- [ ] Rich Text ga muncul pada saat accordion create quiz di close
- [ ] Rich Text ngebug, kayak misalnya nge blok dll ga keliatan
- [ ] Lagi di menu quiz saat sidebarnya di collapse highlightnya berantakan
- [ ] Bug fix, something not appearing on system dark theme
- [ ] Man Woman Standardization
- [ ] Editing self from the Admin menu doesnt cause refetch for the navbar name

