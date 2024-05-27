To receive form, make 2 php,
Form field (form.php) & form action

int the form field, tambahin form action = "form_action.php"

Di form_action.php bisa ambil value dari variable form.php dengan pake `$_POST['name']`
`$_POST['age']`

print array using `print_r($_POST)`

- Post 
- get
- request (post or get bisa keluar bebas)

redirect langsung, jadi setelah task semua jalan redirect ke link yg dikasi
`header('location:form.php?name='.$_REQUEST('name')`

function juga dijelasin more or less the same

include('component.php'); langsung eksekusi yang ada di component.php jadinya kayak bootstrap.

localhost/phpmyadmin/

sql

create new database - create new table 

![[Pasted image 20221112120453.png]]
A_I autoincrement
id int
name varchar 
age int

save insert (insert data nya)

users abis itu browse untuk liat databasenya


to ambil data dari sqlnya, bikin php baru connection.php
$servername = 'localhost';
$username = 'root';
$password = '';

ini defaultnya
$database = 'amdp3' (ini dari yang kita masukkin pas ke localhost/phpmyadmin)


``` php
connection.php

$conn = mysqli_connect($servername, $username, $password)

If(!$conn){  
	 die(“error koneksi : “.mysqli_connect_error)

}

select.php

include 'connection.php'
$query = 'SELECT * FROM users';
$result = mysqli_query($conn, $query);

while($row = result->fetch_assoc()){
	print_r($row);
	echo $row['name']. ' ';
}

This is all for accessing data inside of my sql
```


cookies
bisa diakses dimana aja
```php
cookies.php
setcookie('name', 'nathan', time() + brp buat expired);
session


tmp.php
echo $_COOKIE['name']
```

session
```php
session_start();
$_SESSION['name'] = 'Candra'

bakal keluar
echo $_SESSION['name']
```

kalo session gabisa keliatan di webnya.. lebih recommended daripada cookies

input type file
```php
print_r($_FILES['profile_picture']);

ditambagin enctype = multipart/form data di html form field

di move dari tmp folder yg bakal di destroy ke folder assets kita pake move_uploaded_file

```


![[Pasted image 20221112123926.png]]
