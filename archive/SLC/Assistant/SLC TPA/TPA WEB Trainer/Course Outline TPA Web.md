#### React
- [x] Map
- [x] Ternary Operator
- [x] Component
- [x] Styling
- [ ] Fetching Data From Backend (axios)

#### Backend Golang
Go Basic
- [x] Hello 🌍!
- [x] Variable
- [x] Data Types & Parsing
- [x] Constant
- [x] Operator
- [x] Selection
- [x] Repetition
- [x] Array
- [x] Slicing
- [x] Function
- [x] Pointer
- [x] Multiple Return Function
- [x] Struct
- [x] Struct Function
- [x] Public & Private Naming Convention

Go Backend
- [x] Installation (Gin)
- [x] Directory Structure
- [x] Application Flow (Middleware concept)
- [x] Ping!
- [ ] PostgreSQL Database Integration with GORM


Spoiler: Directory Structure
```
.
├── config                      # all config files is here
    ├── file                    # develop yml config file is here
    └── test_conf               # unit test yml config file is here
├── console                     # console commands dicretory
    └── cmd                     # all console commands is here 
├── constants                   # some static values is here
├── docs                        # any documentation is here swagger,flowchat,gif , 
├── database                    # all database and caching logics
    ├── rediskeys               # redis keys names is here
├── logic                       # business logic layer directories. all server business logics is here
    └── tests                   # we create logics unit test in here
├── model                       # we save project struct/models in here
    └── proto                   # also if we need proto files we save it here
├── repository                  # repository layer directories. all server repository logics is here
    ├── couchbaseQuery          # we save static quere is here
    └── tests                   # we create repository unit test in here.
├── router                      # router layer directories. all server router logics is here 
    ├── grpc                    # a directory for grpc routers
    └── http                    # a directory for http routers
        └── tests               # we create controllers unit test in here.
├── services                    # request and connections to therd party servers is here
├── utils                       # some local utils functions saved in here
├── .gitignore                  # realy this need explain ?!?!?
├── .gitlab-ci.yml              # gitlab ci stages and commands
├── go.mod                      # go modules file
├── go.sum                      # go modules file
├── main.go                     # project started in this file
└── Readme.md                   # you read me here :)
```


![[Pasted image 20240623233923.png]]