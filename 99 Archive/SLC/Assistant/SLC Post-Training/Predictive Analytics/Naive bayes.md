#### NLP Model

Bayes' Rule
![[Pasted image 20240316073921.png]]
If we want to see how much the clue strengthen/weakens your hunch/initial assumption.
![[Pasted image 20240316074432.png]]

- Kategori sesuatu = P(x) * P(y) * P(z) * ...
- Asumsinya semua kata independen satu sama lain

##### Penjelasan Perhitungan
Menggunakan Laplace correction, sehingga:
 1 + 1
 -------
 14 + 20

1 = Kemunculan kata predictable
1 = Laplace biar prob ga 0
14 = Jumlah kata di negatif
20 = Jumlah kata unique


Setelah ketemu semua probabilitas, tinggal dikalikan saja.
Yang mau dicari: P( - | S ) -> Probabilitas negatif given that sentence
Perlu: P("Fun" | - ) -> Probabilitas kata fun muncul di negative sentences;
 

#### For Basic Statistic

![[Pasted image 20230829152922.png]]
