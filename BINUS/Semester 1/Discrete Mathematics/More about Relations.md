**MATERI TAMBAHAN:**

1.  Berikut adalah sebuah ilustrasi yang bagus untuk menjelaskan mengenai sifat (ir)reflexive, (anti-) symmetric, dan transitive, baik dari sisi roster method, directed graph, dan incidence matrix

[https://calcworkshop.com/relations/discrete-math-relations/](https://calcworkshop.com/relations/discrete-math-relations/)

2.  Lower bound, upper bound

Berikut adalah suatu directed graph (tapi ini bukan Hasse diagram ataupun lattice), hanya sebagai contoh saja untuk menerangkan upper bound maupun lowerbound.

![](file:///C:/Users/vince/AppData/Local/Packages/oice_16_974fa576_32c1d314_2531/AC/Temp/msohtmlclip1/01/clip_image002.jpg)
![](file:///C:/Users/vince/AppData/Local/Packages/oice_16_974fa576_32c1d314_62d/AC/Temp/msohtmlclip1/01/clip_image002.jpg)

**LATTICE**: punya minimal 1 buah LUB **DAN** 1 buah GLB

![](file:///C:/Users/vince/AppData/Local/Packages/oice_16_974fa576_32c1d314_2531/AC/Temp/msohtmlclip1/01/clip_image010.jpg)

1.  Struktur (a) di kiri: UB= f, LB= a. LUB-nya= yang satu level di bawah f, yaitu hanya e. GLB-nya= yang satu level di atas a, yaitu hanya b

·        GLB titik b tepat terhubung dengan satu LUB, yaitu e, melalui c atau d.

·        GLB titik e tepat terhubung dengan satu GLB, yaitu b, melalui c atau d.

à struktur (a) dikategorikan sebagai lattice

2.  Saya lompat dulu ke struktur (c) di kanan ya.

-   UB= h, LB= a. LUB= ada e, f, g. Sedangkan GLB= b, c, d.
-   GLB titik b tepat terhubung dengan satu LUB, yaitu e.
-   GLB titik c tepat terhubung dengan satu LUB, yaitu f.
-   GLB titik d tepat terhubung dengan satu LUB, yaitu g.

Dan sebaliknya

-   LUB titik e tepat terhubung dengan satu GLB, yaitu b.
-   LUB titik f tepat terhubung dengan satu GLB, yaitu c.
-   LUB titik g tepat terhubung dengan satu GLB, yaitu d.

à struktur (c) termasuk lattice

3.  Kalau struktur (b) di tengah:

-   UB= f, LB= a. LUB= d, e. GLB= b, c. Tapi b terhubung ke d dan juga e. Demikian juga titik c terhubung ke d dan e juga.
-   GLB titik b punya 2 LUB, yaitu d dan e.
-   GLB titik c punya 2 LUB, yaitu d dan e.
-   LUB titik d punya 2 GLB, yaitu b dan c.
-   LUB titik e punya 2 GLB, yaitu b dan c.

à struktur (b) bukan lattice.

RELATION & MATRIX

Dimisalkan ada relasi R= = {(2, 1), (3, 1), (3, 2)}, dari semesta A= {1, 2, 3} dan B= {1, 2} relasi ini bisa dibuat matrix seperti ini, dengan anggota 0 dan 1.

Untuk Example 2, seharusnya sih cukup jelas/straightforward ya


Ciri-ciri matrix yang REFLEXIVE, ANTI-SYM, dan yang SYMMETRIC


Reflexive: Diagonal kiri atas ke kanan bawah isinya 1 semua. Ini artinya isinya AA, BB, CC, dst à ngeLOOP ke diri sendiri

Symmetric: matrix seolah-olah bisa “dilipat” secara simetris atau ada bayangan/cerminan dari masing-masing elemen terhadap arah diagonal kiri atas kanan bawah.

Anti-sym: bayangan berada di posisi saling berlawanan


Relasi juga bisa dibuat sebagai directed graph, seperti ini. Perlu diperhatikan arah tanda panah, karena ada b ke d, dan juga d ke b. Seharusnya ini pun cukup straightforward ya.
