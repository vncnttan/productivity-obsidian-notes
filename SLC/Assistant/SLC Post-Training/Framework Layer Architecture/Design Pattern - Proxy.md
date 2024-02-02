
``` java
package protection.after;  
  
public class DatabaseManagerProxy implements IExecuteable {  
  
DatabaseManager dm = new DatabaseManager();  
Boolean isAdmin = false;  
public DatabaseManagerProxy(User user){  
dm = new DatabaseManager();  
  
if(user.getRole().equals("Admin")){  
isAdmin = true;  
} else {  
isAdmin = false;  
}  
}  
  
@Override  
public void executeQuery(String query) throws Exception {  
if(isAdmin){  
dm.executeQuery(query);  
} else {  
if(query.contains("SELECT")){  
dm.executeQuery(query);  
} else {  
System.out.println("Access denied");  
throw new Exception("Admin only");  
}  
}  
}  
}
```

