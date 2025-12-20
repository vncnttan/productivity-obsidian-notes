Halo semuanya, pada video kali ini kita akan membahas tentang AutoEncoder.

// ganti slide

AutoEncoder sendiri merupakan salah satu jenis neural network yang digunakan untuk melakukan unsupervised learning. Unsupervised learning sendiri merupakan jenis metode pada machine learning dimana model melalui proses training menggunakan data yang tidak berlabel.

AutoEncoder bertujuan untuk merepresentasikan data input menjadi bentuk yang lebih padat atau terkompresi, kemudian membangun kembali data tersebut dengan seakurat mungkin.

Secara singkat, AutoEncoder mempunyai 2 bagian utama, yaitu Encoder yang berperan untuk melakukan encoding terhadap input yang diberikan, dan Decoder yang berperan untuk mengembalikan format atau melakukan decoding untuk menghasilkan output yang sesuai.
// ganti slide
Lebih lengkap dapat kita lihat melalui gambar ini.

Pada gambar, layer-layer awal pada model akan melakukan proses encode sehingga input data akan disimpan kedalam format dengan dimensi yang lebih kecil. Hasil data yang sudah di encode ini direpresentasikan sebagai suatu ruang imajiner dengan dimensionalitas kecil yang berisikan informasi fitur-fitur penting dari data dalam bentuk titik-titik vektor dengan istilah Latent Space. Dapat dilihat pada gambar bahwa Latent Space digambarkan dengan ukuran yang lebih kecil.

Lalu, sesudah itu data tersebut akan melalui tahap rekonstruksi ulang pada layer-layer Decoder supaya dapat menghasilkan output dengan format yang sama dengan format data input.

Hingga saat ini, sudah banyak jenis AutoEncoder yang dibuat untuk memenuhi kebutuhan pada kasus-kasus tertentu. Perbedaan dari masing-masing AutoEncoder tentunya terletak pada jumlah dan jenis layer yang digunakan. Namun, implementasi AutoEncoder yang paling sederhana, yang juga dikenal sebagai Vanilla AutoEncoder pertama kali diperkenalkan pada tahun 2006 dengan hanya 1 layer encoder dan 1 layer decoder.

Berikut adalah visualisasi dari arsitektur Vanilla AutoEncoder. Dapat dilihat bahwa terdapat hanya 1 layer encoder dan 1 layer decoder. Lalu ditengah terdapat Latent Space.

Vanilla AutoEncoder dapat bekerja dengan baik untuk data-data yang tidak begitu kompleks, namun untuk dataset yang kompleks dan berjumlah besar terdapat berbagai masalah yang dapat muncul jika menggunakan Vanilla AutoEncoder.

Salah satu masalah yang common dalam penggunaan Vanilla AutoEncoder adalah dimana Latent Space yang dihasilkan dari proses encoding tidak continuous atau tidak saling terhubung dengan baik. Hal ini dapat menyebabkan kesulitan dalam rekonstruksi ulang karena terdapat "lubang" pada informasi yang diberikan.

(Boleh sambil tunjuk ppt nya contohnya)

Masalah ini dapat diselesaikan dengan menggunakan Variational AutoEncoder. Variational AutoEncoder merupakan salah satu jenis AutoEncoder. Secara garis besar, arsitektur Variational AutoEncoder mirip dengan arsitektur Vanilla AutoEncoder. Akan tetapi terlihat jelas bahwa pada Variational AutoEncoder, sebelum data hasil encoding masuk ke Latent Space, terdapat 2 value. 2 value tersebut merupakan mean vector value dan value standar deviasi dari hasil encoding. Mean vector value dan standar deviasi ini kemudian akan digunakan untuk melakukan reparametrize.

Berikut adalah visualisasi perbandingan arsitektur Vanilla AutoEncoder dengan Variational AutoEncoder. Terlihat perbedaannya disini (ditandain pakai zoom it)

Ketika kita menggunakan hasil encoding secara langsung, value tersebut akan membuat suatu titik pada Latent Space. Akan tetapi dengan menggunakan value mean vector dan standar deviasi, maka yang dihasilkan bukanlah sebuah titik mutlak, namun merupakan titik-titik probabilitas yang membentuk suatu area di Latent Space. Sehingga jika ada suatu titik misalkan disini (sambil tandain 1 titik), kita sudah tau bahwa dia termasuk ke area atau kelompok yang mana.


Selanjutnya kita akan masuk ke reparameterize function.
[NJ]
Reparameterize function adalah function yang dipakai untuk mengubah bentuk dari layernya, dari original form ke reparameterised form. Ketika training suatu model, model akan melakukan Backpropagation untuk memungkinkan model belajar dari kesalahannya dan memperbaiki performa secara bertahap dan melakukan tugas yang diinginkan. Backpropagation adalah metode model untuk memperbaharui bobot-bobot di dalam suatu node jaringan secara iteratif berdasarkan seberapa jauh output jaringan dari hasil yang diharapkan. Seberapa jauh output jaringan dari hasil yang diharapkan inilah yang disebut dengan loss. 

Dapat dilihat di gambar (tunjuk-tunjuk gambar), original form memiliki node random yang dihasilkan dari node-node mean dan logaritma dari varians. Salah satu syarat dari Backpropagation adalah node yang digunakan harus deterministik atau tetap. Hal ini penting agar pembelajaran tetap konsisten, perhitungan loss tepat, dan pelacakan perubahan bobot tepat. Random Node merupakan hasil dari persebaran distribusi mean dan standar deviasi, karena node mean dan standar deviasi menghasilkan probabilitas node. Dalam original form, Backpropagation tidak dapat mencapai Mean Vector Node dan Standard Deviasi Value Node karena terdapat random node z. Untuk memperbaiki hal ini, digunakanlah reparameterized function untuk mengubah formnya menjadi reparameterised form. 

Reparameterised form memperkenalkan epsilon, yaitu sample random dari probabilitas dengan mean 0 dan standar deviasi 1.Epsilon digunakan untuk mengubah distribusi probabilitas menjadi distribusi deterministik, sehingga backpropagation dapat memperbaharui bobot mean dan standar deviasi melalui z. Proses reparameterisasi z dapat ditemukan dengan menggunakan rumus mean + standar deviasi * epsilon.

Berikut adalah cara perhitungan dari Loss untuk Variational Autoencoder. Vanilla Autoencoder hanya menggunakan reconstruction loss untuk memperhitungkan loss dari model, sedangkan Variational Autoencoder menggunakan Reconstruction Loss dan Kullback Leiber Divergence Loss atau yang sering dipanggil KL Div Loss. 

KL Div Loss digunakan untuk menilai seberapa jauh distribusi latent space yang diperoleh dari model dengan distribusi ideal. Tujuan dari perhitungan KL-Div Loss adalah mendorong distribusi titik di latent space agar lebih terstruktur dan teratur, sehingga memudahkan generasi data baru dan meningkatkan kualitas representasi data. Dapat dilihat dari gambar, persebaran titiknya menjadi merata, tetapi kurang sesuai dengan data output yang seharusnya.

Untuk menghasilkan model yang akurat, perlu digunakan kombinasi antara reconstruction loss dengan kl-div loss. Sehingga persebaran titiknya menjadi lebih merata, namun tetap sesuai dengan data output yang diinginkan. Total loss dari VAE dapat diperhitungkan dengan Reconstruction Loss + KL Div Loss. 

