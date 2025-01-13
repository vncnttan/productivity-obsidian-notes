###  Esai 
###### 1. File Organization Type
> File System: Struktur logika yanng memungkinkan user untuk membuat koleksi data (Files), serta melakukan kumpulan fungsi terhadap files tersebut (*create, delete, open, close, read, write*)

Property files:
- Long-term existence
- Sharable between processes
- Structure

Terms of file:
- Field: Bagian terkecil dari data
- Record: kumpulan field yang berkaitan
- File: Kumpulan record yang sejenis
- Database: Kumpulan file yang saling berkaitan

![[Pasted image 20250112214808.png]]
Architecture File System:
- User Program
- Logical I/O
- Basic I/O Supervisor
- Basic File System
- Disk Device Driver & Tape Device Driver

**Access Method:** 
Standard interface yang menghubungkan antara aplikasi dan file system (ada banyak jenis, dan setiap jenisnya memiliki caranya sendiri -> *pile, sequential, etc.*)

![[Pasted image 20250112215558.png]]
- File Management Concerns: Urusan user ke aplikasi
- Operating System Concerns: Urusan Internal system

File Organization and Access
`Bagaimana cara mengatur struktur record dalam file -> Penting karena menentukan cara mengaksesnya juga`

Kriteria:
- Short Acess Time
- Ease of Update
- Economy of Storage
- Simple Maintenance
- Reliability

Jenis-jenis file organization:
1. **The Pile**
	  File yang isinya nggak teratur -> ditumpuk aja, yang paling bawah itu yang duluan dibikin filenya. 
	  ![[Pasted image 20250113124629.png]]
	- Tiap record isinya data burst (sejumlah data yang dikumpulkan pada satu waktu)
	- Cara aksesnya: Exhaustive Search (dicari satu-satu)
	- Panjang records dan set bisa bervariasi

2. **Sequential File**
	  File organization yang paling umum digunakan. -> Diurutkan berdasarkan key dan kunci tertentu
	  ![[Pasted image 20250113125247.png]]
	- Panjang fields and records fixed.
	- Kalau misal ada yang lebih panjang dari yang sudah ditentukan, maka datanya ga kesimpan
	- Format Records tetap dan konsisten
	- Digunakan dalam aplikasi batch

3. **Indexed Sequential File**
	  File Sequential yang memiliki index untuk mempercepat akses.
	  ![[Pasted image 20250113125606.png]]
	- Menambahkan overflow file untuk menangani data yang melebihi kapasitas indeks. 
	- Memungkinkan implementasi multi-level index untuk membuat akses data lebih cepat lagi. (In multi-level index, index terendah berhubungan langsung dengan file utama, setiap level index membantu mempersempit area pencarian)

4. **Indexed File**
	  File yang diakses melalui index, ga perlu sequential
	  ![[Pasted image 20250113130103.png]]
	- Panjang recordnya bisa varied, sudah tidak fixed lagi seperti sequential. -> Lebih hemat space
	- Exhaustive Index: entri untuk setiap record di file utama (lengkap)
	- Partial Index: Entri untuk record yang memilikif field tertentu
	- Umumnya digunakan untuk aplikasi yang membutuhkan informasi sangat tepat waktu

5. **Direct / Hashed File**
	  File yang diakses langsung pake alamatnya
	  
	- Menggunakan hashing untuk menentukan alamat datanya
	- Ideal untuk fixed-length records. 
	- Record diakses satu persatu pada setiap pencarian, bukan secara berurutan.
	- Use case yang cocok: Directories, Pricing Tables, Schedules, Name Lists

**Directory**
Tempat penyimpanan untuk menyimpan dan mengorganisir file-file dalam penyimpanan sekunder (hard disk/SSD).
**Operasi:**
- Search
- Create
- Delete
- List
- Update

2 Level Scheme:
- **Master Directory**: Menyimpan informasi tentang diretory tiap user -> Alamat dan access control
- **User Directory**: Satu Directory untuk tiap user 

**Tree Structured Directory**
![[Pasted image 20250113133143.png]]

**Pre-Allocation**: Menyediakan alokasi ruang untuk file dari awal. Ukuran maksimal harus dideklarasikan saat pembuatan file
**Dynamic Allocation**: Memberikan ruang untuk file secara bertahap

**Allocation Methods**:
- Contigous Allocation: Blok ditempatkan secara berdekatan dan berurutan
- Chained Allocation: Blok menyimpan alamat blok berikutnya, membentuk rantai
- Indexed Allocation: Tiap file memiliki index block yang menyimpan daftar blok-blok lokasi file tersebut. FAT menunjuk ke index block tersebut, sehingga kita jadi punya lokasi semua blok file tersebut.

