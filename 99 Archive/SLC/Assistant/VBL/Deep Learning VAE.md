Halo semuanya pada video kali ini kita akan memulai program untuk Variational Autoencoder sederhana.

Berikut adalah gambar dari arsitektur VAE yang akan saya buat hari ini.
(Tunjukkin gambar)
Arsitektur terdiri dari 1 layer Dense yang berperan sebagai `encoder`, 1 layer Dense yang berperan sebagai `mean`, dan 2 layer Dense yang berperan sebagai `decoder`.

#### Untuk import library, loading image, dan preprocessing image sudah dibahas di video sebelumnya sehingga code yang digunakan sama.

#### Sebelum training model, perlu ditetapkan hyperparameter-hyperparameter yang akan dipakai. 
- `BATCH_SIZE = 100` adalah jumlah sampel data yang diproses sebelum model memperbaharui parameter.
- `IMAGE_ORIGINAL_SHAPE = x_train.shape[1:]` digunakan untuk menyimpan bentuk(shape) dari data gambar pelatihan
- `IMAGE_SIZE = IMAGE_ORIGINAL_SHAPE[0] * IMAGE_ORIGINAL_SHAPE[1] * IMAGE_ORIGINAL_SHAPE[2]` digunakan untuk menghitung ukuran total dari setiap gambar dengan mengalikan dimensi tinggi, lebar, dan channel warna
- `HIDDEN_DIM = 512` adalah dimensi dari layer tersembunyi, jika menggunakan lebih dari 1 layer maka akan ada lebih dari 1 hidden dimension. Disini valuenya akan mengikuti gambar arsitektur kita tadi, yaitu 512.
- `LATENT_DIM = 32` adalah dimensi dari layer latent/imajiner. Disini valuenya akan digunakan untuk layer mean dan layer standar deviasi.
- `MAX_EPOCHS = 500` adalah jumlah maksimum epoch (iterasi melalui seluruh dataset) yang akan digunakan dalam pelatihan model
- `LEARNING_RATE = 0.0001` adalah laju pembelajaran optimisasi model
Untuk memverifikasi saya akan print `IMAGE_ORIGINAL_SHAPE` seharusnya dimensi awal sama dengan value dari arsitektur saya, yaitu 41.616.

## Selanjutnya model perlu didefinisikan
#### Kita akan membuat class untuk VAE, class untuk model yang akan inherit dari `tf.keras.Model`
Pertama kita perlu define constructor unutk memanggil constructor dari parentnya. Selanjutnya kita akan mendefinisikan variabel `h_dim` sebagai index pertama dari parameter `dim` yang diberikan dan `z_dim` sebagai index kedua dari parameter `dim` yang diberikan.

Selanjutnya kita akan mendefinisikan layer-layer yang akan digunakan:
- `self.fc1` adalah layer Dense yang digunakan dalam encoder, sehingga jumlah unitnya menggunakan `h_dim`
- `self.fc2` adalah layer Dense yang digunakan sebagai layer mean di latent space, sehingga jumlah unitnya menggunakan `z_dim`
- `self.fc3` adalah layer Dense yang digunakan dalam mean di latent space, sehingga jumlah unitnya menggunakan `z_dim`
- `self.fc4` adalah layer Dense yang digunakan dalam decoder sebagai hidden layer, sehingga jumlah unitnya menggunakan `h_dim`
- `self.fc5` adalah layer Dense yang digunakan dalam decoder sebagai output layer, sehingga jumlah unitnya menggunakan `IMAGE_SIZE`
- `self.encoder_batch_norm` adalah layer BatchNormalization yang digunakan untuk melakukan batch normalization untuk encoder
- `self.decoder_batch_norm` adalah layer BatchNormalization yang digunakan untuk melakukan batch normalization untuk decoder

Selanjutnya, definisikan function encode, yang menerima parameter x, yaitu `input_features` yang digunakan. Pertama `input_features` akan dilakukan batch normalization menggunakan `self.encoder_batch_norm`, lalu masukkan hasil x ke layer `fc1` menghasilkan variabel `h`. Variabel h ini akan dimasukkan ke dalam `fc2` dan `fc3`. Walaupun mereka memiliki input yang sama, `fc2` dan `fc3` akan menjadi layer berbeda karena kegunaan mereka bebeda, `fc2` untuk `mean` dan` fc3` untuk `logvar`.
Selanjutnya, definisikan function reparameterize untuk menghitung hasil dari reparameterize trick. Pertama kita tentukan standar deviasi sebagai eksponen dari setengah `log_var`. Cari epsilon dengan menggunakan random normal sebanyak shape standar deviasinya, sehingga kita dapat return sesuai dengan rumus dari reparameterize trick, yaitu `mean + epsilon * standar deviasi`.
Berikutnya, definisikan function decode_logits untuk mendecode hasil dari probabilitas latent space dan menghasilkan value logits, yaitu value raw dari percobaan rekonstruksi sebelum diaktifkan menggunakan activation function. Dalam function decode_logits, masukkan `z` ke hidden layer dari decoder, output layer dari decoder, dan layer batch_norm lalu return hasilnya.
Definisikan function decode untuk mengaktifkan hasil dari fungsi `decode_logits` menggunakan activation function `tf.nn.sigmoid`.
Terakhir definisikan function call yang menggantikan perilaku pemanggilan objek, `inputs` akan di proses ketika objek VAE dipanggil. Di function ini, `inputs` diproses menggunakan encode untuk menghasilkan mean dan logvar. Selanjutnya pakai function reparameterize untuk menghasilkan variabel `z` dan decode variabel `z` tersebut untuk menghasilkan variable `x_recon_logits`. Dari function call ini value `x_recon_logits`, `mean`, dan `log_var` akan di return. 

