``` java
package after;  
  
import javax.xml.crypto.Data;  
  
public class DatabaseManager {  
  
private boolean conf = false;  
private static DatabaseManager dbInstance = null;  
  
public boolean isConf() {  
	return conf;  
}  
  
public static synchronized DatabaseManager getInstance(){  
	if(dbInstance == null){  
		dbInstance = new after.DatabaseManager();  
	}  
return dbInstance;  
}  
  
private DatabaseManager(){  
  // So the constructor function cannot be called by other
}  
  
public void setConf(boolean conf) {  
	this.conf = conf;  
}  
  
}
```
If we used multithreading, the singleton become inconsistent if we didn't:  
1. Synchronized the getInstance functions
``` java
public static synchronized DatabaseManager getInstance() {  
	synchronized (DatabaseManager.class) {  
		if (dbInstance == null) {  
			dbInstance = new after.DatabaseManager();  
		}  
	}  
	return dbInstance;  
}
```
