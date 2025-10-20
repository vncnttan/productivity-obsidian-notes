---
share_link: https://share.note.sx/0op2uxm2#A6j+hLB14s2JVwh5Ib2KcSV2NknKWoF+zGTlm2OSI10
share_updated: 2025-10-16T21:18:42+07:00
---
`Test Completed: 15 Oct 2025`

## Login Module
##### Frontend 
1. Country, City, and Merchant Empty not validated yet ✅
2. Gender Validation Error Message ✅
3. Register with used email error message appears, but user redirected ✅
##### Backend
1. Forgot Password with unregistered email error message “attempt to reset password at NULL” → seharusnya “email is unregistered”

## Util Module
##### Frontend 
1. Profile Picture is not submitted yet ✅

## Dashboard Module
##### Frontend 
1. Unpaid withdraw request (Admin): Minor frontend bug `justify-between` behaviour
2. Summary is not auto updated on Sales Person transactions ✅
3. Scan Product (Sales Person): Validation error message does not appear ✅
##### Backend
1. Summary for merchant inaccurate
2. Current statistic graphs show point totals not sales transaction total count
3. On create sales transaction (sales person), point doesn’t get added

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
2. Bug: Sales Person Table (in Merchant Profile): Wrong sales person get deleted

|            DELETE Request            |       GET Request after DELETE       |
| :----------------------------------: | :----------------------------------: |
| ![[Pasted image 20251020212448.png]] | ![[Pasted image 20251020212824.png]] |

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
1. Search Merchant not implemented yet
2. Bug: Sales Person Table (in Merchant Profile): Wrong sales person get deleted (look image above on Profile Module)

## Sales Person Module
##### Frontend
1. Sales Transaction Table should not display customer informations ✅
2. Empty Sales Transaction Detail ✅
3. Implement Delete Bank Account \[Need backend support\]
4. Edit Gender using Radio Field ✅
##### Backend
1. Add validation for minimal point to be 0 because current implementation point can go negative
2. Column yang di export di Sales Transaction per Sales Person tidak sesuai dengan UI
3. Bug on Implement Search table in Withdraw Request Table (per Sales Person)
###### Implementation Question
1. Country dan city tidak di show dan di edit untuk masing-masing sales person?

## Product Module
##### Frontend
1. Implement Dynamic Field in Edit Product Group Form ✅

## Location Module
##### Frontend
1. Implement auto update on create county / city ✅
##### Backend
1. Bug Export Country: Error occured

## Withdraw Request Module
##### Backend
1. Implement substraction on merchandise stock on withdraw request approval 
##### Implementation Question
1. Points yang ada di masing-masin merchandise fungsinya untuk apa?

## QnA & Tutorial Module
##### Frontend
1. Card open state is not isolated for each tab

## Quiz Module
##### Frontend
1. DELETE method not supported error on Delete Quiz
2. Edit Quiz is not submitted
3. Navigate to Edit Page from Quiz Detail Page as Account Manager
4. Score Quiz (Sales Person View) → true, seharusnya angka
##### Backend
1. Update Quiz Status id: 1, tapi yang statusnya terupdate quiz terakhir, bukan status dengan id tersebut
2. Update status to “Success” if sales person successfully achieve 100 score.
3. Validate Quiz Submission for the Sales Person can be taken if the status is not “Success” yet for that Sales Person
4. Unsynchronized Sales Person points on Get Current User Detail, and Sales Person Specific Summary
5. If Sales Person did not manage to achieve 100 score, don’t add sales person point
6. Except admin and account manager, hide inactive training resource
##### Implementation Question
1. Apakah *Add Question* bisa di klik di *Quiz Detail*? (sepertinya seharusnya tidak bisa)
2. Duration yang dipakai untuk quiz pilihannya ada berapa menit?

## Training Resource Module
##### Frontend
1. Upload File Failed ✅
2. Authorization error (Admin should be privileged to Edit, Delete, and View training resource detail) ✅
3. Link / File Undefined ✅
4. Detail text field for file

##### Backend
1. Except admin and account manager, hide inactive training resource
## Company Setting Module
*All clear*