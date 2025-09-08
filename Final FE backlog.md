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
		- [x] Edit Question
		- [x] Delete Question
	- [ ] Timer Mechanism
	- [ ] Result Mechanism     
	- [ ] Answer Mechanism
- [x] Register
	- [x] Register Page
	- [x] Resend Email Page
		- [x] UI
		- [x] Wiring
- [x] Forgot Password
- [x] Reset Password (Unauthenticated)
	- [x] UI
	- [ ] Wiring (bug backend)
- [x] Change Password in Profile Page
- [ ] Reject & Approve Withdraw (From Admin View)
	- [ ] Verify Withdraw & Type Password Dialog (need backend support)


Blocker Backend:
- [ ] Quiz
	- [ ] Quiz List (GET /quiz)
		- [ ] Bug 500 Internal Server Error: "Attempt to read property \"status\" on null”, 
- [ ] Withdraw Request
	- [ ] Add Password Validation for Reject and Approve (dari frontend jadi kirim password juga di body request nya)    
- [ ] Delete Quiz Question APInya apa ya? di postman baru ada Delete Quiz doang (/delete/quiz)

![[Pasted image 20250903192517.png]]


- [ ] Forgot Password (/api/forgot-password)
	- [ ] Invalid Token 400 Bad Request

![[Pasted image 20250902193635.png]]

Unchecked karena API nya meletup
	- [ ] /quiz/1/2 (DELETE Quiz Question)
		- [ ] New API for deleting specific question from quiz





### Minor Frontend:
###### Minor UI Feature:
- [ ] Export Khusus di Admin
- [ ] Chart (define API Support and Safari Library)
- [ ] Quiz change status → Active / Inactive (need Backend Support)
- [ ] Training Video & PDF change status
- [ ] Export PDF Params Filtered

##### Minor UI Bug
- [ ] Kadang tidak muncul: untuk password tambahin tombol mata - untuk melihat
- [ ] Edit License Ngawur Initial Datanya
### Minor Backend:
##### Additional Request dari pak Edy
- [ ] Table Fetch Filter by (cek di Figma)
	- [ ] Contoh: Training Video & PDF (GET /api/knowledge-base/training-and-pdf)
		- [ ] Filter By: Access Country 
		- [ ] Filter By: Status
	- [ ] Jadi Endpointnya bisa: /api/knowledge-base/training-and-pdf?access_country_id=1&status=1
	- [ ] Notes: Kalau misalnya select, pastikan ada fetch allnya (berarti untuk access country new endpoint GET /api/knowledge-base/training-and-pdf yang list Access Country Id dan Name nya)
- [ ] Export by Filter (Export otomatis terfilter sesuai dengan current filter, bisa dibuat /api/knowledge-base/training-and-pdf/export?access_country_id=1&status=1)
###### API Tertinggal
- [ ] Import Export API  
	- [ ] Export Sales Person by Merchant (see on merchant detail page)
	- [ ] Export Sales Person List (di /sales-person/export not found)
	- [ ] Export Sales Transaction by Sales Person (see on sales person detail)
	- [ ] Export City (see on country detail)
	- [ ] Export QnA
	- [ ] Export Quiz
	- [ ] Export Training Video & PDF
	- [ ] Export Sales Transaction
	- [ ] Export Withdraw Request
- [ ] Sumary API Tertinggal
	- [ ] Summary Sales by Merchant (see on merchant detail page)
	- [ ] Summary Transaction by Sales (see on Sales Person detail)

###### Minor Backend Feature / Tertinggal
- [ ] Login Endpoint (POST /api/login)
	- [ ] Remember me: true/false 
- [ ] Change Self Password (POST /api/user/update-password)
	- [ ] Add old_password on the body validation
- [ ] New API Fetch Merchandise Option No Pagination (GET /api/merchandise?all=)
- [ ] New API for changing quiz status (active / inactive)
- [ ] Remove the url from the response of /api/send-forgot-password (for security purpose)
###### Minor Backend Bug / Need
- [ ] Get Self Detail (GET /api/user):
	- [ ] Need merchant_id if the user is a merchant
- [ ] Unverified Sales Person masih bisa login
- [ ] Bug When Updating Password (POST /api/user/update-password): Password dari diri sendiri tidak berubah
- [ ] Bug when deleting sales person (/api/sales-person/delete/3): 
	- [ ] Sales Person yang di delete malah sales person yang lain (tidak jelas menggunakan id yang mana)
	- [ ] Banyak module yang jadi bug ketika sales person yang berhubungan di delete 


