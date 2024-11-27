#### Before Modification
![[Pasted image 20241127085004.png]]
![[Pasted image 20241127084942.png]]

#### Analysis

###### Activation Function ReLU
Model GAN dari code awalnya menggunakan ReLU sebagai activation function di layer Generator dan Discriminatornya. ReLU kurang efektif digunakan karena ada beberapa value yang negative bisa dijadikan sebagai pembelajaran di neuron, sedangkan ReLU langsung mengganti value negatif menjadi 0, sehingga value negatif tidak dapat digunakan untuk pembelajaran mesin. Sedangkan LeakyReLU dapat mengkonsiderasi nilai negatif menjadi kontribusi pembelajaran mesin dan berpengaruh ke output yang dihasilkan dengan alpha yang kecil. 
![[Pasted image 20241127093024.png]]

###### DCGAN vs. Vanilla GAN
Deep Convolutional Generative Adversarial Networks (DCGANs) adalah jenis GAN yang lebih sesuai untuk task ini karena DCGAN memiliki convolutional layer di generator dan discriminator. Convolutional Layer inilah yang memberikan pertimbangan perhitungan dalam hubungan antar pixel. Hubungan antar pixel penting untuk diperhitungkan dalam membuat representasi gambar, sehingga hasil dari DCGAN akan menghasilkan performa yang lebih baik daripada GAN yang hanya menggunakan Dense Layers saja.


#### After Modification



