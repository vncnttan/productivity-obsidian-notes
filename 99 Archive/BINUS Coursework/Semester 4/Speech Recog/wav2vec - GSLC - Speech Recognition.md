Nama  : Vincent Tanjaya  
NIM     : 2602128346

![](file:///C:/Users/NJ23-1/AppData/Local/Temp/msohtmlclip1/01/clip_image002.jpg)

wav2vec 2.0 adalah model automatisasi yang menggunakan Self Supervised Learning (SSL) untuk mempelajari speech unit untuk basic Speech Recogniton tasks seperti _Audio Classification_ dan _Automatic Speech Recognition_. Untuk membangun model wav2vec, dibutuhkan:

-          Dataset tanpa label

-          Model

Untuk model, sudah disediakan pretrained model dari _HuggingFace_ ([https://huggingface.co/docs/transformers/en/model_doc/wav2vec2](https://huggingface.co/docs/transformers/en/model_doc/wav2vec2)) hasil dari riset yang sudah dilaksanakan. Untuk modelnya sendiri cara kerjanya, terdiri dari Multi Layered Convolutional Neural Network sebagai Encoder, lalu memasukkan hasil dari input yang sudah di encode tersebut ke arsitektur Transformer.

![Arsitektur Model wav2vec 2.0](file:///C:/Users/NJ23-1/AppData/Local/Temp/msohtmlclip1/01/clip_image004.png)

Dalam pretrained model tersebut, ada beberapa proses yang dijalankan dalam training modelnya seperti _Masking_ dan _Fine Tuning_.

Masking artinya sebagian dari audio yang sudah di Encode akan di mask, sehingga memberikan tanda saat di proses bahwa bagian tersebut akan di skip saat memproses datanya dan diganti dengan trained vector feature yang sama antara semua masked sequence lainnya.

Referensi:
[https://ai.meta.com/blog/wav2vec-20-learning-the-structure-of-speech-from-raw-audio/](https://ai.meta.com/blog/wav2vec-20-learning-the-structure-of-speech-from-raw-audio/)
[https://arxiv.org/abs/2006.11477](https://arxiv.org/abs/2006.11477)
[https://www.tensorflow.org/guide/keras/understanding_masking_and_padding#:~:text=Masking%20is%20a%20way%20to,the%20end%20of%20a%20sequence](https://www.tensorflow.org/guide/keras/understanding_masking_and_padding#:~:text=Masking%20is%20a%20way%20to,the%20end%20of%20a%20sequence).