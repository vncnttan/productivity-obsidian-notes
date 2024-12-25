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
    networks:
      - internal
networks:
  internal:
    external: true
    name: internal
```

