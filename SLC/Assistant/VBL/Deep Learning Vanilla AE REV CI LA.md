Halo semuanya, pada video kali ini kita akan memulai program untuk Vanilla AutoEncoder sederhana.

Berikut adalah gambar dari arsitektur Vanilla Autoencoder yang akan saya buat hari ini. (Tunjukkan gambar).
Arsitektur terdiri dari 1 layer dense yang berperan sebagai encoder dan 1 layer dense yang berperan sebagai decoder. 

Pertama, kita akan import library-library yang akan kita pakai, yaitu:
- `numpy as np`
- `tensorflow as tf`
- `tensorflow.keras as keras`
- `matplotlib.pyplot as plt`
dan
- `import os`


#### Selanjutnya kita akan akan masuk ke tahap awal yaitu untuk Load Dataset
Pertama, kita akan buat 1 variable dengan nama image_path lalu disini kita isi dengan string PATH ke directory dataset yang kita punya, yaitu "./Dataset". Disini kita akan iterasi menggunakan `os.listdir` untuk mendapatkan file-file yang ada didalam directory. Lalu, disini kita akan menggunakan `tf.keras.preprocessing.image.load_img` untuk melakukan load image. Disini kita akan isi dengan parameter berupa path dari image file nya dalam bentuk relative path. Lalu disini kita bisa memberikan parameter optional seperti target size dan kita berikan value sesuai dengan ukuran image pada dataset kita.


#### (Perbaikan, lebih baik dipreprocess dulu sebelum di split, diganti di code nya)
#### Tahapan selanjutnya adalah preprocessing image
Image data yang sudah kita simpan masih dalam bentuk yang mentah dan harus kita proses untuk dapat digunakan dalam proses training model. Ada beberapa hal yang perlu kita lakukan. Pertama, kita harus mengubah bentuk data dari list menjadi numpy array. Disini kita akan menggunakan `np.asarray()` dan masukkan parameter berupa data yang ingin dijadikan numpy array. Selanjutnya disini kita perlu mengkonversi tipe data dari value-value didalam array menjadi `np.float32` dan terakhir kita akan menormalisasi value nya menjadi antara 0 - 1 dengan membagi semua value dengan 255 karena value dari setiap pixel hanya berkisar dari 0 - 255. Kita mengkonversi tipe data menjadi float terlebih dahulu supaya value nya ketika dibagi 255 menjadi angka desimal, bukan integer antara 0 dengan 1.

#### Selanjutnya kita akan membagi dataset untuk training dan testing
Disini kita akan menggunakan array slicing untuk memisahkan antara training dataset dengan testing dataset. Disini kita akan membuat variable x_train yang akan menyimpan training dataset kita. Untuk training dataset kita akan memakan semua gambar kecuali 10 gambar terakhir yang kita sisakan sebagai testing dataset. Lalu, disini kita akan buat variable x_test untuk menyimpan testing dataset kita yang merupakan 10 gambar terakhir.


#### Sebelum training model, perlu ditetapkan hyperparameter-hyperparameter yang akan dipakai. 
- `MAX_EPOCHS = 500` adalah jumlah maksimum epoch (iterasi melalui seluruh dataset) yang akan digunakan dalam pelatihan model
- `BATCH_SIZE = 250` adalah jumlah sampel data yang diproses sebelum model memperbaharui parameter.
- `LEARNING_RATE = 0.0001` adalah laju pembelajaran optimisasi model
- `HIDDEN_DIM = 512` adalah dimensi dari layer tersembunyi, jika menggunakan lebih dari 1 layer maka akan ada lebih dari 1 hidden dimension. Disini valuenya akan mengikuti gambar arsitektur kita tadi, yaitu 512.
-  `ORIGINAL_DIM = x_train.shape[1] * x_train.shape[2] * x_train.shape[3]` adalah dimensi asli dari data gambar dengan mengalikan dimensi lebar, tinggi dan kedalaman warna dari gambar-gambar yang ada di x_train.
Untuk memverifikasi saya akan print bentuk dari x_train dan nilai dari `ORIGINAL_DIM`. Dapat dilihat bahwa value dari dimensi awal sama dengan value dari arsitektur saya, yaitu 41.616.