#### Setelah model terdefinisikan, model VAE dapat di build.
Pertama kita construct model VAE dengan dimensi `HIDDEN_DIM`dan `LATENT_DIM`. Variable `HIDDEN_DIM`dan `LATENT_DIM` ini akan menjadi variabel `z_dim` dan `h_dim` di model yang dibuat. Selanjutnya model dapat di build dengan `model.build()`dengan `input_shape` `BATCH_SIZE`, `IMAGE_SIZE`. 
Kita dapat melihat summary dari model dengan `model.summary()`. Disini terdapat list dari layer-layer yang dapat dipakai. Selanjutnya define optimizer yang dipakai, yaitu menggunakan `tf.keras.optimizers.Adam` dengan learning rate dari `LEARNING_RATE` dari hyperparameter.

#### Untuk memudahkan training model, list gambar perlu di proses secara lebih lanjut
Ubah array x_train menjadi bentuk `dataset tensorflow` dimana setiap elemen adalah irisan dari array `x_train` menggunakan `tf.data.Dataset.from_tensor_slices`. 

Shuffle dataset menggunakan `dataset.shuffle(BATCH_SIZE * 5)` untuk mengacak dataset, dalam hal ini `BATCH_SIZE * 5` artinya buffer akan menyimpan lima kali jumlah sampel dalam satu batch. Pengacakan ini penting untuk mengurangi kemungkinan overfitting selama pelatihan, karena membantu memastikan bahwa model tidak melihat data dalam urutan yang sama selama setiap epoch. Setelah itu dataset akan dibagi menjadi beberapa batch menggunakan `.batch(BATCH_SIZE)`.

## Setelah model sudah di build, model perlu di training. 
Buat variable `list kosong` bernama `loss_history` dan `kldiv_history`. Tentukan num_batches dengan membagi jumlah dari training image dengan `BATCH_SIZE` dibulatkan ke bawah. 

Selanjutnya iterasi sebanyak jumlah epoch, untuk setiap epochnya train model yang ada di dataset. Untuk training setiap epochnya, kita perlu iterasi setiap batch di datasetnya. Pertama kita perlu ubah bentuk x menjadi ukuran yang sesuai untuk dimasukkan ke dalam model, yaitu `IMAGE_SIZE` dengan `-1` artinya sebagai otomatis menentukan dimensi yang sesuai.
Berikutnya blok perlu dibuka dengan `with tf.gradientTape() as tape:` untuk merekam operasi yang terjadi selama forward pass, yang memungkinkan tensorflow menghitung gradien selama backward pass. Train model menggunakan function call dari model tersebut lalu dapatkan semua value hasil dari trainingnya menggunakan `x_reconstruction_logits, mu, log_var = model(x)`.
Selanjutnya, kalkulasi `reconstruction_loss` dengan aktivasi sigmoid menggunakan `reconstruction_loss = tf.nn.sigmoid_cross_entropy_with_logits(labels=x, logits=x_reconstruction_logits)`. 
Hitung value dari `reconstruction_loss` dan normalisasi data tersebut dengan jumlah total data dalam batch.

Setelah didapatkan reconstruction loss, perlu dicari juga KL Div Loss karena VAE menggunakan kombinasi dari Reconstruction Loss dan KL Div Loss. Pencarian KL Div loss dapat menggunakan rumus yang tetap, yaitu `kl_div = -0.5 * tf.reduce_sum(1. + log_var - tf.square(mu) - tf.exp(log_var), axis=-1)`. Selanjutnya hitung rata-rata dari `KL_Div` dari seluruh batch. 
Hitung loss dengan menjumlahkan `loss reconstruction` dengan `KL Div`, kemudian menghitung rata-ratanya.  

Setelah melakukan forward pass, hitung gradien yang sudah direkam melalui `tape.gradients` dengan memasukkan `loss` yang didapatkan, dan semua `trainable_variables` yang ada di model. Setelah itu clip semua gradient yang didapatkan dengan menggunakan `tf.clip_by_norm(g, 15)`. Clip by norm digunakan agar gradient yang dihasilkan tidak terlalu besar. 
Lakukan back propagation dengan `apply gradients` di dalam optimizer. `Apply Gradients` berfungsi untuk memperbarui bobot model berdasarkan gradien yang dihitung.

