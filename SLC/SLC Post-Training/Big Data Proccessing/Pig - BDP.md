### Pig
```pig
App = LOAD 'Dataset/ApplicationList/app.csv' USING PigStorage(',') AS 
(AppID: int, AppName: charArray, CategoryID: int, Rating: float, AppSize: charArray, AppType: charArray, Price: long, ReleaseDate: charArray, Version: charArray);
```

Upload Dataset to Hue
`hadoop fs -copyFromLocal Dataset`
// See in files

```pig
Category = LOAD 'Dataset/ApplicationList/category.csv' USING PigStorage(',') AS 
(CategoryID: int, CategoryName: charArray);
```


### Group
``` Pig
GroupedApp = GROUP App BY CategoryID;
```

### Count
``` Pig
Result = FOREACH GroupedApp GENERATE group AS CategoryID, COUNT(App.AppID) AS TotalApp;

Result = FOREACH GroupedApp GENERATE (charArray) AppID, AppName;
```

### Generate
Mirip seperti select, bisa juga untuk typecast maupun aggregate
```Pig
Result = FOREACH GroupedApp GENERATE (charArray) AppID, AppName;
```

### Join
```Pig
JoinedTable = JOIN Result BY CategoryID, Category BY CategoryID;

JoinedTable = FOREACH JoinedTable GENERATE Category::CategoryName AS CategoryName, Result::TotalApp AS TotalApp; 
```

### Order By
``` Pig
JoinedTable = ORDER JoinedTable BY TotalApp
```

