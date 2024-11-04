Struktur data yang digunakan untuk menyimpan informasi penting (process elements) sebuah process agar OS dapat mengelola dan mengontrol process tersebut. 

Program yang dieksekusi/berjalan di komputer
Setiap process merupakan entity yang berbeda
- Parent Process: Process pertama yang dibuat
- Child Process: Process baru dari parent process

Komponen Utama
- Process ID (PID)     : Identifikasi unik untuk setiap proses
- Process State         : Status proses, misalnya Running, Waiting, dan Ready
- Program Counter   : Menunjukkan instruksi berikutnya yang akan dieksekusi
- Memory Pointers   : Address lokasi penyimpanan data dan instruksi sebuah proses dalam memori
- Context Data          : Data yang menyimpan status register dan informasi penting lainnya sehingga process bisa dilanjutkan kembali dari titik terakhir process berhenti, (checkpoint)
- I/O Status Information: Menyimpan informasi tentang I/O device
- Accounting Information: Menyimpan informasi terkait penggunaan resource seperti jumlah memori yang dialokasikan, durasi penggunaan CPU, waktu mulai, waktu process selesai, dan lain-lain.

Role:
- Menyimpan semua informasi mengenai process yang diperlukan oleh OS
- Mengatur dan mengelola process OS
- Mendifinisikan State OS
- Informasi Penjadwalan
- Penanganan Interupsi
- Memfalitasi switching process
- Alokasi Resource
