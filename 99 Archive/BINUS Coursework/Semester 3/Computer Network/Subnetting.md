192.168.0.0/24
/24 -> cidr

Setiap IP punya subnet sendiri, 
FLSM (Bakal ngambil dari host pertama)
network address -> 192.168.0.0
ip range -> 192.168.0.1 - 192.168.0.62
broadcast address -> 192.168.0.63
wildcard -> 
00000000.00000000.00000000.00111111
11111111.11111111.11111111.11000000


subnet = 32 - subnet lama - h
	      = 32 - 24 - 5
	      = 3

	subnet baru = subnet lama + subnet 11`1222222ZXXZ
					= 24 + 3
					= 27