#### Untuk memudahkan training model, list gambar perlu di proses secara lebih lanjut
`x_train = x_train.reshape((x_train.shape[0], -1))` x_train perlu di reshape (diubah bentuknya) menjadi format yang cocok untuk model pembelajaran mesin. `x_train.shape[0]` mengacu pada jumlah sampel dalam x_train dan `-1` menyatakan bahwa dimensi lainnya `(lebar, tinggi, dan channel warna)` akan diubah menjadi satu dimensi. Dengan kata lain, array gambar akan diratakan menjadi vektor satu dimensi untuk setiap sample.
Lakukan hal yang sama untuk `x_test`
Selanjutnya ubah array x_train menjadi bentuk `dataset tensorflow` dimana setiap elemen adalah irisan dari array `x_train` menggunakan `tf.data.Dataset.from_tensor_slices`. Setelah itu dataset akan dibagi menjadi beberapa batch menggunakan `.batch(BATCH_SIZE)`.

## Selanjutnya kita akan masuk ke proses pembuatan model
#### Pertama kita akan membuat kelas Encoder, bagian dari Autoencoder yang bertugas untuk mengkrompesi data. Class dari Encoder akan inherit dari `keras.layers.Layer`.
Pertama kita perlu define constructor untuk memanggil constructor dari parentnya. Selanjutnya, definisikan hidden_layer dari Encoder yaitu `keras.layers.Dense` dengan jumlah units sesuai dengan dimensi hiddennya dan menggunakan fungsi aktivasi `ReLU`. 
Perlu di notes juga karena dalam arsitektur kali ini Encoder hanya menggunakan satu layer sebagai hidden layernya, maka kita hanya perlu mendefinisikan satu hidden layer. Hidden layer dapat ditambahkan untuk menambah kedalaman model dan hal ini akan mempengaruhi output yang dihasilkan.
Setelah membuat constructor, perlu didefinisikan juga function call yang menggantikan perilaku pemanggilan objek, `input_features` akan diproses ketika objek Encoder dipanggil. Di function ini, `input_features` yang diproses menggunakan `hidden_layer` yang sudah di define akan di return.

#### Kedua, kita akan membuat kelas Decoder, bagian dari Autoencoder yang bertugas untuk merekonstruksi data dari representasi terenkripsi ke format mendekati aslinya. Class dari Decoder akan inherit dari `keras.layers.Layer`.
Pertama kita perlu define constructor untuk memanggil constructor dari parentnya. Selanjutnya, definisikan output_layer dari Decoder yaitu `keras.layers.Dense` dengan jumlah units sesuai dengan dimensi gambar aslinya dan menggunakan aktivasi `ReLU`.
Perlu di notes juga Decoder dapat memiliki beberapa hidden layer sebelum memasuki output layer, sesuai dengan keperluan dari model.
Setelah membuat constructor, perlu didefiniskan juga function call. `Encoded` akan diproses ketika object decoder dipanggil. Di function ini, `encoded` yang diproses menggunakan `output_layer` akan di return.

#### Terakhir, kita akan membuat kelas Autoencoder. Kelas yang menggabungkan `Encoder` dan `Decoder` menjadi satu model. Class  AutoEncoder akan inherit dari `keras.Model`.
Pertama kita perlu define constructor untuk memanggil constructor dari parentnya. Definiskan encoder dan decoder yang akan digunakan, hidden_dim dan original_dim adalah argumen yang akan digunakan dalam constructor Encoder dan Decoder. Selanjutnya, definisikan list loss untuk menyimpan nilai loss selama pelatihan. 
Setelah membuat constructor, perlu didefinisikan juga function call, `input_features` akan di proses ketika model Autoencoder dipanggil. Pertama, `input_features` akan dimasukkan ke encoder untuk menghasilkan encoded. Pemanggilan objek ini akan menggunakan metode call yang di definisikan di encoder. Selanjutnya hasil `encoded` ini akan dimasukkan kembali ke decoder untuk menghasilkan `reconstructed`. Terakhir `reconstructed` akan di return sebagai hasil dari Autoencoder model.

