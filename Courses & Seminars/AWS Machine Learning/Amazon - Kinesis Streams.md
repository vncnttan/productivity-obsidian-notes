Sreams are divided in ordered shared/partitions
![[Pasted image 20241013201023.png]]

- Data retention up to 365 days, 24 hours by default
- Ability to reprocess/replay data
- Multuiple applications can consume the same stream
- Once data is inserted, it cannopt be deleted (immutability)
- Records can be up to 1MB in size


#### Capacity Modes
- **Provisioned mode:** 
	- You choose the number of shards provisioned, scale manually or using API 
	- Each shard gets 1MB/s in (or 1000 records per second) 
	- Each shard gets 2MB/s out (classic or enhanced fan-out consumer) 
	- You pay per shard provisioned per hour 
- **On-demand mode:** 
	- No need to provision or manage the capacity 
	- Default capacity provisioned (4 MB/s in or 4000 records per second) 
	- Scales automatically based on observed throughput peak during the last 30 days 
	- Pay per stream per hour & data in/out per GB