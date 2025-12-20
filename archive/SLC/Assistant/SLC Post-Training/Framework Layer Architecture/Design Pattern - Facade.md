To hide complicated things into a function in a class

``` java
package after;  
  
import before.Cashier;  
import before.Chef;  
import before.Delivery;  
import before.Pizza;  
  
public class RestaurantFacade {  
  
	public void orderPizza(String type, String size, String topping, String address){  
	  
		before.Cashier c = new Cashier();  
		c.insertOrder(type, size, topping, address);  
		  
		before.Chef chef = new Chef();  
		Pizza p = chef.preparePizza(type, size, topping);  
		  
		before.Delivery d = new Delivery();  
		d.deliverPizza(p, address);  
		  
	}  
}
```


