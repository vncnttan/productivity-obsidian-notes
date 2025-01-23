Mencari rute paling optimal untuk perjalanan kurir yang mengangkut paket.

a. \[LO 1, LO 2, LO 3, 15 Points] Mendefinisikan semua element dalam reinforcement learning agent, environment, state, action, reward, policy dan value function (return) untuk problem ini

1. Agent
   `Decision maker / learner yang melakukan aksi dengan cara berinteraksi dengan environment. Bertujuan memilih keputusan terbaik untuk mencapai tujuan.`
	   - **Searching Route System**
   
2. Environment:
   `Hal eksternal diluar sistem yang berinteraksi dengan agent dan merespon dengan agent, menghasilkan feedback dan state baru.`
	   - **Map lokasi tempat yang dapat dijangkau oleh kurir**
	   - **Berat dan ukuran dari paket yang dikirim**
	   - **Kondisi jalan dan rute yang tersedia**

3. State:
   `Keadaan dari environment di waktu tertentu, memberikan semua informasi yang dibutuhkan oleh agent untuk menentukan keputusan. Representasi environment di suatu waktu tertentu. State datangnya dari environment.`
	   - **Posisi kurir saat ini**
	   - **Jalan selanjutnya yang dapat dilalui oleh kurir/ditutup**
	   - **Destinasi dari paket yang belum diantar**
	   - **Sisa waktu dari 8 jam**
	   - **Paket sampai di tujuan**

4. Action:
   `Action yang dapat diambil oleh agent. Action datangnya dari agent.`
	   - **Alokasi paket yang akan dikirim oleh setiap kurir**
	   - **Memutuskan paket selanjutnya yang akan dikirim**
	   - **Menuju ke lokasi selanjutnya**
	   - **Drop paket di lokasi**
	   - **Kembali ke pos (posisi awal kurir)**
   
5. Reward:
   `Feedback yang diterima oleh agent setelah melakukan action tertentu. Menentukan seberapa bagus atau buruk suatu keputusan yang dipilih oleh agent.`
	   - **Delivered Packet Efficiency**
	     Semakin banyak paket yang diantarkan oleh kurir dalam 8 jam, berarti rute yang dipilih oleh route searching system semakin optimal. 
	     + Reward positif untuk setiap paket yang berhasil diantar. 
	   - **Delivered Packet Speed**
	     Semakin cepat semua paket dikirimkan oleh kurir (berarti semua pake dapat diantar ke lokasi destinasi kurang dari 8 jam), berarti route searching system semakin optimal. 
	     + Reward positif jika dapat menyelesaikan semua pengantaran kurang dari 8 jam.
	     -  Punishment untuk waktu yang terbuang dalam pengantaran paket.
	     -  Punishment yang besar jika melebihi batas waktu 8 jam
	   - **Customer Rating**
	     Semakin tinggi user rating, berarti agent sudah memilih jalur pengantaran paket yang cepat dan efisien. 
	     + Reward positif untuk rating baik.

6. Policy:
   `Strategi atau mapping yang digunakan oleh agent untuk memilih suatu action dari state tertentu. Mendifinisikan bagaimana agent memutuskan action yang tepat di state tertentu.`
	   - **Neighboring Destination Policy**
	     Model clustering bisa digunakan untuk melakukan grouping terhadap lokasi destination, sehingga packet dengan destination yang berdekatan diantar oleh kurir yang sama dengan k tertentu (k =  jumlah paket yang bisa dibawa, bergantung dengan berat masing-masing paket) 
	   - **Dijkstra / A****
	     Dijkstra / A* dan algoritma serupa dapat digunakan untuk menentukan rute paling optimal dari suatu titik ke titik lain dalam peta. Algoritma-algoritma ini juga dapat digunakan untuk menentukan urutan paket yang akan diantar selanjutnya, bergantung dengan cost yang dihasilkan dari suatu trip.
	   - **Brute Force**
	     Algoritma dapat menggunakan metode Brute Force untuk mencoba **semua kemungkinan** dari rute yang dapat diambil, lalu model prediktif akan menghitung estimasi waktu yang dibutuhkan untuk mengantar semua paket (harus dibawah 8 jam)
   
7. Value Function (Return):
   `Expected cummulative rewards yang dihasilkan dari state / action. Bagaimana cara searching route system menghasilkan route paling optimal dan menghindari penalti.`
	   - **State Value Function**
	     `Expected rewards from state s`
	     State *paket sampai di tujuan* akan menghasilkan reward point positive. Semakin sering dan cepat paket sampai di tujuan, semakin baik.
	   - **Action Value Function**
	     `Expected reward from taking action a in state s`
	     Action *menuju ke lokasi selanjutnya* akan menghasilkan reward point positive jika *destinasi paket* dengan *posisi kurir saat ini* dekat. Sedangkan akan menghasilkan punishment jika kurir perlu mengantar jauh dari destinasi 1 ke destinasi lainnya. 

References:
[Day 62: Reinforcement Learning Basics — Agent, Environment, Rewards | by Adithya Prasad Pandelu | Dec, 2024 | Medium](https://medium.com/@bhatadithya54764118/day-62-reinforcement-learning-basics-agent-environment-rewards-306b8e7e555c)


b. \[LO 1, LO 2, LO 3, 10 Points] Definisikan bagaimana perhitungan value function (return) untuk menentukan apakah tujuan dari model reinforcement learning ini sudah tercapai, anda dapat menentukan asumsi untuk perhitungan ini.

Goal dari Model:
- Mengantar 30 barang dalam satu hari
- Memastikan bahwa setiap batch pengantaran <= 20 kg
- Meminimalkan total jarak perjalanan kurir dalam radius 20 km.

Perhitungan value function 