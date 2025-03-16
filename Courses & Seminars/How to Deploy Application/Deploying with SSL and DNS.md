
Main Source:
[How To Secure Nginx with Let's Encrypt on Ubuntu 20.04 | DigitalOcean](https://www.digitalocean.com/community/tutorials/how-to-secure-nginx-with-let-s-encrypt-on-ubuntu-20-04)
#### DNS Configuration
1. Login to hostinger and add CNAME with something, then add the content to be vncnttan.my.id (the DNS) on the DNS section

![[Pasted image 20250224223555.png]]


#### NGINX Configuration
1. go to /etc/nginx on the remote computer
2. add this, make sure to change the server name and the proxy pass (one for frontend, and one for backend)
   ```
	server {
	    server_name mydd.vncnttan.my.id www.mydd.vncnttan.my.id;
	
	    location / {
	        proxy_pass http://localhost:3310/ ;
	        proxy_set_header Host $host;
	        proxy_set_header X-Real-IP $remote_addr;
	        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
	        proxy_set_header X-Forwarded-Proto $scheme;
	    }
	}
	```

3. run `sudo nginx -t` in terminal and make sure the configuration and syntax is ok
4. run `sudo systemctl reload nginx` in terminal 

#### Certbot SSL Certificate
Run this in the terminal, dont forget to change the server name
```
sudo certbot --nginx -d mydd.vncnttan.my.id -d www.mydd.vncnttan.my.id
```

#### Verifying Certbot Auto-Renewal
You can query the status of the timer with `systemctl`:
```
sudo systemctl status certbot.timer
```

To the the renewal process, you can do a dry run with
```
sudo certbot renew --dry-run
```