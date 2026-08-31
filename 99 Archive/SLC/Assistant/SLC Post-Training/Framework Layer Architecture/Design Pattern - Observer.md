```java

package main;  
  
public interface ISubject {  
  
public void addSubscriber(IObserver observer);  
public void removeSubscriber(IObserver observer);  
  
public void notifySubscriber(int oldStock, int newStock);  
}



package main;  
  
import java.util.ArrayList;  
  
public class Store implements ISubject{  
private int stock;  
  
public int getStock() {  
return stock;  
}  
  
public void setStock(int stock) {  
this.notifySubscriber(this.stock, stock);  
this.stock = stock;  
}  
  
public Store(int stock) {  
this.stock = stock;  
}  
  
ArrayList<IObserver> subscriber = new ArrayList<>();  
  
@Override  
public void addSubscriber(IObserver observer) {  
subscriber.add(observer);  
}  
  
@Override  
public void removeSubscriber(IObserver observer) {  
subscriber.remove(observer);  
}  
  
@Override  
public void notifySubscriber(int oldStock, int newStock) {  
for (IObserver s: subscriber) {  
s.getNotification(oldStock, newStock);  
}  
}  
}
```


```java
package main;  
  
public interface IObserver {  
  
public void getNotification(int oldStock, int newStock);  
}


package main;  
  
public class User implements IObserver {  
String name;  
  
public User(String name ) {  
super();  
this.name = name;  
}  
  
public String getName() {  
return name;  
}  
  
public void setName(String name) {  
this.name = name;  
}  
  
@Override  
public void getNotification(int oldStock, int newStock) {  
System.out.println("User " + name + " have been notified for stock update");  
System.out.println("Old Stock: " + oldStock);  
System.out.println("New Stock: " + newStock);  
}  
}
```