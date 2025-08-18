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

Overtime 
-- Minggu, 3 jan
– - Senin, 4 Jan (dari chat mas abi)

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
- [x] Login Register dibenerin titlenya
- [x] Forgot Password UI
- [x] Withdraw and Unverified Sales Person yang di dashboard
- [x] Verify Sales Dialog & Type Password Dialog
- [x] Validasi Password & Confirm Password pake helper
	- [x] Consider renaming confirmPass?
- [x] Jadiin required pakai mode !== detail semua seragamin


Progress (23/07 - 30/07)
- [x] Integrate API Changes
- [x] Change Menu Views Based on role
- [x] Fix Bank Account Missing in Sales Person Detail

Progress (30/07 - 6/08)
- [x] Edit Sales Add Bank (ini tanya mbak wike sih, kenapa ada di dialog lagi di figmanya?)
- [x] Edit Sales Mutations
- [x] Edit Sales Bank Account Mutation
	- [ ] Minta support mas farrel, buat Idnya optional untuk yang add gabisa soalnya
	- [x] Fix Edit Add bank form yang terisi masih belum include yang baru ditambahkan
- [x] Beresin axiosClient.ts pakai helper

Progress (6/08 - 13/08)
- [x] Refactor Role with Mapping ENUM
- [x] Fix Nested Return Undefined
- [x] Rekap Backend API Endpoint
- [x] Create Super Admin → role nya Account Manager dan Super Admin
- [x] Penyesuaian UI untuk role berbeda
	- [x] Withdraw Request di Merchant Role tidak perlu
	- [x] Profile Page ngarah ke merchant dan sales person untuk role tersebut
	- [x] Takeout Create Button di beberapa page tergantung role
	- [x] Action View di table
	- [x] Consider should we change to all just be isSuperAdmin lmao
- [x] Disable Button on Submitting
- [x] Clear form on dialog close
- [x] Quiz UI
	- [x] Quiz Layout
	- [x] Base Quiz UI
	- [ ] Refactor Componentize Quiz to have one route only
		- [ ] Tanya mas haikal / mbak wike, ini berarti saat quiznya berjalan dia akan berjalan terus ya? (with zustand) 
	- [ ] Custom QNA dan Tutorial View for Merchants
		- [x] Basic UI
		- [ ] Tanya mas haikal / mbak wike, Berarti ini QnA dan Tutorialnya langsung Fetch All?
		- [ ] Minta support mas farrel untuk ini
	- [x] Result UI
- [x] Change City Dynamic Select based on Country chosen
- [x] Edit Form disable save button if no field changed yet
- [x] Fix: Rich Text on table column def
- [ ] Register 
	- [ ] Minta mas Farrel untuk lepas authentication untuk Search merchant & bank karena kepake di Register Page (dimana user state authenticated)
- [x] Fix Uncontrolled Select Error (Sales Person Edit)


Progress (14/08 - 21/08)
- [x] Responsive
	- [x] Sales Person View
- [x] Derived Field 
- [x] Scan Product (From Sales Person View)
- [x] Camera & QR code reader
- [x] Sales Transaction table & dialog
- [x] Penyesuaian UI untuk role berbeda
	- [x] Tunggu dari BE get_current_user return id dari merchant dan sales person
	- [ ] City
- [ ] Withdraw Request (From Sales Person View)
	- [ ] Create
	- [ ] Detail
	- [ ] List (Table)
- [ ] Reject & Approve Withdraw (From Admin View)
	- [ ] Verify Withdraw & Type Password Dialog
- [ ] Quiz
	- [ ] Timer Mechanism
	- [ ] Result Mechanism     
	- [ ] Answer Mechanism

- [ ] Belum bisa Sort By Server :(
- [ ] Selectable Table Row
- [ ] Create Mock data for Sales Person Point History & Withdraw to fix the typing
- [ ] Accordion Create Quiz kalo pertanyaannya lebih dari batas overflownya dibenerin
- [ ] Rich Text di table view
- [ ] Rich Text nya ga kepencet kalo di bawahan karena masalah max height, coba cek di create quiz
- [ ] Rich Text ga muncul pada saat accordion create quiz di close
- [ ] Rich Text ngebug, kayak misalnya nge blok dll ga keliatan
- [ ] Lagi di menu quiz saat sidebarnya di collapse highlightnya berantakan
- [ ] Fix/Refactor: Terlalu banyak fetch saat search di jalankan di select field
- [ ] Bug fix, something not appearing on system dark theme
- [ ] Man Woman Standardization
- [ ] Editing self from the Admin menu doesnt cause refetch for the navbar name


