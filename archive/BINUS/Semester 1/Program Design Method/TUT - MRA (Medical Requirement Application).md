Contoh:
![[Pasted image 20221207114158.png]]


Medical Record Application (MRA)
Application / System Definition
Pasien harus mendaftar melalui perangkat gadget, maupun web, maupun perangkat di dalam rumah sakit yang dipandu oleh petugas rumah sakit dengan menginput semua data yang dibutuhkan, mulai dari biodata, alamat, penyakit keturunan, informasi keluarga, KTP, dan lainnya. Jika pasien sudah pernah mendaftar, pasien dapat *login* atau masuk ke akun tersebut yang juga menampilkan histori pasien. Pasien dapat mencari jadwal di perangkat tersebut untuk pengobatan dan melihat jumlah antrean yang ada, sesuai dengan ketersediaan dokter yang sesuai dan kedaruratan gejala pasien. Jika pasien menemukan jadwal, pasien dapat mereservasi waktu pengobatan dan mendapatkan kode unik. 

Kode unik tersebut dapat ditukarkan di resepsionis, untuk mendapatkan nomor antrean di hari pengobatan atau resepsionis dapat mewakilkan pasien untuk mendaftar dan memberikan nomor antrean di hari pengobatan. Pasien dialihkan ke ruang tunggu untuk menunggu waktu gilirannya yang estimasi waktunya muncul di tv / perangkat ruang tunggu untuk setiap nomornya. 10 menit sebelum waktu pengecekan, nama akan muncul di perangkat pasien, maupun ruang tunggu untuk dipanggil. Jika pasien sudah hadir, petugas ruang tunggu dapat menandai di sistem, dan nomor antrian hilang dari ruang tunggu. Pasien dialihkan ke poli untuk pengecekan awal.

Perawat mengecek tensi, berat badan, tinggi badan, dan penyakit keturunan pasien untuk di input di sistem. Pasien yang sudah dilakukan pengecekan awal akan mendapatkan nomor ruang dokter untuk melakukan pengobatan setelah giliran waktunya. Dokter melihat histori pasien dan gejala singkat pasien untuk memulai pengecekan dan pengobatan yang dapat dilakukan. Setelah pengobatan dokter menjelaskan detail penyakit pada pasien/keluarga pasien, lalu memberikan resep obat ke dalam sistem. Dokter dapat mencetak hasil tes atau pantangan khusus, dan cara penggunaan obat yang diberikan beserta dengan interval penggunaannya untuk diberikan pada pasien. Waktu pengecekan, tes yang dilakukan juga diinput ke sistem untuk perhitungan biaya pengobatan. Pasien dialihkan ke pusat apotek dan pengambilan di rumah sakit.

Apoteker dapat melihat nama pasien, dan obat resep dokter yang diberikan sesuai antrean. Perawat menyiapkan obat yang dibutuhkan sebelumnya, sehingga ketika pasien sampai ke pusat pengambilan obat, obat sudah siap untuk dikemas dan dibawa. Pasien mengambil obat, dan apoteker menandai di sistem bahwa obat telah diambil. Pasien dialihkan menuju pusat pembayaran. Di pusat pembayaran total biaya pengobatan pasien dimunculkan di gadget kasir. Pasien membayar sesuai dengan biaya pengobatan dan pilihan metode pembayaran yang diinginkan. Jika proses transaksi pembayaran sudah selesai, kasir akan menandai transaksi pembayaran dan akan mencetak detail transaksi dan hasil pengecekan/pengobatan yang dilaksanakan.




Functional Requirements

1. Pendaftaran Pasien
   - Pasien mendaftar atau masuk ke akun yang sudah ada (lengkap dengan biodata, penyakit keturunan, dan lain-lain secara lengkap)
