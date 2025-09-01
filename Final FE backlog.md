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
- [ ] Import Export (need backend support)
- [ ] Forgot Password
	- [x] UI
	- [ ] Wiring (need backend support)
- [ ] Reset Password (Unauthenticated)
	- [x] UI
	- [ ] Wiring (need backend support)
- [ ] Reject & Approve Withdraw (From Admin View)
	- [ ] Verify Withdraw & Type Password Dialog
- [x] Change Password in Profile Page


Blocker Backend:
- [ ] Resend Email API (New API)
- [ ] Import Export API Internal Server Error (Facades Excel not found)
- [ ] Login Error for Sales Person (User not verified error, even though the sales already approved by superadmin)
- [ ] Send Email doesn’t work → Waiting for mailgun smtp
	- [ ] Register
	- [ ] Send Forgot Password
- [ ] Send Forgot Password
	- [ ] For the URL, change it to be:  `http://157.245.192.237:8080/auth/reset-password/tokendisini` → Sementara di staging dulu
- [ ] Forgot Password (/api/forgot-password)
	- [ ] Remove email from the body request (tidak didapatkan) → Workaround minta user masukkan emailnya manual
- [ ] Quiz
	- [ ] Quiz List (GET /quiz)
		- [ ] For Admin: fetch the status of the quiz (active / inactive)
		- [ ] For Sales Person: fetch the status of the quiz (not yet / done / completed)
	- [ ] Edit Question Streamlining (Need changes overall for the request API backend flow)
	- [ ] Quiz Detail (GET /quiz/1)
		- [ ] Fetch Correct Answer for admin view
	- [ ] /quiz/1/2 (DELETE Quiz Question)
		- [ ] New API for deleting specific question from quiz


### Minor Frontend:
###### Minor UI Feature:
- [ ] Chart (define API Support and Safari Library)
- [ ] Quiz change status → Active / Inactive (need Backend Support)
- [ ] Training Video & PDF change status

### Minor Backend:
###### Minor Backend Feature
- [ ] Login Endpoint (POST /api/login)
	- [ ] Remember me: true/false 
- [ ] Change Self Password (POST /api/user/update-password)
	- [ ] Add old_password on the body validation
- [ ] New API Fetch Merchandise Option No Pagination (GET /api/merchandise?all=)
- [ ] Remove the url from the response of /api/send-forgot-password (for security purpose)
###### Minor Backend Bug
- [ ] Get Self Detail (/api/user):
	- [ ] Return Merchant Id if the user is a merchant
- [ ] Bug when deleting sales person (/api/sales-person/delete/3): 
	- [ ] Sales Person yang di delete malah sales person yang lain (tidak jelas menggunakan id yang mana)
	- [ ] Banyak module yang jadi bug ketika sales person yang berhubungan di delete 


