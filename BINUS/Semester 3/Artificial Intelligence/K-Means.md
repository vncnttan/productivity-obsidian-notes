Organizing data into clusters such that there is:
- High intra-cluster similarity
- Low inter-cluster similarity

Informally, finding natural groupings amongst object. 
- Unsupervised Learning
- Requires data, but no labels
- Detect patterns



Cara menghitung distance:
![[Pasted image 20231130115230.png]]

![[Pasted image 20231130115532.png]]

- Random pilih k data sebagai centroid awalnya
- Di antara 2 centroid masukkan ke cluster tergantung dari semua centroid mana yang paling sedikit distancenya
![[Pasted image 20231130115936.png]]
- Cari centroid barunya
![[Pasted image 20231130115925.png]]
- Cari lagi jaraknya untuk setiap individual, dengan centroid barunya
![[Pasted image 20231130120023.png]]
- Ulangi lagi cari centroid 1 dan 2 dari yang udah di update
- Ulangi sampai gaada perubahan lagi