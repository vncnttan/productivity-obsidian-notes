Vincent Tanjaya - 2602128346

### Topic: Pre-Allocation vs Dynamic Allocation

Pre-Allocation (Static Allocation) di memori adalah teknik alokasi data yang menentukan jumlah memori terlebih dahulu sebelum memori diisi. Hal ini artinya memori sudah ditentukan saat deklarasi / inisialisasi program. Contohnya adalah ketika membuat static Array di c. 

```c
int arrayStatis[100]; // disini sudah di definisikan secara statis bahwa ukurannya adalah 100
```

Karakteristik: 
- Ukuran memori tetap / tidak berubah
- Akses data lebih cepat
- Berpotensi boros memori yang jika tidak terpakai penuh sesuai dengan kapasitas yang ditentukan

---

Dynamic Allocation adalah teknik alokasi memori secara fleksibel selama program berjalan. Kapasitas memori yang dialokasikan untuk menjalankan program dapat diperluas / diperkecilkan sesuai kebutuhan. Contohnya adalah ketika membuat Vector/ArrayList di Java atau List di Python.

``` java
Vector vector new Vector(); // Disini tidak ada ukuran secara pasti kapasitas dari vectornya, namun vector dapat menyesuaikan dengan kebutuhan
vector.add("Vicnent");
```

Karakteristik:  
- Ukuran memori fleksibel / bisa berubah-ubah
- Overhead runtime ketika memori di resize
- Resiko Memory Fragmentation

---


![[Pasted image 20241202162420.png]]