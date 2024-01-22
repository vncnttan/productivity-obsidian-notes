---
banner: "https://cdnb.artstation.com/p/assets/images/images/050/349/377/large/ian-worrel-mystery-shack-ext.jpg?1654638662"
banner_y: 0.845
---
[Java For Loop (w3schools.com)](https://www.w3schools.com/java/java_for_loop.asp)

Made by: NJ23-1 SLC - Vincent Tanjaya
- For
- While
- Do...While|

Loop adalah function yang dapat digunakan untuk melakukan suatu code of block secara berulang-ulang sesuai dengan syarat yang diberikan. Jika syarat yang diberikan selalu benar, maka akan terjadi infinite looping, yang artinya looping tidak terhentikan. Pastikan syarat berhenti dapat terpenuhi di dalam code of blocksnya tersebut.

# for
For loop merupakan loop yang count based, artinya kita memberikan jumlah secara numerik yang akan dimodifikasi untuk setiap iterasinya. Biasanya digunakan untuk melakukan iterasi yang berulang sebanyak beberapa kali
``` java
for (int i = 0; i < 10; i++) {
	// do something that will be repeated 10 times
}
```

Argument1 - Argumen yang akan dijalankan saat loop pertama kali dijalankan
`int i = 0`

Argument2 - Argumen yang akan dicek sebelum memulai iterasi/perulangan selanjutnya
`i < 10`

Argument3 - Argumen yang di lakukan untuk setiap iterasinya
`i++`

Notes: Argument3 akan dijalankan dulu, baru selanjutnya argument 2 akan dicek

# while
While loop akan dijalankan selama statement yang dijadikan sebagai parameter **true**. Jika salah, maka akan dimulai kode perulangan berikutnya. Di setiap iterasinya statement akan dicek.
``` java
while (statement){
	// do something until statement is true
	// remember to modify variable that was used in the statement too so the statement is eventually become true and you're not stuck in a loop.
}
```

# do... while
Sama dengan while, perbedaannya saar pertama kali kodenya masuk ke dalam loop, statement nya akan tidak di cek terlebih dahulu, Sehingga block of code yang ada di dalam do while loop akan dijalankan minimal sekali. Sedangkan dalam while loop, jika kondisi di dalam statement sudah salah, maka kode di dalam blocknya tidak akan dijalankan sama sekali. 
``` java
do {
 // some code
} while (statement);
```

