Pake file json

### Nampilin semua database
`show dbs;`

### Create atau use restaurant
`use restaurant;`

### Create / insert collection
```
# db.[nama coll].insert({[Key]: [Value]})

db.product.insert({"Name": "Fried Chicken", "Price": 20000, "Type": "Food"})
db.product.insert({"Name": "French Fries", "Price": 16000, "Type": "Food"})
db.product.insert({"Name": "Lemon Tea", "Price": 8000, "Type": "Beverage"})
```

###  View Collection
```
# db.[nama collection].find()

db.product.find()

db.product.find({"Name": "Lemon Tea"})
db.product.find({"Price": {$gte: 10000 } })

$gt -> greater than
$lt -> less than
$eq -> equal
$lte -> less than equal
$nq -> not equal
```

### Update Data
```
db.product.update(
{"Name": "Lemon Tea"}, 
	{$set: {"Price": 12500}
})
```

### Remove Data
```
db.product.remove()
```


### Exporting Collection to JSON (diluar mongo)
```
sudo mongoexport --db=restaurant --collection=product --out=product.json
```

### Import collection JSON to manga (di dalam mongo)
```
sudo mongoexport --db=restaurant --collection=staff --out=staff.json
```
