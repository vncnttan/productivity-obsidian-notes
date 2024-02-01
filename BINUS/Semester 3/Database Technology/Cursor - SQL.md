Cursor is a temporary memory or a temporary work station yang ada di SQL untuk mengekstrak beberapa baris dari suatu query, sehingga kursor dapat digunakan untuk mengakses baris data satu per satu, tidak langsung semuanya.

```sql
DECLARE
  cursor c_employees IS
    SELECT employee_id, first_name, last_name
    FROM employees;
BEGIN
  OPEN c_employees;
  LOOP
    FETCH c_employees INTO employee_id, first_name, last_name;
    EXIT WHEN c_employees%NOTFOUND;
    
    -- Proses baris data saat ini
    
  END LOOP;
  CLOSE c_employees;
END;
```

