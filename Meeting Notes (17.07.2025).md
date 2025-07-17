Ganti beberapa validasi di pendaftaran page: /notariatv3/pendaftaranUser/daftar 
- Ganti validasi message untuk email: “Pastikan email yang digunakan merupakan gmail yang aktif” 
- Dibuat validasi bahwa domain dari email harus gmail
- Tambah validasi username harus menggunakan huruf, angka, gaboleh menggunakan spasi (ini nanti di diskusikan lagi)
- Jadiin validasi username case insensitive (convert ke kecil sebelum masukkin ke databasenya)

Ganti beberapa di /pendaftaranUser/isiBiodata (step 1):
- Tambahkan notes di field *Nama lengkap dengan Gelar*
  “Pastikan kembali **Nama Lengkap dengan Gelar** tidak double” 
- Di input foto, pastikan file size nya > 0KB
- Tambahkan notes di upload profile image
  “Pastikan foto mengikuti ketentuan yang berlaku” (fotonya sendiri, jelas, pastikan latar belakang warnanya merah, harus berwarna) + tambah contoh foto yang sesuai ketika di hover
- 

Kemungkinan CR:
- Mau autogenerate username 
- Mekanisme expired untuk pendaftaran

Permintaan ke PIC AHU: 
- Template Import Formasi