2. Pencarian Jadwal
   - Pasien dapat mendaftar terlebih dahulu di aplikasi mengenai keluhan singkat dan tanggal pengobatan yang diinginkan
   - Sistem akan menampilkan jumlah antrean yang ada di waktu tersebut, jika pasien memilih untuk melanjutkan, nomor antrean akan didaftarkan untuk pasien (tetapi tidak diberikan). Sistem akan menampilkan waktu pengobatan pasien dan kode unik yang dapat diberikan.
   - Sistem dapat menginformasikan kepada pasien jika kapasitas penuh dan memberikan pilihan kepada pasien untuk mengganti jadwal. Hal ini diperiksa sebelum pasien mengkonfirmasi jadwal (Jika pasien sudah mendapatkan kode unik, penggantian jadwal tidak dapat dilaksanakan).
3. Pengambilan antrean melalui Resepsionis
   Pengambilan antrean melalui resepsionis menandakan pasien hadir pada hari pengobatan
   - Jika sudah mendapatkan kode, pasien dapat menunjukkan kode tersebut untuk mendapatkan nomor antrean, jika belum, pasien dapat mendaftar langsung di tempat dengan sistem First In First Out (FIFO). Jika kapasitas penuh dengan reservasi, pencarian jadwal untuk hari itu juga tidak dapat dilakukan. Dalam keadaan darurat, resepsionis dapat langsung mengalihkan pasien ke ruang IGD dengan dokternya. 
   - Resepsionis menginput informasi mengenai waktu pengobatan, dokter yang dipasangkan, dan gejala/keluhan pasien ke dalam sistem
   - Pasien mendapatkan nomor antrian dan sistem menampilkan nomor antrean tersebut di ruang tunggu
   - Sistem akan memberikan estimasi waktu penungguan
   - Pasien dapat membatalkan perjanjian, atau mengundur perjanjian yang akan direview lagi oleh resepsionis dan sistem.
   - Jika giliran pasien sudah dekat, nama akan ditampilkan di ruang tunggu antrean dan ditampilkan di meja resepsionis untuk dipanggil
4. Pengecekan awal oleh Perawat
   - Jika pasien sudah datang, tandai di sistem bahwa pasien sudah keluar dari ruang antrean
   - Perawat mendata lebih lanjut mengenai keluhan pasien, tensi, tinggi badan, berat badan, dan lain sebagainya dan menambahkan data tersebut ke dalam sistem untuk selanjutnya ditunjukkan kepada dokter
   - Sistem akan memberikan alamat ruangan dokter tempat pasien akan berobat setelah pengguna ruangan tersebut sebelumnya sudah selesai menggunakannya
5. Penanganan Dokter
   - Dokter dapat melihat histori penyakit pasien, alergi pasien, kondisi pasien, dan keluhan/gejala pasien 
   - Dokter memasukkan detail penyakit dan hasil terbaru kondisi pasien
   - Dokter memasukkan progress pada biodata yang lama tentang progress pasien sekarang, juga pembaharuan informasi terbaru mengenai alergi dan catatan medis pasien lainnya
   - Dokter menambahkan detail baru mengenai pasien di akunnya jika ditemukan, seperti misalnya ditemukan penyakit baru atau hasil tesnya berubah. (Misalnya kadar gula/kolesterol meningkat).
   - Dokter membuat daftar obat yang diperlukan
   - Dokter menambahkan rekomendasi waktu berikutnya untuk melakukan check-up kembali
   - Jika ada, dokter tambahkan pantangan-pantangan makan yang mungkin harus dilakukan
   - Print laporan detail penyakit, obat, saran, dan pantangan yang diberikan oleh dokter untuk diberikan pada pasien.
   - Dokter menandai bila sesi sudah selesai.
   - Otomatis menambahkan biaya pengobatan di akun pasien sesuai dengan harga dokter, waktu sesi, cek yang dilaksanakan, dan biaya lainnya.
6. Pengambilan Obat
   - Apoteker melihat list obat yang dibutuhkan oleh suatu pasien.
   - Apoteker menandai apabila obat sudah diambil oleh pasien.
   - Otomatis menambahkan biaya pengobatan di akun pasien sesuai dengan harga obat.
7. Pembayaran
   - Bila jadwal dengan dokter sudah ditandai betul dan pengambilan obat sudah ditandai betul, print total biaya dan detail biaya pasien.
   - Tandai bila biaya pasien lunas.
   - Print out bukti pembayaran dan pelunasan pasien beserta dengan detail hasil tes dan chekup yang dilaksanakan.
