## Sesi 1
Normalization & Entity Relationship (ER) Modelling
---
- Unnormalized Form (UNF)
- First Normal Form (1NF)
- Second Normal Form (2NF)
- Third Normal Form (3NF)
- ER Modeling Design

Course Reminder:
- Ikuti notes yang ada di Messier
- Jelaskan secara singkat manfaat mempelajari Database (jika ada waktu boleh tunjukkin dimana database SSMS disimpan di PC)
- Karena materi cukup padat, briefing praktikum dipersingkat. Sehingga waktunya cukup untuk membahas dan menjelaskan ERD
- Jelaskan juga teori jenis-jenis anomali
- Boleh share UNF yang akan dipakai agar waktu tidak terbuang menunggu mahasiswa mengetik tabel UNF, namun tetap dijelaskan awal dan sumber data dari tabel UNF tersebut 
- Gunakan fitur *Remove Duplicates* yang ada di Excel untuk memudahkan mahasiswa juga menghapus tabel yang redundan saat normalisasi
- Alurnya di rekomendasikan saat pemisahan tabel: 
	- Buat tabel baru
	- Define key yang ada
	- Hapus kolom yang tidak diperlukan di tabel lama
	- *Remove Duplicates*
- Karena Projek mereka memerlukan ERD, jelaskan secara detail relation yang ada, One-to-One, One-to-Many, dan Many-to-Many

Khusus untuk mahasiswa Online:
- Tekankan ke mahasiswa bahwa di Lab sendiri tidak bisa memberikan nilai tambahan diluar dari nilai TM dan Projek
- Berikan Tips untuk menggunakan 2 device agar lebih mudah mengikuti query pengajar
- Ingatkan ke mahasiswa bahwa ada akses recording dari BINUS. Untuk partner pengajar bisa bantu record zoom ke local menggunakan OBS sehingga mahasiswa dapat mengakses lebih cepat.

## Sesi 2
Data Definition Language (DDL) I
---
- Attach and Detach Database
- Backup and Restore Database
- Import and Export Data
- Create and Drop Database
- Create, Alter, and Drop Table
- Create and Drop Index
- Keys
- Constraints

Course Reminder:
- Ikuti notes yang ada di Messier
- Run *SQL - Start* di RUMAN
- Untuk jenis key dijelaskan teorinya secara singkat
- Tekankan cara membaca dokumentasi dan help di SQL Server sehingga mahasiswa dapat mencoba-coba sendiri di rumah
- Perkenalkan *Galaxion* dan boleh membahas beberapa soal agar mahasiswa familiar dengan cara menjalankan query di *Galaxion* (tapi jangan dibahas semua agar mahasiswa bisa mengerjakan sendiri di rumah)

### Sesi 3
Data Manipulation Language (DML) I
---
- Insert Data
- Update Data
- Delete Data
- Simple Join Tables
- Order By
- Transaction

Course Reminder:
- Ikuti notes yang ada di Messier
- Jelaskan tujuan dari transaction, rollback, dan commit pada database
- Jika ada waktu, boleh bahas beberapa soal query dan join


### Sesi 4
Data Manipulation Language (DML) II
---
- Operator
- Date Functions
- String Functions
- Review
Course Reminder:
- Ikuti notes yang ada di Messier
- Bawa create+insert yang akan digunakan dalam sesi pengajaran, dan latihan soal query yang akan dipakai
- Jika masih ada waktu, boleh memberikan latihan soal yang dikerjakan mandiri oleh mahasiswa, lalu dibahas sehingga mahasiswa dapat mengerjakan quiz di sesi berikutnya
- Bahas **cara membuka dan membaca dokumentasi**. (disarankan dengan cara ditulis dulu syntaxnya, di blok, baru F1, jadinya mahasiswa ga bingung nyarinya)
- Boleh membahas beberapa soal exercise galaxion untuk memberikan **simulasi pengerjaan quiz**

### Sesi 5
Quiz 1
---
- Quiz 1

Course Reminder:
- Ikuti notes yang ada di Messier
- Setelah TM selesai dilaksanakan, backup jawaban mahasiswa terlebih dahulu, lalu clear Drive D dan FTP sehingga mahasiswa tidak dapat memfoto/bawa pulang soal maupun jawaban Quiz/TM
- Exercise yang dipakai tidak boleh menggunakan soal dari Quiz, harus menggunakan soal lain


### Sesi 6
Data Manipulation Language (DML) III
---
- Join Tables
- Set Operations

Course Reminder:
- Ikuti notes yang ada di Messier
- Ajarkan set-set operations dan perbedaannya dengan Join
- Ajarkan juga dengan latihan soal terkait dengan join tables dan set operations


### Sesi 7
Data Manipulation Language (DML) IV
---
- Aggregate Functions
- Group By
- Having

Course Reminder:
- Ikuti notes dari Messier
- Jelaskan mengenai error *is invalid in the select list because it is not contained in either an aggregate function or the GROUP BY clause*, dan bagaimana cara mengatasinya (Jelaskan bahwa semua atribut yang ditampilkan, jika bukan merupakan agregat, harus ada di Group By).
- Ajarkan juga dengan latihan soal terkait dengan aggregate, group by, maupun having.


### Sesi 8
Data Manipulation Language (DML) V
---
- Sub-Query
- Alias Sub-Query
- In and Exists
- Any, Some, and All

Course Reminder:
- Ikuti notes dari Messier
- Jelaskan mengenai case dimana Subquery / Alias Subquery dibutuhkan (contohnya, jika subquery dibutuhkan sebagai syarat dan berada di clause *having* harus menggunakan alias subquery, tidak bisa menggunakan subquery biasa)
- Ajarkan dengan latihan soal terkait dengan subquery, alias subquery, In, Exists, Any, Some, dan All


### Sesi 9
Data Definition Language (DDL) II
---
- Create, Alter, and Drop Views

Course Reminder:
- Ikuti notes dari Messier
- Karena materinya sedikit, boleh digunakan untuk mengajarkan materi sesi berikutnya (sehingga sesi berikutnya dapat digunakan untuk sesi Review), atau waktu sisanya boleh digunakan untuk Review materi yang dirasa butuh oleh mahasiswa (boleh tanya mahasiswa )

### Sesi 10
Security and Administration
---
- Users and Roles
- Access Control
- Review

Course Reminder:
- Ikuti notes dari messier
- Karena caranya ada berbeda sedikit, untuk latihan mengajar menggunakan PC BINUS
- Bahas latihan soal untuk persiapan quiz di sesi selanjutnya

### Sesi 11
Quiz 2 & Database Environment
---
- Quiz 2
- Generate SQL Script
- Review

Course Reminder:
- Ikuti notes dari messier
- Jika masih ada waktu, boleh bahas latihan soal untuk persiapan project, boleh ditanyakan ke mahasiswa kira-kira mereka ada butuh tambahan materi dimana
- Setelah TM selesai dilaksanakan, backup jawaban mahasiswa terlebih dahulu, lalu clear Drive D dan FTP sehingga mahasiswa tidak dapat memfoto/bawa pulang soal maupun jawaban Quiz/TM
- Tidak boleh membahas jawaban soal project mahasiswa


### Sesi 12
Project
---
- Project

Course Reminder:
- 