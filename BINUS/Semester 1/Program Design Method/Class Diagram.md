Filled with attribute that differentiate one object to another
![[Pasted image 20221214120315.png]]

Class diagram has a **class name** and **class attributes**.

ID number primary keys are used to differentiate one class to another that may have the same attribute

Penamaan atribut, sama seperti variabel, harus konsisten, and there is many naming convention
ex:
	nameFamily
	name_family,
	etc.

For attribute, don't forget to specify data type of said attribute.
![[Pasted image 20221214122934.png]]

![[Pasted image 20221221115044.png]]
### Association Connection 
A class interact with each other
	ex: mobil dan supir = supir mengendarai mobil

### Aggregation Connection
A class is a part of another class
	ex: Rangka dan mobil = rangka bagian dari mobil (diamondnya di mobil)
	ex: Mesin dan mobil = mobil bagian dari rangka

### Generalization Connection
A class is a type of another class
	ex: Mobil dan kendaraan = jenis kendaraan adalah mobil
	(segitiga di kendaraan)
	ex: Kucing dan hewan
	

Semua atribut yang ada di kelas parent itu bakal diturunin ke child classnya, tapi association ga perlu

Cardinality: Angka di associationnya
1 Pengendara mengendarai 1 kendaraan
Misalnya dosen mengajar mahasiswa
1 dosen bisa mengajar mahasiswa, every possible value (1 .... \*)
1 to many

! INGET ! tapi gabisa many to many!!!!!!
