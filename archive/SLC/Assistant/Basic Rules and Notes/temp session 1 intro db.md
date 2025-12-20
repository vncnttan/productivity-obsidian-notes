Tegar Abdullah TD22-1
Andre Setiawan Wijaya AD21-1

- Normalisasi
- Database Key
- Membuat ERD
- Create Database Table

1. Normalisasi
Menstruktur data yang masih mentah supaya menghilangkan redundant (data yang berulang) dan anomaly
Mengubah data dari struk menjadi tabel-tabel yang berelasi

2. Kenapa engga ProductQuantity, melainkan Quantity biasa, hal ini dikarenakan Quantity akan berubah di setiap transaksi productName
Berbeda dengan ProductPrice, dimana setiap Product memeiliki harga yang tetap, tidak berubah.


Anomaly Insert: Padahal cuman mau nambahin satu karyawan, tapi harus require transaction dulu
Anomaly Update: Mau ubah/update satu produk jadi harus rubah semuanya
Anomaly Delete: Kalau delete kan harus delete 1 baris, delete 1 item sama dengan delete semua row dengan tabel tersebut

UNF: RawData
1NF: 
- minus redundancy
- minus counting
- decide PK and FK
- make new columns for IDs
Jelasin juga mengenai:
   composite key 
   foreign key
   primary key
2NF:
- minus partial dependency
3NF:
- minus transitive dependency


Visual Paradigm untuk Foreign Key, ingetin untuk samain type data dan lengthnya