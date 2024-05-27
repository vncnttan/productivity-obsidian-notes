[]()[]()[]()#### Hadoop Ecosystem
![[Pasted image 20240111093231.png]]

Yang akan dipelajari:
- HDFS
- Pig
- Hive
- Scoop

Why Hadoop?
- Toolsnya banyak
- Punya distributed file system sendiri

Commands
`hadoop fs -mkdir test` 
`hadoop fs -ls`

Ganti query jadi hive

MapReduce -> Memproses data secara paralel
![[Pasted image 20240111101025.png]]
Contoh dari map reduce

``` python
from mrjob.job import MRJob, MRStep

class MapReduceByCategory(MRJob):
    def mapping(self, key, value):
        (AppID, AppName, CategoryID, Rating, AppSize, AppType, Price, ReleaseDate, Version) = value.split(',')
        yield CategoryID, 1
    
    def reduce(self, key, values):
        yield key, sum(values)
    
    def steps(self):
        return [MRStep(mapper=self.mapping, reducer=self.reduce)]
    
if __name__ == '__main__':
    MapReduceByCategory.run()
```

Upload Dataset to Hue
`hadoop fs -copyFromLocal Dataset`
// See in files


![[Pig - BDP]]

#### HIVE - Lebih banyak fitur tapi lambat
(Lebih fokus ke storage)

``` Sql
-- CREATE DATABASE RamenShop;

CREATE EXTERNAL TABLE MsCustomer(
    CustomerID INT,
    CustomerName VARCHAR(50),
    CustomerPhone VARCHAR(20),
    CustomerEmail VARCHAR(50)
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
TBLPROPERTIES('skip.header.line.count' = '1');

LOAD DATA INPATH '/user/cloudera/Dataset/RamenShop-Hive/MsCustomer.csv'
INTO TABLE MsCustomer;

DROP TABLE mscustomer;
```
External Table (table yang disimpan lognya di csv, jadi kalau ada metadatanya dia masih kesimpan)


#### Impala - Lebih dikit fitur tapi lebih cepat
(Lebih fokus ke query transactional)
Ngerjain querynya

### mySQL
``` mysql
mysql -u root -p
password: cloudera

CREATE DATABASE ramenshop;
USE ramenshop;
SHOW tables;

SOURCE create+insert.sql

sudo sqoop import-all-tables --connect jdbc:mysql://quickstart:3306/jnev --username=root -P --hive-import --hive-database=jnev
```

![[MongoDB]]

![[Spark - BDP]]

