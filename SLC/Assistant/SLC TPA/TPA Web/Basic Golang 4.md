Function
```go
func max(a, b int) (int, string) {
	if a > b {
		return a, "a > b"
	}
	return b, "b > a"
}


func main() {
	fmt.Println(max(20, 12))
}
```

Multiple return functions
``` go
func calculate(a, b int) (int, int) {
	return a + b, a * b
}
```

Pointer
``` go
func main() {
	var num int
	numPtr := &num

	if numPtr != nil {
		fmt.Println("Num ptr is not nil")
	}

	var nilPtr *int
	if nilPtr != nil {
		fmt.Println("Nil ptr is not nil")
	}
}

```


#### Applying Pointer: Bubble Sort
``` go
func swap(a, b *int) {
	temp := *a
	*a = *b
	*b = temp
}

func bubbleSort(a []int) {
	for i := 0; i < len(a); i++ {
		for j := i; j < len(a)-i-1; i++ {
			if a[j] > a[j+1] {
				swap(&a[j], &a[j+1])
			}
		}
	}
}
```


### Making an object : Struct
``` go
type Person struct {
	name   string
	age    int
	gpa    float64
	gender string
}

func main() {
	p := Person{
		name:   "nj",
		age:    19,
		gpa:    3.5,
		gender: "Male",
	}

	fmt.Println(p.name)

	pPtr := &p

	fmt.Println(pPtr.name)
}
```

#### Struct Embedding: Inheritance
``` go
type Teacher struct {
	Person
	education string
}


// Cara panggil
teacher := Teacher{
	Person:    p,
	education: "Binus",
}

fmt.Println(teacher.name)

// Cara 2
teacher := Teacher{
	Person: Person{
		// kasi atributenya
	},
	education: "Binus",
}


```
Teacher jadi punya atribut person gitu

### Making methods that is binded to a struct
``` go
func (p *Person) introduce() {
	fmt.Println("Morning everyone, my name is " + p.name)
}

teacher.introduce()
```