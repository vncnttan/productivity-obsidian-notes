---
share_link: https://share.note.sx/0op2uxm2#A6j+hLB14s2JVwh5Ib2KcSV2NknKWoF+zGTlm2OSI10
share_updated: 2025-10-20T23:27:16+07:00
---
`Test Completed: 15 Oct 2025`

## Login Module
##### Frontend 
1. Country, City, and Merchant Empty not validated yet ✅
2. Gender Validation Error Message ✅
3. Register with used email error message appears, but user redirected ✅
##### Backend
1. Forgot Password with unregistered email error message “attempt to reset password at NULL” → seharusnya “email is unregistered”
2. Verifikasi email masih mengarahkan ke http://157.245.192.237:3000/
3. Reset password  email masih mengarahkan ke http://157.245.192.237:3000/


## Util Module
##### Frontend 
1. Profile Picture is not submitted yet ✅

## Dashboard Module
##### Frontend 
1. Unpaid withdraw request (Admin): Minor frontend bug `justify-between` behaviour
2. Summary is not auto updated on Sales Person transactions ✅
3. Scan Product (Sales Person): Validation error message does not appear ✅
4. Total point sales di jadikan dalam bentuk card ke 3 di menu dashboard \[Need backend support\]
5. Wording untuk Card Dash board Sales Person yang sebelah kiri di ubah menjadi (Scanned Products Code Last Month) ✅

##### Backend
1. Summary for merchant inaccurate
2. Current statistic graphs show point totals not sales transaction total count
3. On create sales transaction (sales person), point doesn’t get added
4. Ketika Sales Scan product (di card dashboard masih masuk ke scanned this month & last month),  seharusnya hanya masuk ke this month

## Profile Module
##### Frontend
1. Upload File failed ✅
2. Search Table Profile Merchant not implemented yet ✅
3. Sales Person Profile: Customer data should not appear on Sales Transaction table ✅
4. Sales Person Profile: Sales Transaction Detail Bug ✅
5. Sales Person Profile Edit: Cannot delete Bank Account \[Need backend support\]
6. Sales Person Profile Edit: Radio Field for Editing Sales Person ✅
###### Backend
1. Bug: Total Point (in Sales Person Profile) for new sales person with 0 transaction suddenly get points
2. Bug: Sales Person Table (in Merchant Profile): Wrong sales person get deleted (menggunakan id dari detail, menggunakan id dari sales_person_id menyebabkan Internal Server Error)

|                               DELETE Request                               |       GET Request after DELETE       |
| :------------------------------------------------------------------------: | :----------------------------------: |
|                    ![[Pasted image 20251020212448.png]]                    | ![[Pasted image 20251020212824.png]] |
| **DELETE Request sales_person_id**<br>![[Pasted image 20251020231652.png]] |                                      |

###### Implementation Question
1. Apakah merchant bisa edit sales person tersebut melalui profile message?
2. Country dan City Merchant / Sales Person digunakan saat creation tapi tidak ditampilkan / diedit.

## Admin User Module
##### Frontend
1. Upload File failed ✅

## Merchant Module
##### Frontend
1. Search Merchant Sales Person not implemented yet ✅
##### Backend
1. Search Merchant not implemented yet ( https://api.kharismaworld.club/api/merchant?page=1&merchant=els - Masih mengembalikan semua data )
2. Bug: Sales Person Table (in Merchant Profile): Wrong sales person get deleted (look image above on Profile Module)
3. Bug: Total Sales person di module merchant (di masing masing) tidak berkurang, untuk di card paling atas sudah benar

## Sales Person Module
##### Frontend
1. Sales Transaction Table should not display customer informations ✅
2. Empty Sales Transaction Detail ✅
3. Implement Delete Bank Account \[Need backend support\]
4. Edit Gender using Radio Field ✅
##### Backend
1. Add validation for minimal point to be 0 because current implementation point can go negative
2. Column yang di export di Sales Transaction per Sales Person tidak sesuai dengan UI
3. Bug on Implement Search table in Withdraw Request Table (masih belum terfilter)
4. Sales Person Sales Transaction is not accurate
###### Implementation Question
1. Country dan city tidak di show dan di edit untuk masing-masing sales person?

## Product Module
##### Frontend
1. Implement Dynamic Field in Edit Product Group Form ✅
2. Download Template masih mengarah ke http://157.245.192.237:3000/ ✅
##### Backend
1. Bug Import Product (https://api.kharismaworld.club/api/product/license/import - "message": "Server Error")


## Location Module
##### Frontend
1. Implement auto update on create county / city ✅
##### Backend
1. Bug Export Country: Error occured
2. Bug Delete City:
   ```
   Error Deleting City: SQLSTATE[23000]: Integrity constraint violation: 1451 Cannot delete or update a parent row: a foreign key constraint fails (`kims_sales_panel_backend`.`users`, CONSTRAINT `users_city_id_foreign` FOREIGN KEY (`city_id`) REFERENCES `cities` (`id`)) (Connection: mysql, SQL: delete from `cities` where `id` = 1)
1400``` 
3. 

## Withdraw Request Module
##### Backend
1. Implement substraction on merchandise stock on withdraw request approval 
##### Implementation Question
1. Points yang ada di masing-masin merchandise fungsinya untuk apa?

## QnA & Tutorial Module
##### Frontend
1. Card open state is not isolated for each tab ✅

## Quiz Module
##### Frontend
1. DELETE method not supported error on Delete Quiz ✅
2. Navigate to Edit Page from Quiz Detail Page as Account Manager  ✅
3. Score Quiz (Sales Person View) → true, seharusnya angka ✅
##### Backend
1. Edit Quiz Endpoint
2. Update Quiz Status id: 1, tapi yang statusnya terupdate quiz terakhir, bukan status dengan id tersebut
3. Update status to “Success” if sales person successfully achieve 100 score.
4. Validate Quiz Submission for the Sales Person can be taken if the status is not “Success” yet for that Sales Person
5. Unsynchronized Sales Person points on Get Current User Detail, and Sales Person Specific Summary
6. If Sales Person did not manage to achieve 100 score, don’t add sales person point
7. Except admin and account manager, hide inactive training resource
8. Bug → Score reaches 120

![[Pasted image 20251020223843.png]]
##### Implementation Question
1. Apakah *Add Question* bisa di klik di *Quiz Detail*? (sepertinya seharusnya tidak bisa)
2. Duration yang dipakai untuk quiz pilihannya ada berapa menit?

## Training Resource Module
##### Frontend
1. Upload File Failed ✅
2. Authorization error (Admin should be privileged to Edit, Delete, and View training resource detail) ✅
3. Link / File Undefined ✅
4. Detail text field for file ✅
##### Backend
1. Except admin and account manager, hide inactive training resource
##### Implementation Question
1. Should the training resource country access affect which sales person / merchant who can view it?

## Company Setting Module
*All clear*