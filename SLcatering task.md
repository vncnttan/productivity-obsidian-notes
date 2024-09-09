di local pc
docker compose build
docker tag vncnttan/slcatering-be:latest vncnttan/slcatering-be:latest
docker push

di vps
docker pull vncnttan/slcatering-be



Pertanyaan:
- Kalau misalnya di private docker registry, itu bisa di push dan pull dari luar vpsnya ga?


## Setup Task
- Setup subdomain v
- Setup Backend CICD v
- Setup SSL v
- Setup Private Docker Registry v
- Fix Frontend x
- Migrate Secrets to variables for insensitive datas in github v
- Fix Backend and QRIS
- Implement multiple merchant payment gateway 
- Docker Volume v