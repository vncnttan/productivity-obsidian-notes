Session 7 - Network Layer
Dynamic Routing vs. Static Routing

Dynamic Routing:
- BGP
	- Path Vector
	- ERP
	- Stateful
- EIGRP
	- Advanced Distance Vector 
	- IRP
	- Hybrid
- OSPF
	- Link state
	- IRP 
	- Diijkstra
	- Stateful
- RIP
	- Distance Vector
	- IRP
	- Bellman Ford
	- Stateless

Bagian data email:
- Header
- Sender
- Recepient
- Subject
- MIME -> Konversi non ascii jadi ascii
- Body Message

Session 8 - Transpot Layer Concepts
- TCP - Transmission Control Protocol
- UDP - User Datagram Protocol
- SCTP - Stream Control Transmission Protocol

Connection Establishment
- Three way handshake

Session 9 - Domain Name System
- ISP DNS Server
- Top Level Domain
- Authoritative Name Server

TLD Generic: .com .net  .org .edu
Country Code: .uk .de .id

Session 10 - Application Layer


Session 11 - Network Security
- Confidentiality - Kemampuan untuk menjaga kerahasiaan informasi yang dikirimkan melalui jaringan
- Authenticity - Kemampuan untuk memverifikasi bahwa informasi yang diterima berasal dari sumber yang terpercaya
- Integrity - Menyimpan data murni dengan melindungi data sistem dari perubahan oleh pihak yang tidak berwenang
- Availability - Kemampuan untuk mengakses informasi ketika dibutuhkan kapan saja

Threats: Potensi pelanggaran keamanan
- Interupsi: Sumber daya sistem dihancurkan
- Intersepsi: Sumber daya sistem bocor
- Modifikasi: Sumber daya dirusak/dirubah
- Fabrikasi: Objek palsu ke dalam sistem

Attack: Tindakan yang melanggar kemanan:
- Fisik: Hardware & software terganggu
- Logic:
	- SQL Injection
	- DoS: Menghabiskan resource system
	- Trafic flooding: Membanjiri traffic jaringan
	- Request Flooding: Membanjiri request yang dilayani oleh layanan
	- Deface: Perubahan tampilan
	- Social engineering: Memanfaatkan kepercayaan pengguna
	- Malicious code: Serangan menggunakan kode (virus, worm)
	- Packet sniffer: Serangan yang menangkap paket yang lewat sebuah jaringan

Passive Attack: System Unaltered
- EavesDropping

Active Attack: System altered
- Masquerade

Encryption Ingredient:
- Plaintext: Informasi awal yang ingin di enkripsi
- Encryption Algorithm: Algoritma yang akan dipakai (contoh: RSA)
- Public Key (Asymmetric): Key yang akan dipakau untuk encrypt, semua orang dapat melihat/menggunakannya
- Private Key (Asymmetric): Key yang dipakai untuk decrypt, hanya dimiliki oleh yang ingin membuka rahasia  
- Secret Key (Symmetric): Key yang dipakai untuk decrypt dan encrypt

Web Document: Resource / Information that is accessible through WWW
- Static: Would not be changed, unless modified by the developer (Images, text)
- Dynamic: Can be changed by user based on their input or external events (Live updates, Interactive form)
- Active: User actively manipulate and modify the content (Collaborative editing platform, Interactive Media presentations)

Session 12 - Cloud Security, Load Balancing, Auto Scaling
Shared Responsibility Model: Arsitektur yang digunakan oleh CSP untuk mendefinisikan tangguna jawab user dan CSP dalam menjaga kemanan data dari aplikasi user dalam cloud.

Tugas CSP:
- Securing the cloud infrastructure
- Protecting the customer data (who can access the data in the cloud: encryption, access control, and instrusion detection systems)
- Providing sercure cloud services (termasuk patching, updating software, responding to security incidents, security audits) 

Tugas Customer:
- Securing data in the clouds
- Managing user identities (IAM: Identity and Access Management)
- Compliance with regulations
- Firewall, Middleware, dll.

Load Balancing 🥰
Proses mendistirbusikan lalu lintas jariingan ke beberapa server
- Mencegah kelebihan beban pada satu server
- Memastikan ketersediaan dan kinerja optimal
- Menghindari downtime & meningkatkan skalabilitas

- Round Robin
- Least Connections
- Weighted Round Robin

Contoh:
- AWS Elastic Load Balancing
- Google Cloud Load Balancing
- Azure Load Balancer


Auto Scaling
Proses menambah atau mengurangi kapaasitas sumber daya komputasi berdasarkan permintaan atau beban kerja

- Meningkatkan availability
- Optimalkan penggunaan sumber daya
- Mengatasi fluktuasi beban kerja


- Monitoring
- Menyesuaikan jumlah instans
- Berintegrasi dengan load balancing

Contoh:
- AWS Auto Scaling
- Google Cloud Auto Scaler
- Azure Autoscale


Belajar ROUTING




