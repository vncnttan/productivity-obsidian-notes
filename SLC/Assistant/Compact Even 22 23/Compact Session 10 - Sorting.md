---
banner: "https://cdnb.artstation.com/p/assets/images/images/050/349/377/large/ian-worrel-mystery-shack-ext.jpg?1654638662"
banner_y: 0.485
---

Made by: NJ23-1 SLC - Vincent Tanjaya
- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort

Sorting adalah suatu algoritma yang digunakan untuk mengurutkan suatu data yang berada di dalam suatu array (statis maupun dinamis).
[Sorting (Bubble, Selection, Insertion, Merge, Quick, Counting, Radix) - VisuAlgo](https://visualgo.net/en/sorting?slide=1)

Sorting dapat dilakukan untuk mencapai urutan ***Ascending*** atau ***Descending***


Sebelum di sort, siapkan dulu bahan-bahan yang dibutuhkan dalam mensorting.
##### Array acak yang akan di urutkan
``` java
int[] arr = {20, 19, 28, 22, 132, 100};

void printArray(){
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println(); // Untuk mengeprint enter / new line 
}
```

##### Function swap
Untuk banyak algoritma, kita akan menggunakan swap untuk menukar urutan yang ada di suatu array
```java
void swap(int a, int b){
	int c = arr[a];
	arr[a] = arr[b];
	arr[b] = c;
}
```


### Bubble Sort
[Bubble Sort - Data Structure and Algorithm Tutorials - GeeksforGeeks](https://www.geeksforgeeks.org/bubble-sort/)
Bubble Sort adalah algoritma sort yang akan membandingkan tiap elemen pada array dengan satu elemen di sebelahnya secara berulang-ulang.
Jika posisi mereka tertukar (yang lebih besar seharusnya dikanan misalnya) maka tukar posisi mereka.

Contoh visualisasi untuk sekali iterasi (Ascending):
![[Pasted image 20230728093919.png]]
![[Pasted image 20230728093908.png]]

Visualisasi untuk bubble sort secara lengkap (Descending):
![[Pasted image 20230728094049.png]]

Code untuk bubble sort
```java
void bubbleSort(){
	for(int i = 0; i < arr.length; i++){
		for (int j = 0; j < arr.length - i - 1; j++){
			// Untuk ascending kita akan menukar apabila angka yang di kiri lebih besar dari angka di sebelah kanannya
			if(arr[j] > arr[j + 1]){
				swap(j, j + 1);
			}
		}
	}
}
```

### Selection Sort
[Selection Sort – Data Structure and Algorithm Tutorials - GeeksforGeeks](https://www.geeksforgeeks.org/selection-sort/#:~:text=Selection%20sort%20is%20a%20simple,sorted%20portion%20of%20the%20list.)
Selection Sort adalah algoritma yang akan mencari nilai paling ujung, lalu terjadi penukaran. Berikutnya dilanjutkan agar akhirnya dari ujung secara satu persatu akan terurut.

Contoh visualisasi untuk sekali iterasi:
![[Pasted image 20230728094623.png]]

Visualisasi selection sort secara lengkap:
![[Pasted image 20230728095144.png]]

Code untuk selection sort
```java
void selectionSort(){
	for(int i = 0; i < arr.length; i++){
		int min = i;
		// Untuk ascending maka kita mencari nilai terkecil secara iterasi
		for (int j = 0; j < arr.length; j++){
			if(arr[j] < arr[min]){
				min = j;
			}
		}
		
		swap(i, min);
	}
}
```

### Insertion Sort
[Insertion Sort - Data Structure and Algorithm Tutorials - GeeksforGeeks](https://www.geeksforgeeks.org/insertion-sort/)
Insertion sort adalah algoritma sorting yang akan mengecek dan memindahkan sebuah elemen ke sebelah kiri selama nilai elemen tersebut sesuai lebih kecil (untuk ascending) dibandingkan dengan nilai elemen di kirinya

Contoh visualisasi: 
![[Pasted image 20230728100409.png]]
![[Pasted image 20230728100423.png]]

Contoh code untuk Insertion Sort
```java
void insertionSort(){
	for(int i = 1; i < arr.length; i++){
		int j = i;
		while(j > 0 && arr[j] < arr[j-1]){
			swap(j, j-1);
			j--;
		}
	}
}
```

### Merge Sort
[Merge Sort - Data Structure and Algorithms Tutorials - GeeksforGeeks](https://www.geeksforgeeks.org/merge-sort/)
Merge sort adalah suatu algoritma sorting yang menerapkan *divide and conquer*. Algoritma merge sort lebih efisien dibandingkan dengan algoritma lainnya, namun memiliki pengertian dan implementasi yang lebih advanced dari algoritma sorting lainnya.

Merge sort akan memecah array-array menjadi array yang lebih kecil hingga arraynya terdivide jadi hanya 2 elemen. Lalu ketika sudah array akan dibandingkan dan diurutkan dari elemen terkecil hingga terbesar, kemudian dimasukkan kembali ke array utama.

Visualisasi untuk merge sort:
![[Pasted image 20230728100810.png]]

![[Pasted image 20230728100856.png]]

Code untuk Merge Sort:
Method-method yang dipakai:
``` java
void mergeSort(int low, int high){
	// Low adalah index array paling kiri, high adalah array paling kanan. Function mergesort digunakan untuk membagi array menjadi 2 secara rekursif
	if(low >= high){
		return;
	}
	int mid = (high + low) / 2;
	mergeSort(low, mid);
	mergeSort(mid + 1, high);
	merge(low, mid, high);
}


void merge(int low, int mid, int high){
	// Low adalah index paling kiri, mid adalah index tenah, high adalah index paling kanan. Merge digunakan untuk menggabungkan array yang terpisah menjadi array yang berurutan.

	// Initialize 2 array (kiri dan kanan)
	int leftSize = mid - low + 1;
	int rightSize = high - mid;

	int []leftArr = new int[leftSize];
	int []rightArr = new int[rightSize];

	// Isi array kiri dengan value dari array aslinya dari index left sampai mid
	for(int i = 0; i<leftSize; i++){
		leftArr[i] = arr[i+low];
	}

	// Isi array kanan dengan value dari array aslinya dari index mid sampai right
	for(int i = 0; i<rightSize; i++){
		rightArr[i] = arr[i+mid+1];
	}

	// Lakukan perbandingan array kiri dan kanan, yang lebih kecil dimasukkan kedalam array terlebih dahulu.
	int left = 0, right = 0, idx = low;
	while(left<leftSize && right < rightSize){
		if(leftArr[left] < rightArr[right]) {
			arr[idx] = leftArr[left++];
			// Artinya setelah arraya dimasukkan dari array left, angka untuk left akan ditambahkan 1
		} else {
			arr[idx] = rightArr[right++];
		}
		idx++;
	}


	// SEtelah itu masukkan array sisanya ke array awal
	while(left < leftSize) {
		arr[idx++] = leftArr[left++];
	}

	while(right < rightSize){
		arr[idx++] = rightArr[right++];
	}
}
```
