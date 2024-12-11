Pertanyaan
1. Jelaskan kapan kita harus memakai multi-thread atau multi-process tambahan dalam program!

Multi - Threading: 
Untuk menjalankan beberapa tugas yang ringan dan terkait satu sama lain dalam satu proses. Semua thread berbagi dalam memori yang sama, sehingga komunikasi antar thread bisa lebih cepat. Cocok untuk I/O bound dan memerlukan banyak proses yang menunggu (membaca file, koneksi jaringan, dan lain-lain)

Multi - Processing: 
Untuk menjalankan beberapa proses yang mandiri, sehingga Multi-Processing dapat digunakan untuk memanfaatkan semua core CPU. Setiap proses akan memiliki memori-terpisa, sehingga lebih aman dibandingkan dengan Multi-Threading jika proses tidak berhubungan satu sama lain. Cocok untuk aplikasi yang CPU-Bound (membutuhkan waktu untuk komputasi sehingga ingin memaksimalkan jumlah core CPU yang dipakai, contoh: AI / Machine Learning Training). 

2. Apakah kita bisa melakukan concurrency dengan menambahkan child process?

Bisa. Penggunaan child process memungkinkan aplikasi untuk melakukan operasi secara bersamaan, sehingga setiap child process dapat mengerjakan tugas tertentu secara independent secara bersamaan (concurrent). 


3. Apa saja kekurangan dan kelebihan concurrency?

Kelebihan concurrency: 
- Efisiensi penggunaan sumber daya karena banyak tugas dapat dijalankan secara bersamaan dan berututan
- Reponsif terhadap input/output karena conccurency membuat proses lain dapat berjalan secara independen sambil menunggu respon dari user. 
- Waktu pemrosesan berkurang karena untuk menyelesaikan pekerjaan yang besar, proses dapat dibagi-bagi menjadi beberapa proses kecil dan dikerjakan oleh beberapa proses sekaligus secara bersamaan.

Kekurangan concurrency: 
- Deadlock: Beberapa proses dapat saling menunggu proses yang dikunci oleh satu sama lain, sehingga proses akan stuck karena kedua proses tersebut saling tunggu-menunggu. 
- Concurrency akan membutuhkan resource tambahan untuk membuat dan mengelola thread / proses concurrency yang kompleks. Komunikasi antar-proses/thread juga membutuhkan resource & waktu lebih karena membutuhkan koordinasi intensif antar thread yang saling bertukar data. 

4. Buatkan code contoh pada slide 8 dan 9 dalam C dengan menggunakan pthread()!
5. Apa perbedaan antara Deadlock dan Process Starvation?

Deadlock: Situasi di mana 2/lebih proses saling menunggu untuk memperoleh resource yang dikunci oleh satu sama lain, sehingga kedua proses akan stuck saling menunggu. Sehingga deadlock perlu di fix secara manual sehingga kedua proses dapat berjalan dengan semestinya. Pada kasus ini, kedua process jadi tidak dapat akses ke resource dan keduanya stuck

Process Starvation: Ketika process tidak mendapatkan akses ke resource yang dibutuhkan karena resource tersebut terus diberikan ke proses lain dengan prioritas tinggi. Proses ini bisa terus menunggu sampai proses dengan prioritas tinggi berhenti (tapi ada kemungkinan bahwa proses berprioritas tinggi tidak berhenti terus menggunakan resource yang ada, sehingga proses dengan prioritas rendah terus merasakan process starvation). Contoh: dalam sistem penjadwalan, ada 1 proses yang tetap hidup dan terus menunggu untuk dijalankan karena proses dengan prioritas tinggi terus bermunculan.

   
6. Apa perbedaan concurrency dan synchronization!
Concurrency: Menjalankan beberapa proses / tugas secara bersamaan dalam suatu sistem. Semua sistem berjalan secara paralel & bersamaan maupun interleaving,  dan dapat beralih ke tugas-tugas lain dengan cepat. Membutuhkan penjadwalan dan pembagian proses yang efisien, sehingga tugas yang siap dijalankan dapat dikerjakan sambil menunggu tugas lainnya.

Synchronization: Mengendalikan akses ke resource oleh beberapa process/thread dalam suatu sistem concurrent sehingga tidak terjadi race condition dimana dua/lebih thread mencoba mengakses dan memodifikasi resource yang sama secara bersamaan tanpa control yang tepat. 