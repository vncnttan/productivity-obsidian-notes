1. Setiap node memiliki warna (hitam atau merah)
2. Node root berwarna hitam
3. Setiap leaf node memiki external node
   (External node: node anak berwarna hitam yang tidak terlihat)
4. Node baru akan berwarna merah
5. Node merah tidak boleh punya anak merah
6. Jika merah punya anak merah (violation), maka lihat paman:
   - Jika paman warna merah -> Recolor
   Parent dan paman akan diwarnai hitam
   Grandparent jadi warna merah
   - Jika paman warna hitam -> Rotation
     Lakukan rotasi (single/double) di grandparent
     Setelah rotasi, parent jadi hitam, semua anak jadi merah

Red Black Tree: Jumlah setiap node hitam ke leaf nya harus sama


Deletion
1. Delete Node Black mengebabkan keseimbangan BLACK terganggu
2. Double-black muncul di node black yang dihapus, dan harus dihilangkan
3. Jika double-black berada di node RED, maka akan mengubah warna jadi BLACK dan double-black hilang
4. Jika double-black berada pada root maka double-black akan hilang
5. Double black akan hilang bila:
   - Berada di node merah dan berubah jadi hitam   


Double Black:
- Sibling merah, 
  rotasi dari parent ke arah double-black, 
  setelah rotasi parent jadi hitam, anak (yang turun) jadi merah, anak yang lainnya tetap, cek lagi (double black tdk hilang). 
- Sibling hitam dan 2 anaknya hitam
  ubah warna sibling jadi merah, double-black naik ke parent
- Sibling hitam dan salah satuanaknya merah
  Rotasi dari parent ke arah double black (dilihat dari anak sibling yang merah), jika punya dua anak pilih yang single rotation agar jawaban seragam. 
  Setelah rotasi kedua anak jadi hitam, parent mengikuti wanra sebelumnya, double black hilang