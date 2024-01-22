## Declaring Variables
``` go
	// Cara 1
	var number int64 = 12
	var number2 int
	number2 = 10
	fmt.Println(number, number2)

	// Cara 2
	var name = "Renaldy"
	fmt.Println(name)

	// Cara 3 (Recommended)
	email := "renaldi@gmail.com"
	email = "budi@gmail.com"
	fmt.Println(email)

	// Cara 4 (Cuma bisa satu tipe data)
	var num1, num2, num3 int = 1, 2, 3
	fmt.Print(num1, num2, num3)
	
	// Cara 5 (Bisa beda tipe data)
	name, age, email, gpa := "Budi", 20, "budi@gmail.com", 12.3
	fmt.Print(name, age, email, gpa)

	// Cara 6
	var (
		decimal   float64 = 3.14
		name      string  = "asd123"
		age       int     = 20
	)
```

### Data Types
- string
- int
- float32 
- float64
- bool
- time
- pointer

``` go
// Changing string to time, with the date format
	dob := "2020-12-12"

	date, err := time.Parse("2006-01-02", dob)
	// Kenapa 2006-01-02 nanti cek
	if err != nil {
		fmt.Println(err)
	} else {
		fmt.Println(date)
	}
	
    fmt.Println(time.Now())
```

# Constanta 
``` go
    const phi float64 = 3.14
    // phi = 2.1 // Error

	// Making multiple const
	const (
		phi       float64 = 3.14
		secretKey string  = "asd123"
		domain    int     = 20
	)
```

### Operator
- +
- -
- *
- /
- %
- ||
- &&
- <
- >
- <=
- >=
- ==
- !=

[[Basic Golang 2]]
[[Basic Golang 3]]
[[Basic Golang 4]]
[[Basic Golang 5]]
