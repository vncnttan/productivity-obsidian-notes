Yang diganti: 
migrations
- Migration movies (strin -> string)
- Migration genres (nama -> name)

seeder
- Seeder image photo pathnya diganti dengan ditambahkan /cover di depannya

home.blade.php
- Variable di home.blade.php (movies -> movie)
- Form delete ditambahkan @csrf

create.blade.php
- @extends('layouts') menjadi @extends('layout')
- Tambah id untuk setiap field
- Form enctype = multipart/form-data 

MovieController.php
- Karena saat di view sudah di append dengan /cover maka path di storenya hanya 

Menghapus semua yang tidak penting ditambahkan (mengenai book):
Hapus route-route yang tidak penting (Book Create store dan lain-lain)
Menghapus Book Model
Menghapus Book Controller
Menghapus detail.blade.php dari views