#### Installation
`go mod init github.com/vncnttan/ngojek`
Create module file

`go get -u github.com/gin-gonic/gin`
Download gin dependencies

#### Ping
```go
// server.go
package main

import "github.com/gin-gonic/gin"

func main() {
	r := gin.Default()
	r.GET("/", func(c *gin.Context) {
		c.JSON(200, gin.H{
			"message": "pong",
		})
	})

	r.Run()
}

```

To run the file, access with
`go run .\server.go`

Go to `127.0.0.1:8080/`
#### GORM
`go get github.com/gin-gonic/gin gorm.io/gorm`
Download GORM

`go get gorm.io/driver/postgres`
Download Golang Postgres Driver

Create Model
``` go
// models/career.go
package models

type Career struct {
	ID         uint   `json:"id" gorm:"primary_key"`
	Title      string `json:"title"`
	Department string `json:"department"`
	Location   string `json:"location"`
}

```


Setup Database
```go
package database

import (
	"fmt"

	"gorm.io/driver/postgres"
	"gorm.io/gorm"
)

const (
	host     = "localhost"
	port     = 5432
	user     = "postgres"
	password = "postgres"
	dbname   = "practice_gin_gorm"
)

func ConnectDatabase() *gorm.DB {
	sqlInfo := fmt.Sprintf("host=%s port=%d user=%s password=%s dbname=%s sslmode=disable", host, port, user, password, dbname)
	database, err := gorm.Open(postgres.Open(sqlInfo), &gorm.Config{})

	if err != nil {
		panic("Failed to connect to database!")
	}

	return database
}
```

```go
// career_repository.go
package repository

import "github.com/vncnttan/ngojek/models"

type CareerRepository interface {
	FindAll() ([]models.Career, error)
	Save(career models.Career) (models.Career, error)
	FindByID(id uint) (models.Career, error)
}
```

```go
// career_repository_impl.go
package repository

import (
	"github.com/vncnttan/ngojek/models"
	"gorm.io/gorm"
)

type CareerRepositoryImpl struct {
	DB *gorm.DB
}

func NewCareerRepositoryImpl(db *gorm.DB) *CareerRepositoryImpl {
	return &CareerRepositoryImpl{DB: db}
}

func (c *CareerRepositoryImpl) FindAll() ([]models.Career, error) {
	var careers []models.Career
	err := c.DB.Find(&careers).Error
	if err != nil {
		return nil, err
	}

	return careers, nil
}

func (c *CareerRepositoryImpl) Save(career models.Career) (models.Career, error) {
	err := c.DB.Save(&career).Error
	if err != nil {
		return models.Career{}, err
	}

	return career, nil
}

func (c *CareerRepositoryImpl) FindByID(id uint) (models.Career, error) {
	var career models.Career
	err := c.DB.First(&career, id).Error
	if err != nil {
		return models.Career{}, err
	}

	return career, nil
}
```