**Free Space Management**
- Bit Table
- Chained Free Portion
- Indexing
###### 2. I/O Management

Tiga Kategori
**Human Readable**: Komunikasi dengan pengguna komputer (printer, layar, keyboard, mouse, terminal) 
**Machine Readable**: Komunikasi untuk perangkat elektronik (Drive Disk, USB key, Sensor, Controller)
**Communication**: Komunikasi komputer dengan perangkat yang jauh (Modem, dan sejenisnya)

Area perbedaan I/O device:
- Data Rate
- Application
- Complexity of Control
- Unit of Transfer
- Data Representations
- Error Conditions

**Buffer**
`Tempat transit buat data I/O. Menghindari overhead, lebih efisien. Menyimpan data sementara sebelum permintaan dilakukan.`

**2 Jenis Perangkat:**
**Block-oriented Device**: Simpan data dalam blok-blok dengan ukuran tetap (Disk, USB)
**Stream-oriented Device**: Aliran byte, gaada struktur bloknya (printer, keyboard, mouse)

Types of Buffer: 
- No Buffer
- Single Buffer
- Double Buffer
- Circular Buffer

**Disk Performance Parameter**
`Faktor yang mempengaruhi kecepatan dan efisiensi proses read write disk`
- Seek Time
  Memindahkan head disk ke track yang diinginkan *(biasanya < 10ms)*
  `Start-up time, Traverse time, Settling time`
- Rotational Delay
  Waktu yang dibutuhkan untuk memutar sektor yang diinginkan sampai ke posisi di bawah head read/write
  `Bergantung pada kecepatan rotasi disk`
- Data Transfer
  Transfer data dari disk ke memori
- Access Time
  Seek Time + Rotational Delay + Data Transfer

**Redundant Array of Independent Disk (RAID)** 
`Menggunakan beberapa hard disk untuk meningkatkan kerja dan redundansi data`

RAID Level:
0. RAID 0 (Striping)
1. RAID 1 (Mirroring)
2. RAID 5 (Striping with Parity)
3. RAID 6 (Striping with Dual Parity)
4. RAID 2, 3, 4 
5. RAID 10 (1 + 0) 
###### 3. Memory Management
Istilah penting:
- Frame
  Blok dengan panjang fixed yang disimpan di main memory (RAM)
- Page
  Blok dengan panjang fixed yang disimpan di memori sekunder. Page bisa sementara dipindahin ke frame
- Segment
  Blok dengan variable-length yang disimpan di memori sekunder

**Requirement**:
1. Relocation
2. Protection
3. Sharing
4. Logical Organization
5. Physical Organization

**Partitioning**
`Membagi ram menjadi partition terpisah agar proses yang berjalan dapat menggunakan memori secara efisien.`
Types of memory partitioning:
- Fixed Partitioning: Partisi tetap untuk setiap fungsi/komponen *(IoT)* -> ditentukan di awal
- Dynamic Partitioning: Pembagiannya dinamis, lebih fleksibel tapi ada masalah fragmentasi
- Simple Paging: Bagi memory menjadi beberapa fixed-length pages
- Simple Segmentation: Bagi memory menjadi beberapa variable-length segments
- Virtual Memory Paging: Versi canggih dari paging, ga perlu semua page di load
- Virtual Memory Segmentation: Versi canggih dari segmentation, ga perlu semua page di load

Kalo paging: No External Fragmentation
Kalo segmentation: No Internal Fragmentation

Page Placement Algorithm:
- First Fit
- Next Fit
- Best Fit
- Buddy System

**Paging**
Membagi program menjadi fixed-sized block kecil dalam secondary memory

**Segmentation**
Membagi program menjadi variable-sized block kecil dalam secondary memory
###### 4. Virtual Memory
`Sistem manajemen memori yang digunakan komputer untuk memperluas kapasitas main memory (RAM) dengan menggunakan sebagian dari ruang secondary memory (hard disk)`

Terminologies
- Virtual Address
- Virtual Address Space
- Address Space
- Real Address

**Trashes**: Sistem lebih banyak ngabisin waktu buat nuker-nuker process pieces daripada jalanin instruksi

Fetch Policy:
- Demand Paging
- Prepaging

### Kasus:
###### 1. Disk Scheduling (SCAN, CSCAN, FIFO, SSTF) V
###### 2. Page Placement Algorithm (First Fit, Next Fit, Best Fit, **Buddy System**) V
###### 3. Page Replacement (FIFO LRU OPT CLOCK) V
###### 4. chmod ? -> Coding File Management 
###### 5. File Allocation Method (Chain, Index) V

