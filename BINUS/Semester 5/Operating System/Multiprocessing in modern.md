Multithreading → kemampuan OS untuk mengelola beberapa thread secara bersamaan di dalam sebuah process.

- Single-Threaded Approach: 1 process 1 thread
- Multi-Threaded Approach: 1 process banyak thread
    - Multi-Threaded Program belum tentu concurrent karena bisa saja sebuah thread memerlukan sinkronisasi thread lain agar bisa memulai proses eksekusi.
    - Multi-Threaded Program dikatakan concurrent ketika thread yang berbeda beroperasi secara overlapping.

##### User Level Thread
- Semua manajemen thread dilakukan di level aplikasi, dan kernel tidak mengetahui keberadaan thread.
- Untuk mengatasi kelemahan User-Level Threads (ULT), ada dua pendekatan utama:
    - **Jacketing**: Teknik ini mengubah sistem panggilan yang bersifat blocking menjadi non-blocking. Dengan demikian, jika satu thread melakukan panggilan sistem, thread lainnya tetap bisa berjalan, menghindari pemblokiran total.
    - **Menulis aplikasi sebagai beberapa proses**: Daripada menggunakan banyak thread, aplikasi dapat dipecah menjadi beberapa proses. Namun, pendekatan ini menghilangkan keunggulan utama thread, yaitu efisiensi dan komunikasi cepat antar thread dalam satu proses.

![[Pasted image 20241105041706.png]]


##### **Kernel Level Thread (KLT)**
- Manajemen thread dilakukan oleh kernel, dan thread-level API disediakan untuk aplikasi.
![[Pasted image 20241105041745.png]]
 