scp -r Dataset cloudera@192.168.153.134:/home/cloudera/Desktop

### Pig
```pig
App = LOAD 'Dataset/ApplicationList/app.csv' USING PigStorage(',') AS 
(AppID: int, AppName: charArray, CategoryID: int, Rating: float, AppSize: charArray, AppType: charArray, Price: long, ReleaseDate: charArray, Version: charArray);
```


```pig
Category = LOAD 'Dataset/ApplicationList/category.csv' USING PigStorage(',') AS 
(CategoryID: int, CategoryName: charArray);
```


### Filter
``` Pig
Result = FILTER App BY AppName == 'asdfs';
```

### Group
``` Pig
GroupedApp = GROUP App BY CategoryID;
```

### Count
``` Pig
Result = FOREACH GroupedApp GENERATE group AS CategoryID, COUNT(App.AppID) AS TotalApp;
```

### Generate
Mirip seperti select, bisa juga untuk typecast maupun aggregate
```Pig
Result = FOREACH GroupedApp GENERATE (charArray) AppID, AppName;
```


### Select
``` Pig
Result = FOREACH GroupedApp GENERATE (charArray) AppID, AppName;
```

### Join
```Pig
JoinedTable = JOIN Result BY CategoryID, Category BY CategoryID;

JoinedTable = FOREACH JoinedTable GENERATE Category::CategoryName AS CategoryName, Result::TotalApp AS TotalApp; 
```

### Order
``` Pig
JoinedTable = ORDER JoinedTable BY TotalApp
```

