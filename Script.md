Title - Melakukan hosting website aplikasi svelte berbasis nodejs menggunakan AWS

Kami dari kelompok 16 terdiri dari :
Nobel Shan Setiono - 2602080762
Teresa Stefanie Sheryl - 2602060035
Vincent Tanjaya - 2602128346

Background: 
Portfolio merupakan suatu hal yang penting dibuat untuk meningkatkan peluang mendapatkan pekerjaan, terutama dalam industri kreatif, teknologi, ,dan profesi yang menuntuk keterampilan teknis. Portfolio juga seharusnya mudah untuk diakses oleh rekruter, sehingga sebaiknya dideploy di internet. Nah disini AWS dapat menawarkan solusi lengkap untuk deploy aplikasi yang mencakup fleksibilitas, keamanan, efisiensi, dan performa untuk hosting website.

Berikut adalah cara melakukan hosting website portfolio di AWS menggunakan docker!

Disini kita akan melakukan hosting website menggunakan container docker!
Container docker adalah linkungan runtime yang berisi semua komponen yang dibutuhkan untuk menjalankan aplikasi/website

```
docker build -t portfolio .
docker login registry.vncnttan.my.id
docker tag portfolio:latest registry.vncnttan.my.id/portfolio:latest
docker push registry.vncnttan.my.id/portfolio:latest
```

Create Key Pair 
- Key pair type: RSA
- Private key format .pem
- Simpan key .pem nya

Paste this to User Data : Untuk install curl ca-certificates, dan docker
```
#!/bin/bash
apt-get update
apt-get install -y ca-certificates curl gnupg
install -m 0755 -d /etc/apt/keyrings
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | gpg --dearmor -o /etc/apt/keyrings/docker.gpg
chmod a+r /etc/apt/keyrings/docker.gpg
echo "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu $(. /etc/os-release && echo "$VERSION_CODENAME") stable" | tee /etc/apt/sources.list.d/docker.list
apt-get update
apt-get install -y docker-ce docker-ce-cli containerd.io docker-compose-plugin
usermod -aG docker ubuntu
systemctl start docker
systemctl enable docker
```

- Connect dengan instance yang barusan dibuat di console dengan Public IP4 Address


Copy docker compose.yml yang dibuat
```
services:
  web:
    image: registry.vncnttan.my.id/portfolio:latest
    container_name: portfolio
    ports:
      - "5002:80"
```

2. Check if port 5002 is open in EC2 Security Group:
- Go to EC2 dashboard
- Click on your instance
- Click on the Security Group link
- Click "Edit inbound rules"
- Add a new rule:
    - Type: Custom TCP
    - Port range: 5002
    - Source: Anywhere (0.0.0.0/0)
    - Click "Save rules"

Terima kasih sudah mengikuti tutorial ini, semoga bermanfaat

