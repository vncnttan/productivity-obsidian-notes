Array
```go
	// Cara 1 - Mono data type
	array := []string{
		"budi",
		"justin",
		"steven",
	}

	fmt.Println(array)
	fmt.Println(len(array))

	// Length nya bisa di specify
	array := [4]string{
		"budi",
		"justin",
		"steven",
	}

	// Bisa diisi secara individual
	array[3] = "yuda"


	// Cara 2 - Pake make, kita bisa append arraynya tapi kita kasih initial sizenya
	array := make([]int, 12)

	array[0] = 12

	// Appending the array size
	array = append(array, 20)

	fmt.Println(array[1])
	// array := []string{
	// 	"budi",
	// 	"justin",
	// 	"steven",
	// }

	for _, arr := range array {
		fmt.Println(arr)
	}
```


### String functions & Slicing
```go
	name := "Jovita Waisakhi"

	fmt.Println(name[2:10])
	index := strings.Index(name, " ")
	fmt.Println(index)
```