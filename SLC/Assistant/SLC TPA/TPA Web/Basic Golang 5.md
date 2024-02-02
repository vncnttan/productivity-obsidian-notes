### Module
```
go mod init github.com/vncnttan/Pre-TPAWeb
```

kalau pakai package yang sama, dia harus ada di directory yang sama
```go
// Service.go
package helper

func PrintHelloWorld(num int) {
	for i := 0; i < num; i++ {
		printHelloWorld()
	}
}


// helper.go
package helper

import "fmt"

func Min(a, b int) int {
	// Kalo huruf kecil dia jadi kayak private, gabisa dipake di luar package
	if a < b {
		return a
	}
	return b
}

func Max(a, b int) int {
	// Kalo huruf besar dia bisa dipake kalo ada [namadirektorinya].
	if a < b {
		return a
	}
	return b
}

func printHelloWorld() {
	fmt.Println("Hello World")
}
```


Berlaku jauga kalau misalnya mau pake mdoel di luar dari directory juga harus dijadiin huruf besar

``` go
package model

type Person struct {
	Name   string
	Age    int
	Gpa    float64
	Gender string
}

type Teacher struct {
	Person
	Education string
}

func (p *Person) Introduce() {
	fmt.Println("Morning everyone, my name is " + p.name)
}
```