## Step selanjutnya adalah mendefinisikan fungsi-fungsi untuk training.
#### Definisikan fungsi loss untuk menghitung perbedaan dari output yang dihasilkan model dengan input aslinya. Loss membutuhkan dua parameter, preds (prediksi dari model)  dan real (data asli/target sebenarnya)
Dengan menggunakan Mean Squared Error (MSE) sebagai metode perhitungan loss, loss didapatkan dari rara-rata kuadrat selisih antara prediksi dengan data asli. Hasil dari perhitungan tersebut akan di return. `return tf.reduce_mean(tf.square(tf.subtract(preds, real))):`

#### Selanjutnya definisikan fungsi train untuk melatih model dalam satu iterasi. Train memerlukan tiga parameter, yaitu model (model yang akan dilatih), opt(optimizer untuk memperbarui bobot model), dan original(data asli yang digunakan untuk pelatihan).
Pertama blok perlu dibuka dengan `with tf.gradientTape() as tape:` untuk merekam operasi yang terjadi selama forward pass, yang memungkinkan tensorflow menghitung gradien selama backward pass.
Lalu, lakukanlah forward pass dengan `preds = model(original)`
Hitung reconstruction_error dengan memanggil fungsi loss yang didefinisikan sebelumnya, menggunakan prediksi dari model dan data asli. `reconstruction_error = loss(preds, original)`
Setelah melakukan forward pass, hitung gradien yang sudah direkam melalui `tape.gradients` dengan memasukkan `reconstruction_error` yang didapatkan, dan semua `trainable_variables` yang ada di model. `trainable_variables` adalah semua variable (bobot maupun bias) yang ada di setiap layer di model tersebut yang dapat di adjust di model untuk di latih. Selanjutnya gabungkan setiap gradien dengan variabel yagn daapt dilatih ke dalam variabel `gradient_variables` agar dapat di input ke dalam `opt.apply_gradients`. Apply gradients berfungsi untuk memperbarui bobot model berdasarkan gradien yang dihitung.
Terakhir value yang akan dikembalikan adalah reconstruction error yang didapatkan.

#### Definisikan fungsi train_loop untuk iterasi setiap epochnya. Dalam setiap iterasi train_loop akan memanggil function train.
Iterasi selama jumlah epoch yang dibutuhkan, `for epoch in range(epochs):`
Inisialisasi loss_list sebagai list kosong, lalu iterasi untuk setiap `batch_features` yang ada di `dataset`, pertama kita perlu `train` untuk setiap batchnya dan menangkap value dari `reconstruction_lost`nya. lalu kita akan menambahkan hasil dari reconstruction loss tersebut ke dalam loss_list yang sudah didefinisikan tadi.
Setelah semua batch_features yang berada di dataset sudah di train, masukkan rata-rata dari loss yang didapatkan ke `model.loss` dan print status menggunakan `print(f"Epoch[{epoch + 1}/{MAX_EPOCHS}], Loss: {np.mean(loss_list):.2f}")`.


## Setelah semua fungsi-fungsinya sudah di define, kita perlu eksekusi semua function untuk dari Autoencoder
Pertama, buat objek Autoencoder menggunakan constructor Autoencoder. Constructor dari autoencoder akan `hidden_dim` dan `original_dim`. Definisikan optimizer yang akan digunakan, disini gunakan optimizer `Adam` dengan `learning_rate` dari batch `LEARNING_RATE`. Selanjutnya,  panggil function `train_loop` dan masukkan objek model kita, `optimizer`, ` training_dataset`, dan `jumlah epoch` yang dipakai. Tunggu sampai function `train_loop` selesai di eksekusi sambil perhatikan status yang di print

