DU20-1

PSD -  Membuat pattern, sehingga walaupun orang yang membuat atau collab berbeda, patternnya masih sama dan mudah dipahami

Master Page - Semua yang ga bakal berpindah tempat contohnya header, sidebar dll


runat: 
server-side programming - ASP pake yang ini
client-side programming

sistem aplikasi bakal dijalanin dlu di server, baru dikasi ke client, bukan di proses di clientnya

Steps:
- Add Item > Master Page
- Add Item > Web from master page > Select Master Page
- Bikin tampilan using toolbar
- F11 - buat run di web
- Bikin label dan text dan submit register btn
- F5, untuk buka backendnya
- Bikin onclick di button and use create New Event

Database:
- Add Item > Database > SQL Server Database
- Double Click Database > Klik Kanan Tables > Add New Table > Bikin deh pake GUInya > Update Database
- Add Item > ADO > Next
- Make Gridview to show
- Make Update, Delete

Cookie:
- Login
- Register

API:
- Add > New Project > Name: "WebService" > Create
- Add > Add item > Service
- Solution  > Properties > Multiple startup

Pattern Software Design
DDD - Domain Driven Design

View : Tampilan
Controller : 
- Validasi Empty
- Validasi Email
- Validasi Panjang Char
- Session & Cookie
Handler: 
- Business Logic (cth: generate ID)
Repository:
- Menghubungkan ke database melalui model
Factory:
- Membuat objek secara tertutup

New folder: Controller, Factory, Repository, Handler

Make new database in web service
Make model using ADO in web service

GetUsers()
Controller > Handler > Repository

AddUser()
Controller > Handler > Repository (call Factory inside)

Install Newtonsoft.Json and add both


Connecting Web Service to Web Application
WebApplication > References > Add Service Reference > Tembak URL Web Service > Advanced > Add Web Reference > Tembak > Add Reference
Web References nya bakal otomatis localhost
