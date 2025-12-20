__ Session - __ SKS
#COMPSCIBINUS🏫2ndSEM #cyber

### Session 1 - Introduction to Network

[[What is internet]]
[[What is protocol]]
[[OSI Layer]]
[[Topology]]
[[Networking Terms]]

[[Routing Devices]]

![[Pasted image 20230913144506.png]]
Connecting simple ping, with same subnet

### Session 2
[[IP Model]]

Subnet Mask differentiate which bits are considered for the network IP and which bits are considered for the host IP. 

Network IP will be exactly same in the same subnet
2 IP is reserved:
NA: Network Address -> Identity (The first IP in the subnet)
BA: Broadcast Address -> Broadcast (The last IP in the subnet)

![[Pasted image 20231004155958.png]]

Step:
1. Cari 2 pangkat - 2 terdekat -> n
2. 32 - n
3. 

Contoh: 
Staff = 32 host
2^n - 2 >= 32 host
2^n => 34
Ketemu **n = 6**

Mencari subnet
32 - n 
32 - 6 = **26**

di PC BINUS pakai Run CISCO 
Staff
NA:
11000000.10101000.01100100.00000000
**192.168.100.0**

BA:
11000000.10101000.01100100.00111111
**192.168.100.63**

IP Range (in between them):
**192.168.100.1 - 192.168.100.62**

Gateway (the first usable IP):
**192.168.100.1**

Front Office
NA: 
11000000.10101000.01100100.01000000
**192.168.100.64**

BA:
11000000.10101000.01100100.01111111
**192.168.100.125**




### Session 3
### Session 4
Infrastructure as a Service (IaaS) -> EC2 (Elastic Compute Cloud)
Platform as a Service (PaaS) -> Deployment, kayak AWS, mbe bisa macem-macemin, tapi OSnya udah diinstall juga
Software as a Service (SAAS)
### Session 5
### Session 6
### Session 7
### Session 8
### Session 9
### Session 10
### Session 11
### Session 12
### Session 13
### Session 14
### Session 15
### Session 16
### Session 17
### Session 18
### Session 19
### Session 20
### Session 21
### Session 22
### Session 23
### Session 24
