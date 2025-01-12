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
- **The Pile**
###### 2. System & Nvetwork Threat
###### 3. Virtualization
###### 4. Hypervisor & Microservices

### Kasus:
###### 1. Disk Scheduling
###### 3. Page Replacement fifo lru clock
###### 2. Buddy System
###### 4. chmod