Mencari rute paling optimal untuk perjalanan kurir yang mengangkut paket.

1. Agent
   `Decision maker / learner yang melakukan aksi dengan cara berinteraksi dengan environment. Bertujuan memilih keputusan terbaik untuk mencapai tujuan.`
	   - **Searching Route System**
   
2. Environment:
   `Hal eksternal diluar sistem yang berinteraksi dengan agent dan merespon dengan agent, menghasilkan feedback dan state baru.`
	   - **Map lokasi tempat yang dapat dijangkau oleh kurir**
	   - **Berat dan ukuran dari paket yang dikirim (?)**

3. State:
   `Keadaan dari environment di waktu tertentu, memberikan semua informasi yang dibutuhkan oleh agent untuk menentukan keputusan`
	   - **Posisi kurir saat ini**
	   - **Jalan yang dapat dilalui oleh kurir/ditutup**
	   - **Tujuan dari masing-masing paket yang belum diantar**
	   - **Kurir sampai di tujuan**

4. Action:
   `Action yang dapat diambil oleh agent`
	   - **Alokasi paket yang akan dikirim oleh setiap kurir**
	   - **Memutuskan paket selanjutnya yang akan dikirim**
	   - **Menuju ke lokasi selanjutnya**
	   - **Drop paket di lokasi**
	   - **Kembali ke pos (posisi awal kurir)**
   
5. Reward:
   `Yang diterima oleh agent setelah melakukan action tertentu`
	   - **Customer Rating**
	     Semakin tinggi user rating, berarti agent sudah memilih jalur pengantaran paket yang cepat dan efisien.
	   - **Delivered Packet Efficiency**
	     Semakin banyak paket yang diantarkan oleh kurir dalam 8 jam, berarti rute yang dipilih oleh route searching system semakin optimal.
	   - **Delivered Packet Speed**
	     Semakin cepat semua paket dikirimkan oleh kurir (berarti semua pake dapat diantar ke lokasi destinasi kurang dari 8 jam), berarti route searching system semakin optimal.

6. Policy:
   `Strategi atau mapping yang digunakan oleh agent untuk memilih suatu action dari state tertentu. Mendifinisikan bagaimana agent memutuskan action yang tepat di state tertentu.`
	   - **Neighboring Destination Policy**:
	     Model clustering bisa digunakan untuk melakukan grouping terhadap lokasi destination, sehingga packet dengan destination yang berdekatan diantar oleh kurir yang sama dengan k tertentu (k =  jumlah paket yang bisa dibawa, bergantung dengan berat masing-masing paket) 
	   - **Brute Force**:
	     Algoritma dapat menggunakan metode Brute Force untuk mencoba **semua kemungkinan** dari rute yang dapat diambil, lalu model prediktif akan menghitung estimasi waktu yang dibutuhkan untuk mengantar semua paket (harus dibawah 8 jam)
	   - **Dijkstra / A*?***
	     Dijkstra / A* dan algoritma serupa dapat digunakan untuk menentukan rute paling optimal dari suatu titik ke titik lain dalam peta.
   
7. Value Function (Return):


References:
[Day 62: Reinforcement Learning Basics — Agent, Environment, Rewards | by Adithya Prasad Pandelu | Dec, 2024 | Medium](https://medium.com/@bhatadithya54764118/day-62-reinforcement-learning-basics-agent-environment-rewards-306b8e7e555c)