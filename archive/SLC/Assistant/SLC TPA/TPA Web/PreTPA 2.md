1. Ikutin aja dari [Building GraphQL servers in golang — gqlgen](https://gqlgen.com/getting-started/)
2. Go mod dan go sum itu kayak package library di golang
3. kita ga bikin struct dari awal, cumantinggal ganti di schema.graphqls nya aja
4. Hapus schema dan schema.resolvers.go biar bisa bikin schema di banyak file
5. Buat schemanya
6. Final touches di getting started go run generate...


### ORM
- https://gorm.io/
- Search aja postgreSQL terus tinggal copy
- `go get gorm.io/driver/postgres`
- buat folder database dan bikin database.go
``` go
# database/database.go
package database

import (
	"os"

	"gorm.io/driver/postgres"
	"gorm.io/gorm"
)

var database *gorm.DB

const defaultDatabase = "host=localhost user=gorm password=123456 dbname=gorm port=5432 sslmode=disable TimeZone=Asia/Shanghai"

func GetInstance() *gorm.DB {
	if database == nil {
		dsn := os.Getenv("DATABASE_URL")

		if dsn == "" {
			dsn = defaultDatabase
		}

		db, err := gorm.Open(postgres.Open(dsn), &gorm.Config{})

		if err != nil {
			panic(err)
		}
		database = db
	}

	return database
}
```

- Ganti passwordnya
- (Opsional) buat get env untuk conceal password
``` go
DATABASE_URL = "host=localhost user=gorm password=123456 dbname=preTPA port=5432 sslmode=disable TimeZone=Asia/Shanghai"
```
- (Opsional kalo pake env)Copy dari mbe yang line
- Buat Resolver objectnya
``` go
type Resolver struct {
    DB *gorm.DB
}
```
- Tambahin ini di sever.go
``` go
srv := handler.NewDefaultServer(graph.NewExecutableSchema(graph.Config{Resolvers: &graph.Resolver{

        DB: database.GetInstance(),

    }}))
```

Buat di database.go
```go
func MigrateTable() {
	db := GetInstance()
	db.AutoMigrate(&model.User{})
}
```

### Cara ganti atribut model (constraints dkk)
- buat gorm:"primary key" kalo misalnya gaada tipe data ID 
- uncomment yml line 68
- pindahin yang dari model_gen ke file baru di folder model
- hapus tabel yang lama terus generate lagi

### Starting to use query
Getting started dari https://github.com/google/uuid
Kalo ada yang gamau bisa di query in tarohnya di struct aja



``` go
// CreateUser is the resolver for the createUser field.
func (r *mutationResolver) CreateUser(ctx context.Context, inputUser *model.NewUser) (*model.User, error) {
	user := &model.User{
		ID:       uuid.NewString(),
		Name:     inputUser.Name,
		Email:    inputUser.Email,
		Username: inputUser.Username,
		Password: inputUser.Password,
	}
	return user, r.DB.Save(&user).Error
}

// capek: bisa diliat aja yah codenya
// UpdateUser is the resolver for the updateUser field.
func (r *mutationResolver) UpdateUser(ctx context.Context, id string, inputUser *model.NewUser) (*model.User, error) {
	var user *model.User

	if err := r.DB.First(&user, "id = ?", id).Error; err != nil {
		return nil, err
	}

	user.Name = inputUser.Name
	user.Email = inputUser.Email
	user.Password = inputUser.Password
	user.Username = inputUser.Username

	return user, r.DB.Save(&user).Error
	// Biasanya dipake save first find
}

DELETE USER PLIS MINTA

// GetUser is the resolver for the getUser field.
func (r *queryResolver) GetUser(ctx context.Context, id string) (*model.User, error) {
	var user *model.User
	return user, r.DB.First(&user, "id = ?", id).Error
	// panic(fmt.Errorf("not implemented: GetUser - getUser"))
}

// GetAllUser is the resolver for the getAllUser field.
func (r *queryResolver) GetAllUser(ctx context.Context) ([]*model.User, error) {
	var users []*model.User
	return users, r.DB.Find(&users).Error
}

```


Testing

```
# mutation CreateUser($inputUser:NewUser){
#   createUser(inputUser:$inputUser){
#     id
#     name
#     username
#     email
#   }
# }

Variables
{
  "inputUser": {
    "name": "BW",
    "email": "budi@gmail.com",
    "password": "budi123",
    "username": "bewe"
  }
}

# mutation UpdateUser($id:ID!, $inputUser:NewUser){
#   updateUser(id:$id, inputUser:$inputUser){
#     id
#     name
#     username
#     email
#   }
# }

{
  "id": "73b8be66-9c1b-431b-8a46-92bb2b3e485d",
  "inputUser": {
    "name": "AB",
    "email": "alberric@gmail.com",
    "password": "budi123",
    "username": "bewe"
  }
}

# mutation DeleteUser($id:ID!){
#   deleteUser(id: $id){
#     id
#     name
#     username
#     email
#   }
# }

{
  "id": "73b8be66-9c1b-431b-8a46-92bb2b3e485d"
}

query getUser($id:ID!){
  getUser(id: $id){
    id
    email
  }
}
{
  "id": "56c1ad6f-f750-4674-95ce-24f01b242138"
}

query getAllUser{
  getAllUser{
    id
    email
    username
  }
}
```

```
mutation CreateTweet($inputTweet: newTweet!){
  createTweet(inputTweet: $inputTweet){
    id
  }
}
```