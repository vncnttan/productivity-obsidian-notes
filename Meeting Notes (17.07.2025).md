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


Ganti di /pendaftaraUser/isiBiodata (step 2):
- Label Title “Sertifikat Kode Etik” diubah jadi “Sertifikat Kode Etik / Sertifikat CAT”

Ganti di /user/uploadDocument?id=:
- Label Title “Sertifikat Kode Etik” diubah jadi “Sertifikat Kode Etik / Sertifikat CAT”

Ganti di /user/previewDocument?id=:
- Label Title “Sertifikat Kode Etik” diubah jadi “Sertifikat Kode Etik / Sertifikat CAT”


=== Pindah Wilayah === 
- Title “Input Kode Voucher Perpindahan” diubah jadi “Input Kode Voucher Pindah Wilayah Jabatan Notaris”

Ganti di notariat/v3/user/pindahWilayah/… (Step ): 
- Title “Permohonan **Per**pindahan Wilayah Notaris“ diubah jadi “Permohonan Pindah Wilayah Jabatan Notaris”

Step 2
- Tambah validasi semua Surat Ikatan Jabatan Notaris mandatory

Step 3
- Ubah Label Title ”Wilayah Pindah Notaris” jadi “Wilayah Pindah Jabatan Notaris”
- Ubah Label “Nomor Surat Permohonan Pindah Notaris” jadi “Nomor Surat Permohonan Pindah Jabatan Notaris”
- C ke A minimal harus 4 tahun di tempat yang sama & punya instruksi menteri

Step 5
- Perubahan text di preview dibawah “Kepada Yth.” 
	- “Menteri Hukum dan Hak Asasi Manusia Republik Indonesia” diubah jadi “Menteri Hukum Republik Indonesia”
	- Hapus “plt”
	- Bersama ini saya sampaikan kelengkapan “Pindah Wilayah Jabatan Notaris”
	- “Demikian surat permohonan untuk pindah wilayah **jabatan notaris** ini dapat dikabulkan.”
	  
	  Jadinya: “Menteri Hukum Republik Indonesia c.q. Direktur Jenderal Admiistrasi Hukum Umum”


Di preview pindah wilayah:
- Bug: “Pratinjau Berkas Persyaratan Pengangkatan Notaris”, seharusnya “Pratinjau Berkas Persyaratan Pindah Wilayah Jabatan Notaris”

Di History Transaksi Riwayat Permohonan
- Ganti label di button “Batalkan Perpindahan” jadi “Batalkan Pindah Wilayah”

=== 

Kemungkinan CR (dirampung dulu):
- Mau autogenerate username 
- Mekanisme expired untuk pendaftaran

Permintaan ke PIC AHU: 
- Template Import Formasi

Pengangkatan hanya untuk Kategori C


Pindah Wilayah ke A hanya untuk instruksi menteri
Harus melaksanakan jabatan 3 tahun berturut2 untuk bisa C ke B → 50.000.000
Harus melaksanakan jabtan 4 tahun berturut2 untuk bisa C ke A dan instruksi menteri → 150.000.000
Harus melaksanakan jabatan 1 tahun beruturut2 untuk bisa B ke A dan instruksi menteri → 100.000.000
Kalo pindah jabatan yang turun / kategori sama 25.000.000 (semuanya bisa gaada syarat jabatan berapa tahun / instruksi menteri)

