Vincent Tanjaya - 2602128346
Mencari rute paling optimal untuk perjalanan kurir yang mengangkut paket.

##### a. \[LO 1, LO 2, LO 3, 15 Points] Mendefinisikan semua element dalam reinforcement learning agent, environment, state, action, reward, policy dan value function (return) untuk problem ini

1. Agent
   `Decision maker / learner yang melakukan aksi dengan cara berinteraksi dengan environment. Bertujuan memilih keputusan terbaik untuk mencapai tujuan.`
	   - **Searching Route, Decision, and Allocation System**
   
2. Environment:
   `Hal eksternal diluar sistem yang berinteraksi dengan agent dan merespon dengan agent, menghasilkan feedback dan state baru.`
	   - **Map lokasi tempat yang dapat dijangkau oleh kurir**
	   - **Berat dan ukuran dari paket yang dikirim**
	   - **Kondisi jalan dan rute yang tersedia**

3. State:
   `Keadaan dari environment di satu waktu tertentu, memberikan semua informasi yang dibutuhkan oleh agent untuk menentukan keputusan. Representasi environment di suatu waktu tertentu. State datangnya dari environment.`
	   - **Posisi kurir saat ini**
	   - **Jalan selanjutnya yang dapat dilalui oleh kurir/ditutup**
	   - **Destinasi dari paket yang belum diantar**
	   - **Sisa waktu dari 8 jam**

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
	   - **Paket mana saja yang perlu diantar dalam suatu perjalanan tertentu**
	     Dalam satu perjalanan, kurir dapat mengangkut beberapa paket secara sekaligus, maka agent harus dapat menentukan paket mana yang sebaiknya diambil oleh kurir yang mana. Perlu diperhatian juga bahwa paket tidak boleh melebihi 20kg dan destinasi dari paket tidak melebihi 20km.
	   - **Urutan pengantaran mana yang paling optimal**
	     Urutan optimal pengantaran perlu dijadikan sebagai policy agar kurir dapat memprioritaskan pengantaran dengan baik. Jika urutan pengantaran tidak optimal, maka jalur yang dilewati kurir akan tidak efisien sehingga boros waktu.
	   - **Kapan harus kembali ke posisi awal**
	     Model juga harus memutuskan kapan harus kembali ke posisi awal. Perlu dipertimbangkan jumlah berat dan destinasi paket yang tersisa, serta posisi kurir sekarang dengan posisi pos. Jika posisi kurir mendekati posisi awal dan barang yang dibawa sedikit, serta destinasi paketnya akan melewati pos, maka kemungkinan besar kurir akan diarahkan untuk kembali ke posisi awal untuk mengambil paket yang dialokasikan.
	   - **Rute terpendek antara titik pengantaran yang mana yang bisa diambil**
	     Rute terpendek antara titik pengantaran / lokasi kurir saat ini perlu dicari yang paling optimal agar waktu yang terbuang minimal dan semakin banyak paket yang sampai ke destinasi tujuan.
   
7. Value Function (Return):
   `Expected cummulative rewards yang dihasilkan dari state / action. Bagaimana cara searching route system menghasilkan route paling optimal dan menghindari penalti.`
	   - **State Value Function**
	     `Expected rewards from state s`
	     Contoh: State *paket sampai di tujuan* akan menghasilkan reward point positive. Semakin sering dan cepat paket sampai di tujuan, semakin baik.
	   - **Action Value Function**
	     `Expected reward from taking action a in state s`
	     Contoh: Action *menuju ke lokasi selanjutnya* akan menghasilkan reward point positive jika *destinasi paket* dengan *posisi kurir saat ini* dekat. Sedangkan akan menghasilkan punishment jika kurir perlu mengantar jauh dari destinasi 1 ke destinasi lainnya. 

References:
[Day 62: Reinforcement Learning Basics — Agent, Environment, Rewards | by Adithya Prasad Pandelu | Dec, 2024 | Medium](https://medium.com/@bhatadithya54764118/day-62-reinforcement-learning-basics-agent-environment-rewards-306b8e7e555c)


##### b. \[LO 1, LO 2, LO 3, 10 Points] Definisikan bagaimana perhitungan value function (return) untuk menentukan apakah tujuan dari model reinforcement learning ini sudah tercapai, anda dapat menentukan asumsi untuk perhitungan ini.

**Goal dari Model**:
- Mengantar 30 barang dalam satu hari
- Memastikan bahwa setiap batch pengantaran <= 20 kg
- Meminimalkan total jarak perjalanan kurir dalam radius 20 km.

**Asumsi yang diambil**:
- Pengantaran dilakukan beberapa barang sekaligus
- Rute tercepat antar titik sudah ditemukan melalui GPS dan algoritma
- Fokus lebih ke alokasi paket ke kurir dan waktu yang dibutuhkan


![[Pasted image 20250123111531.png]]

Reinforcement Learning dapat menggunakan formula **Action Value Function** untuk menentukan expected return (cummulative reward) dari state s, yang mengambil action a.

γ (0≤γ≤1) adalah discount factor yang mementingkan reward masa depan dibandingkan dengan reward saat ini. Tujuannya untuk mendapatkan hasil yang paling optimal di masa depan dan membuat model tidak greedy (naif). 

Contoh perhitungan value function yang dapat digunakan:
**Reward Positif (+)**:
	\+ 100 jika semua 30 barang berhasil diantarkan dalam 8 jam
	\+ 50 jika barang berhasil diantarkan ke alamat tujuan
	+ 5 jika barang diterima dengan rating tinggi (barang diterima dengan kondisi baik)

**Reward Negatif (-)**:
	\- 500 jika dalam 8 jam pengantaran paket masih belum selesai
	- 10 setiap jam yang terbuang dalam pengantaran barang (memastikan tetap mencari jalur yang optimal)
	- 20 jika jarak tempuh dalam satu perjalanan melebihi jarak optimal dalam radius 20km
	- 50 jika barang melampaui kapasitas maksimal


References:
[Relationship between state (V) and action(Q) value function in Reinforcement Learning | by Dhanoop Karunakaran | Intro to Artificial Intelligence | Medium](https://medium.com/intro-to-artificial-intelligence/relationship-between-state-v-and-action-q-value-function-in-reinforcement-learning-bb9a988c0127)

Algoritma berikut dapat digunakan untuk membantu agent memberikan keputusan
  - **Neighboring Destination Policy**
	 Model clustering bisa digunakan untuk melakukan grouping terhadap lokasi destination, sehingga packet dengan destination yang berdekatan diantar oleh kurir yang sama dengan k tertentu (k =  jumlah paket yang bisa dibawa, bergantung dengan berat masing-masing paket) 
   - **Dijkstra / A****
	 Dijkstra / A* dan algoritma serupa dapat digunakan untuk menentukan rute paling optimal dari suatu titik ke titik lain dalam peta. Algoritma-algoritma ini juga dapat digunakan untuk menentukan urutan paket yang akan diantar selanjutnya, bergantung dengan cost yang dihasilkan dari suatu trip.
   - **Brute Force**
	 Algoritma dapat menggunakan metode Brute Force untuk mencoba **semua kemungkinan** dari rute yang dapat diambil, lalu action value function akan menghitung estimasi reward yang dihasilkan dari state yang ada saat ini.


TODO: Penjelasan kode nomor 1 2


References Nomor 1

[[1708.07747] Fashion-MNIST: a Novel Image Dataset for Benchmarking Machine Learning Algorithms](https://arxiv.org/abs/1708.07747)