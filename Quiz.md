Yang diganti: 
- Migration movies (strin -> string)
- Migration genres (nama -> name)

home.blade.php
- Variable di home.blade.php (movies -> movie)
- Image banner path menjadi asset("storage/cover/".$movie->photo)

create.blade.php
- @extends('layouts') menjadi @extends('layout')
- Tambah id untuk setiap field
- Form enctype = multipart/form-data

MovieController.php
- Karena saat di view sudah di append dengan /cover maka path di storenya hanya 