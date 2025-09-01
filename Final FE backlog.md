---
share_link: https://share.note.sx/o2c86gtl#VqkgwYATpD/Jvp8lAKUNH03kXnhiH8ILwsXABZ1wJNM
share_updated: 2025-08-30T18:21:10+07:00
---
Progress (28/08 - 31/08)
- [x] Man Woman Standardization
- [x] Sales person type di hide ya di tablenya
- [x] Adjust Bank / Merchandise Withdraw Types
- [x] QnA tutorial Page
- [x] Rich Text di table view
- [x] Dashboard (Withdraw Section)
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
- [ ] Register
	- [x] Register Page
	- [x] Resend Email Page
		- [x] UI
		- [ ] Wiring (need backend support)
- [ ] Import Export
- [ ] Forgot Password
	- [x] UI
	- [ ] Wiring (need backend support)
- [ ] Reject & Approve Withdraw (From Admin View)
	- [ ] Verify Withdraw & Type Password Dialog


Blocker Backend:
- [ ] 
- [ ] Edit Question (Need changes overall for the request API backend flow)
- [ ] Resend Email API
- [ ] /quiz/1 (GET Quiz Detail)
	- [ ] Fetch Correct Answer for admin view
- [ ] /quiz/1/2 (DELETE Quiz Question)
	- [ ] New API for deleting specific question from quiz


Minor UI Feature:
- [ ] Chart (define API Support and Safari Library)
- [ ] Quiz change status → Active / Inactive (need Backend Support)
- [ ] Training Video & PDF change status

Minor Backend Bug:
- [ ] Bug Delete Sales Person: 
	- [ ] Sales Person yang di delete malah sales person yang lain (tidak jelas menggunakan id yang mana)
	- [ ] Banyak module yang jadi bug ketika sales person yang berhubungan di delete 