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
- “Nomor telpon” typo kurang e seharusnya “Nomor Telepon” 
- “Nomor telpon” diubah label jadi “Nomor Telepon Rumah / Nomor Handphone Alternatif”
- “Npwp” di label dijadikan all caps “NPWP”
- Lepas Validasi “Nomor telepon harus diisi”
- Validasi nomor telepon dengan nomor handphone harus berbeda
	- Error Message: “Harap isi dengan nomor telepon berbeda” jika notelp == ho hp
	- (Nomor telepon jadi tidak wajib diisi, kalau diisi pun harus berbeda dengan nomor handphone)
- 

Ganti di /pendaftaraUser/isiBiodata (step 2):
- Label Title “Sertifikat Kode Etik” diubah jadi “Sertifikat Kode Etik / Sertifikat CAT”

Ganti di /user/uploadDocument?id=:
- Label Title “Sertifikat Kode Etik” diubah jadi “Sertifikat Kode Etik / Sertifikat CAT”

Kemungkinan CR (dirampung dulu):
- Mau autogenerate username 
- Mekanisme expired untuk pendaftaran

Permintaan ke PIC AHU: 
- Template Import Formasi