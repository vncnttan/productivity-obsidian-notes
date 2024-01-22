Transaction Management (ACID PROPERTIES & SCHEDULING PROPERTIES)
CURSOR (konsep) 15 poin
Studi Kasus (Statement LIKE)
Studi Kasus (Nested queries & aggregated function)
Studi Kasus (JOIN, Aggregated function, GROUP BY, HAVING, COUNT)
Studi Kasus (trigger) cara bikin trigger dan bagaimana memanipulasinya

[[Cursor - SQL]]

Penerapan scheduling dapat berdampak pada terjaganya konsistensi data dikarenakan scheduling adalah beberapa transaksi yang dilakukan di jadwal tertentu. dan bisa bertabrakan dengan waktu lainnya, sehingga mungkin terjadi inkonsistensi data jika saat transaksi dijalankan, ada query lain yang bertabrakan

Transaksi yang membutuhkan serial scheduling adalah
1. Transaksi untuk delete data
2. Transaksi untuk memperbarui data
3. Transaksi yang sensitif

Transaksi yang dapat menggunakan transaction adalah:
1. Transaksi read data
2. Transaksi insert data


Tanpa _serial scheduling_ atau _serializable scheduling_, query dapat bertabrakan dan menyebabkan data tidak konsisten. Penggunaan _serial scheduling_ atau _serializable scheduling_ diperlukan untuk memastikan integritas dan konsistensi data, terutama untuk transaksi yang saling bergantung atau mengakses data yang sama.


Contoh fungsi cursor adalah kita dapat fetching data, updating data, deleting data, maupun navigating data dengan preprocess, misalnya kita dapat mengeprint receipt dengan suatu data sebagai header receipt, lalu item dari querynya dapat di iterasi.

```sql
DECLARE done INT DEFAULT FALSE;
DECLARE student_nim INT;
DECLARE student_name VARCHAR(255);
DECLARE student_major VARCHAR(255);

DECLARE mahasiswa_cursor CURSOR FOR
    SELECT nim, nama, jurusan
    FROM mahasiswa;

DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

OPEN mahasiswa_cursor;
mahasiswa_loop: LOOP
    FETCH mahasiswa_cursor INTO student_nim, student_name, student_major;
    IF done THEN
        LEAVE mahasiswa_loop;
    END IF;
    SELECT CONCAT('NIM: ', student_nim, ', Name: ', student_name, ', Major: ', student_major) AS Result;
END LOOP;
CLOSE mahasiswa_cursor;
```

No. 5
``` MySQL
-- a
SELECT FirstName, LastName, Email
FROM Customers
WHERE Email LIKE '%@yahoo.com';

-- b
SELECT FirstName
FROOM Customers
WHERE CustomerID IN (1, 2, 4);

-- c
SELECT CustomerID, SUM(Quantity)
FROM Transactions
GROUP BY CustomerID;

-- d
SELECT OrderDate, SUM(TotalAmount) AS 'Sales', AVG(TotalAmount) AS 'AVG_TOTAL_AMOUNT'
FROM Transactions 
GROUP BY OrderDate;

-- e
SELECT ProductName, 
	COUNT(OrderID) AS 'NUMBER_OF_SOLD'
FROM Transactions
JOIN Products
GROUP BY (Transactions, Product);

-- f
SELECT Quantity 
FROM Transactions 
WHERE Quantity > 
(SELECT AVG(Quantity) 
 FROM Transactions);

-- g
SELECT ProductName
FROM Transactions
WHERE Price > 
(SELECT AVG(Price) 
 FROM Products);


-- h
CREATE TRIGGER trigger_name
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
	UPDATE Products
	SET Quantity = Quantity - 1
	WHERE ProductID = NEW.ProductID;
END;
```


