1. Sirkuit Euler
   a. Graf a tidak memiliki Euler sirkuit, tetapi memiliki Euler path
   Di gambar dibawah, terlihat path yang ada, 
   start dart merah, berakhir di biru muda.
   C, F, E, D, A, B, C, D
   ![[Pasted image 20221220141435.png]]
   Dikatakan bukan euler circuit dikarenakan untuk semua edge dilewati, tidak ada kombinasi dimana initial vertexnya sama dengan end vertexnya.
   
   b. Merupakan Euler Circuit karena graf tersebut dapat membentuk sirkuit yang melewati semua edgenya. Rute sirkuitnya adalah
   u, y, z, u, s, z, r, s, t, u, v, w, x, y, w, u
![[Pasted image 20221220140707.png]]

2. Tidak isomorphic
   (i) Edge:
   G = 6
   G' = 6
   Memenuhi syarat 1 isomorphic
   
   (ii) Degree vertex
   G = (1, 3, **3**, 2, **(3 + loop)**)
   G' = (**4**, **(2 + loop)**, 3, 2, 1)
   
   di G ada yang memiliki deg 3 = 2 vertex, sedangkan di graf G' yang memiliki deg 3 = 1 vertex,
   di G ada yang memiliki deg 4 = 0 vertex, sedangkan di graf G' yang memiliki deg 4 = 1 vertex,
   di G ada yang memiliki deg **(2 + loop)** = 1 vertex, sedangkan di graf G' yang memiliki satu-satunya yang memiliki loop, degreenya **(3 + loop)**
   Tidak memenuhi syarat 2 isomorphic
   
   Jadi, dapat disimpulkan bahwa graf G dan G' tidak isomorphic

3. Graf isomorfik
   (i) Edge:
   G = 