`fast forward`

Setelah `train_loop` selesai di eksekusi sampai epoch terakhir, kita dapat melihat bahwa lossnya akan berkurang untuk setiap epochnya. Artinya model belajar untuk menurunkan loss yang didapatkan di setiap epochnya. 

#### Hasil dari loss di autoencoder dapat di plotting menggunakan `plt.plot(range(MAX_EPOCHS), autoencoder.loss)`.
Di sumbu x terdapat `epochs` dan di sumbu y terdapat `loss`. Terakhir kita munculkan plotting menggunakan `plt.show()`

#### Visualisasi perbandingan dari data test dengan hasil percobaan rekonstruksi model dapat dibuat menggunakan plotting.
Variabel `number` didefinisikan sebagai jumlah gambar dalam 1 baris yang akan dimunculkan. Selanjutnya akan dibuat figure dengan ukuran `figsize=(20, 4)`.

Pertama kita akan iterasi untuk memunculkan seluruh gambar asli dari `x_test`. Menggunakan `plt.subplot` dengan 2 untuk menentukan jumlah baris, number untuk jumlah kolom, dan `index + 1` untuk menentukan posisi index gambar. Selanjutnya munculkan gambar menggunakan `plt.imshow` dari `x_test` di index tersebut, di reshape mengikuti dimensi aslinya. Selanjutnya set x_axis dan y_axisnya untuk tidak visible agar angka dan sumbu grafik tidak terlihat.

Terakhir, kita akan iterasi untuk memunculkan prediksi rekonstruksi dari `x_test`. Menggunakan `plt.subplot` dengan 2 untuk menentukan jumlah baris, number untuk jumlah kolom, dan `number + index + 1` untuk menentukan posisi index gambar. Index gambar dimulai dari kolom ke-11 sampai ke-20 untuk baris kedua. Selanjutnya munculkan gambar menggunakan `plt.imshow` dari `x_test yang di input ke autoencoder` di index tersebut, diubah bentuknya menjadi numpy lalu di reshape mengikuti dimensi aslinya. Selanjutnya set x_axis dan y_axisnya untuk tidak visible.

`plt.tight_layout` digunakan untuk mengatur layout agar lebih rapih, tidak tumpang tindih, dan berdekatan, dan `plt.show()` digunakan untuk menampilkan figur yang telah dibuat.

### Summary
Dapat dilihat dari visualisasi bahwa hasil rekonstruksi sudah mulai menggambarkan gambar aslinya. Walaupun terdapat beberapa perbedaan, warna dan outline dari gambar asli sudah terbentuk di hasil rekonstruksi gambar testing walaupun model tidak pernah menemui data dari testing.

#### Batch Normalization dapat ditambahkan secara opsional.
Batch Normalization layer dapat ditambahkan sebelum hidden layer encoder dan setelah output layer decoder. Batch Normalization layer adalah teknik yang digunakan dalam deep learning yuang digunakan untuk meningkatkan kecepatan dan performa dari output yang dihasilkan. Batch Normalization layer dapat membuat performa model menjadi lebih stabil. Dalam Autoencoder tradisional, batch_normalization tidak digunakan sebagai layer tambahan dari model, namun batch_normalization dapat ditambahkan untuk memperbagus output yang dihasilkan.

Stepnya adalah:
1. Buat layer batch_normalization dan panggil layer tersebut di encoder sehingga `input_features` dapat dimasukkan ke batch normalization dulu sebelum dimasukkan ke `hidden layer`.
2. Buat layer batch_normalization dan panggil layer tersebut di decoder sehingga `input_features` dapat dimasukkan ke batch normalization dulu setelah dimasukkan ke `output layer`.
3. Jalankan ulang program

Dapat dilihat, dengan menggunakan layer batch normalization warna dan outline gambar terlihat semakin jelas.

Terima kasih.

