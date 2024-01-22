![[Pasted image 20230101104904.png]]

```c
struct MataKuliah{
	char name[100];
	struct MataKuliah *next;
	struct MataKuliah *prev;
}


struct Jurusan{
	char name[100];
	struct Jurusan *next;
	struct Jurusan *prev;
	struct MataKuliah *mhead, *mtail;
} *jhead, *jcurr, *jtail*;
```

Functions:
- newMataKuliah
- newJurusan
- pushJurusan
- pushMataKuliah (sesuai dengan jurusannya)
- searchJurusan
- pushMataKuliahByJurusan (validasi dulu dan cari struct jurusan melalui searchJurusan, lalu pushMataKuliah menggunakan addressJurusan tersebut)
- printJurusan (+printSeparator)