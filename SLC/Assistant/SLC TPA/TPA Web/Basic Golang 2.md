### Conditional Branching
``` go
	num := 12

	if num > 12 {
		fmt.Println("Number is less than 12")
	} else if num < 12 {
		fmt.Println("Number is more than 12")
	} else {
		fmt.Println("Number is 12")
	}
```

### Creating Temporary Variable if
``` go
	length := 12
	width := 10

	if area := length * width; area > 110 {
		// Creating variable inside of an if scope
		fmt.Println("Area is more than 12")
	}
```

### Creating Try Catch with the Temporary Variable
```go
	var dob time.Time
	if date, err := time.Parse("2006-01-02", "2020-10-10"); err == nil {
		fmt.Println(date)
	} else {
		dob = date
		fmt.Println(dob)
	}
```
### Switch Case
``` go
	switch num {
	case 1:
		{
			fmt.Println("Num is 1")
		}
	case 2:
		{
			fmt.Println("Num is 2")
		}
	}
```

### Repetition
``` go
// For Loop
	for i := 0; i < 10; i++ {
		fmt.Println(i)
	}

// While Loop
	i := 10

	for i < 10 {
		fmt.Println(i)
	}

// Infinite Loop
	i := 1

	for {
		fmt.Println(i)

		if i > 10 {
			break
		}

		i++
	}

```

