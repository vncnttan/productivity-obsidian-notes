---
share_link: https://share.note.sx/o2c86gtl#VqkgwYATpD/Jvp8lAKUNH03kXnhiH8ILwsXABZ1wJNM
share_updated: 2025-09-02T00:01:10+07:00
---
Progress (28/08 - 31/08)
- [x] Man Woman Standardization
- [x] Sales person type di hide ya di tablenya
- [x] Adjust Bank / Merchandise Withdraw Types
- [x] QnA tutorial Page
- [x] Rich Text di table view
- [x] Dashboard (Withdraw Section)
- [x] Import Export
- [ ] Quiz
	- [x] New UI and backend implementation for:
		- [x] Create Quiz
		- [x] List Quiz
		- [x] Detail Quiz
		- [x] Delete Quiz
		- [x] Edit Quiz
		- [x] Create Question
		- [x] List Question
		- [ ] Edit Question (need backend support)
		- [ ] Delete Question (need backend support)
	- [ ] Timer Mechanism
	- [ ] Result Mechanism     
	- [ ] Answer Mechanism
- [x] Register
	- [x] Register Page
	- [x] Resend Email Page
		- [x] UI
		- [x] Wiring
- [x] Forgot Password
- [ ] Reset Password (Unauthenticated)
	- [x] UI
	- [x] Wiring (bug backend)
- [x] Change Password in Profile Page
- [ ] Reject & Approve Withdraw (From Admin View)
	- [ ] Verify Withdraw & Type Password Dialog (need backend support)


Blocker Backend:
- [ ] Resend Email API (New API)
- [ ] Forgot Password (/api/forgot-password)
	- [ ] Invalid Token 400 Bad Request
- [ ] Quiz
	- [ ] Quiz List (GET /quiz)
		- [ ] For Admin: fetch the status of the quiz (active / inactive)
		- [ ] For Sales Person: fetch the status of the quiz (not yet / done / completed)
	- [ ] Edit Question Streamlining (Need changes overall for the request API backend flow)
	- [ ] Quiz Detail (GET /quiz/1)
		- [ ] Fetch Correct Answer for admin view
	- [ ] /quiz/1/2 (DELETE Quiz Question)
		- [ ] New API for deleting specific question from quiz


![[Pasted image 20250902193635.png]]


### Minor Frontend:
###### Minor UI Feature:
- [ ] Chart (define API Support and Safari Library)
- [ ] Quiz change status → Active / Inactive (need Backend Support)
- [ ] Training Video & PDF change status

##### Minor UI Bug
- [ ] Edit License Ngawur Initial Datanya

### Minor Backend:
###### API Tertinggal
- [ ] Import Export API 
	- [ ] Export Sales Person by Merchant (see on merchant detail page)
	- [ ] Export Sales Person List (di /sales-person/export not found)
	- [ ] Export Salse Transaction by Sales Person (see on sales person detail)
- [ ] Sumary API Tertinggal
	- [ ] Summary Sales by Merchant (see on merchant detail page)
###### Minor Backend Feature / Tertinggal
- [ ] Login Endpoint (POST /api/login)
	- [ ] Remember me: true/false 
- [ ] Change Self Password (POST /api/user/update-password)
	- [ ] Add old_password on the body validation
- [ ] New API Fetch Merchandise Option No Pagination (GET /api/merchandise?all=)
- [ ] Remove the url from the response of /api/send-forgot-password (for security purpose)
###### Minor Backend Bug / Need
- [ ] Get Self Detail (GET /api/user):
	- [ ] Need merchant_id if the user is a merchant
- [ ] Unverified Sales Person masih bisa login
- [ ] Bug When Updating Password (POST /api/user/update-password): Password dari diri sendiri tidak berubah
- [ ] Bug when deleting sales person (/api/sales-person/delete/3): 
	- [ ] Sales Person yang di delete malah sales person yang lain (tidak jelas menggunakan id yang mana)
	- [ ] Banyak module yang jadi bug ketika sales person yang berhubungan di delete 


