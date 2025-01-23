Recommendation System Netflix

* Agent -> Yang melakukan aksi rekomendasi
	Recommendation System (yang melakukan aksi rekomendasi)

* Environment -> Hal eksternal diluar, yang berinteraksi dengan agent
	- Region/Negara
	- Device
	- Preferensi Genre yang diinput user
	- Interaction history (semakin banyak user berinteraksi dengan suatu film, mungkin film tersebut akan direkomendasikan ketika user belum kelar menonton filmnya)

* State
	* Film di ban di suatu negara
	* Film populer di suatu negara
	* Ratings diberikan oleh user
	* Film populer di suatu genre

* Action -> Action yang bisa diberikan oleh agent
	* Memberikan pop up rekomendasi saat homepage
	* Memberikan list of rekomendasi film di homepage
	* Memberikan list of rekomendasi melanjutkan series yang belum selesai


- Reward
	* Click (user klik rekomendasi, berarti recommendation system berhasil menemukan rekomendasi yang cocok)
	* Ignore (user ignore rekomendasi, berarti recommendation system kurang berhasil menemukan film yang cocok)
	* Close (karena rekomendasi offensive/buruk, user hingga keluar dari aplikasi netflix dan tidak mood untuk nonton lagi)

- Policy
	- Parametric Policy: Model predictive bisa digunakan untuk mencari dari feature user seperti preferensi genre dll, mana film yang bisa di rekomendasikan
	- Graph Machine Learning: Graph machine learning dapat digunakan untuk melihat film apa yang dinikmati oleh user yang menonton hal serupa
	- Random: Random bisa digunakan untuk membuat user explore ke film2 baru

- Value Function:
	- State Value Function: Apakah user yang direkomendasikan sesuatu memberikan nilai yang tinggi
	- Action Value Function: Bagaimana rekomendasi mempengarui reward yang diberikan user dan bagaimana long-term benefitnya, misalnya dari engagement user dll
