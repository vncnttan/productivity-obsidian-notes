    24 Session - 2 SKS
#COMPSCIBINUS🏫2ndSEM #code 

### Session 1 - Introduction to Database System

DBMS - Database Management System
- MySQL
- SSMS

Why use DBMS? 
- Consistent
- Reduce Redundance
- Reduce Development Time
- Data Independence and Efficient Access
- Uniform Data Administration
- Conccurent access, Recovery from crashes

Why Study Database:
- Shift computation to information
- Datasets increasing in diversity and volume

Data models: Collection of high level concepts for describing data (similar to data type)
Schema: Description of particular collection of data models.

[[Level of Abstraction]]

Conccurenccy use: Insulate how the data is stored

### Session 2 - Entity Relationship Model

Entity Relationship Model is used in Conceptual Design
[[Entities & Relationships]]
[[AOL Project]]

### Session 3 - The Relational Model
[[Relational Models]]

### SQL Statements:
[[Data Definition Language (DDL)]]
[[Data Manipulation Language (DML)]]
[[Data Query Language (DQL)]]
[[Transact Control Language (TCL)]]
[[Data Control Language (DCL)]]

[[Integrity Constraints]]
[[Database Keys]]
[[Views]]
  
Standardization: To login, the society has set a standard to input the email and password

### Session 4
- Usually DB design will be learnt top-down (conceptual, then physical)


### Session 5
### Session 6
### Session 7

[[ACID - DB]]


## Referential Integrity Constraint (Foreign Key)
Referential Integrity -> Data quality concept that ensures when you make changes of data in one place, those changes are reflected in other related records.

A logical rule about values in one or more columns in one or more tables. This means, the value references another value in another table, and you can infer more information about that data in the table source of the reference. 

### Inference Rules
- Reflexivity
	if Y is a subset of X, then X -> Y
	
	{roll_no, name} -> name is valid

- Augmentation
  if X -> Y, then XZ->YZ
  
  If 
  {customerID} -> {customerAge} 
	then
	{transactionID, customerID} -> {transactionID, customerAge} is valid
	A UNION of "givens" is sufficient to determine the UNION of the results corresponding to [each of] those "givens" and a thing being "given" is of course trivially sufficient to determine the thing. (That's the Z->Z part).

- Transivity
  if X -> Y and Y-> Z, then X->Z
  
  maka secara tidak langsung Y dan Z bergantung dengan A
  
  If 
  {CourseID} -> {StudentID}, {StudentID} -> {StudentName}
  
  then
  {CourseID} -> {StudentName}

### Jenis-jenis Dependency:
- Trivial Dependency
  When the set of attributes are dependent to their superset. Which means, attributes that dependent are included in that attribute
  
  Trivial Functional Dependency
  If X is a subset of Y then Y-> X
  
  Jika kita tahu Emp_id dan Emp_name nya, berarti kita tahu emp_name nya
  
- Non-trivial functional dependency
  When the set attributes are dependent to other attributes. Because the information is dependent to other attributes, this means, if you have known the attribute, attributes that are dependent to it will be an extra information:
  
  Non-trivial functional dependency
  X -> Y when Y is not a subset of X
  
  Jika kita tahun Emp_Id, maka kita tau Manager_ID, 
  Manager_id bukan merupakan attributes Emp_id dari awal, namun karena kita memiliki dependency, hanya dengan tahu employee nya siapa kita langsung tahu managerID nya
  
-  Multi Valued Dependency
  When given a data, there is multiple tuples of data that is required to be present (multivalued attributes). Multi valued dependency occurs when there is multiple multivalued attributes.
  
  For example:
  Manager_id, Employee_id, ManagerTitle
  Employee_id and the managerTitle is not dependent to each other, so
  
  Manager_id => Employee_id
  Manager_id => Manager_title

- Transitive Dependency
  When Z is formed indirectly by two functional dependency. Jika X menentukan Y, dan Y menentukan Z, maka secara tidak langsung X menentukan Z, walaupun X dan Z tidak berhubungan secara langsung. 
  If
  X -> Y dan Y -> Z maka X -> Z

	For Example:
	Company_ID -> CEO_ID and CEO_ID -> CEO_age
	
	Then
	Company_ID -> CEO_Age 

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



```mysql
DECLARE var_name VARCHAR(255)
DECLARE var_age INT
DECLARE done INT FALSE

DECLARE nama_cursor CURSOR FOR 
SELECT name, age 

DECLARE CONTINUE HANDLER FOR NOT FOUND SET DONE = TRUE


MahasiswaLoop LOOP:
	FETCH nama_cursor INTO var_name, var_age
	
	IF done 
	THEN:
		LEAVE MahasiswaLoop

	SELECT(CONCAT('Name: ', var_name, 'Age: ', var_age))

END LOOP

CLOSE cursor_name
```