Setelah iterasi semua data di batch tersebut, print status dari training model menggunakan `print(f"Epoch[{epoch + 1}/{MAX_EPOCHS}], Reconst Loss: {float(reconstruction_loss):.2f}, KL Div: {float(kl_div):.2f}")`, lalu masukkan history dari `kl div loss` dan `loss` ke list yang sudah di define di awal agar dapat di plotting.

 Tunggu sampai semua iterasi epoch selesai di eksekusi sambil perhatikan status yang di print

`fast forward`

Setelah semua epoch selesai di eksekusi, history dari `kl-div` dan `loss` dapat di plot. Buat figure dengan  ukuran `figsize=(20, 4)`.
Kita akan buat subplot dengan 1 baris dan 2 kolom menggunakan `plt.subplot(1, 2, 1)`. Selanjutnya plot loss menggunakan `plt.plot(loss_history)`, di sumbu x terdapat `epochs` dan di sumbu y terdapat `loss`.
Selanjutnya buat subplot  di index ke 2 menggunakan `plt.subplot(1, 2, 2)`. Selanjutnya plot loss menggunakan `plt.plot(kldiv_history)`, di sumbu x terdapat `epochs` dan di sumbu y terdapat `KL Divergence History`.
Terakhir munculkan plotting menggunakan `plt.show()
Dapat dilihat dari plotting, loss history dan kl divergence history berkurang secara stabil.

#### Visualisasi perbandingan dari data test dengan hasil percobaan rekonstruksi model dapat dibuat menggunakan plotting.
Karena model dibuat menggunakan arsitektur Variational Autoencoder, rekonstruksi gambar bisa di dapatkan dari dua cara,

#### Pertama, percobaan rekonstruksi gambar dari data test
Simulasikan pemanggilan model dengan melakukan model.encode pada `x_test`, di reshape mengikuti dimensi `IMAGE_SIZE` dan `-1` artinya untuk dimensinya akan dicari secara otomatis, sesuai dengan jumlah gambar di `x_test`. Selanjutnya buat z dengan reparameterize mean dan log_var.
Terakhir decode variabel z dengan menggunakan `model.decode`, yaitu decode variabel secara langsung yang sudah di aktivasi menggunakan function `sigmoid`. Hasil decoder tersebut akan di reshape menggunakan `tf.reshape` untuk mengembalikan imagenya ke dimensi aslinya dan dikalikan lagi dengan 255. Hasil dikalikan dengan 255, karena saat pertama kali gambar di normalisasi, datanya dibagi dengan 255. Selanjutnya gambar di convert kembali ke tipe data `np.uint8`.

Setelah itu gambar dapat dibuat dimunculkan dalam plotting dengan iterasi.
Pertama kita akn iterasi untuk memunculkan seluruh gambar asli dari  `x_test`. Menggunakan `plt.subplot` dengan 2 untuk menentukan jumlah baris, number untuk jumlah kolom, dan `index + 1` untuk menentukan posisi index gambar. Selanjutnya munculkan gambar menggunakan `plt.imshow` dari `x_test` di index tersebut, di reshape mengikuti dimensi aslinya. Selanjutnya set x_axis dan y_axisnya untuk tidak visible agar angka dan sumbu grafik tidak terlihat.

Terakhir, kita akan iterasi untuk memunculkan prediksi rekonstruksi dari `x_test`. Menggunakan `plt.subplot` dengan 2 untuk menentukan jumlah baris, number untuk jumlah kolom, dan `number + index + 1` untuk menentukan posisi index gambar. Index gambar dimulai dari kolom ke-11 sampai ke-20 untuk baris kedua. Selanjutnya munculkan gambar menggunakan `plt.imshow` dari variabel `out` yang dihasilkan dari decoding image data test, diubah bentuknya menjadi numpy lalu di reshape mengikuti dimensi aslinya. Selanjutnya set x_axis dan y_axisnya untuk tidak visible.

Dapat dilihat, untuk hasilnya lebih bagus daripada Vanilla AE karena kita menggunakan probabilitas dalam latent spacenya. 

#### Visualisasi cara kedua adalah dengan menggunakan random normal dari latent space.
Cara kedua tidak menggunakan test data, melainkan menggunakan sample random dari latent space untuk mencoba rekonstruksi data baru. 
// Komen code sebelumnya //
Untuk mengambil angka random dari latent space, dapat digunakan function ` z = tf.random.normal((BATCH_SIZE, LATENT_DIM))`

Ketika dijalankan ulang, model akan mencoba rekonstruksi gambar baru. Walaupun gambar masih kurang jelas, namun model akan mencoba untuk membuat gambar baru dengan menggabungkan beberapa fitur dari gambar training, misalnya ada sepatu tinggi, sepatu rendah dan warna sepatu akan berbeda-beda tergantung dengan random di latent space. 

Terima kasih.
