``` java
package after;  
  
public class PizzaBuilder {  
private final Pizza pizza = new Pizza("", null, null, false);  
  
public PizzaBuilder(String shape) {  
// For example the shape is required  
	this.pizza.setShape(shape);  
}  
  
public PizzaBuilder addTopping(String topping){  
	this.pizza.setTopping(topping);  
	return this;  
}  
  
public PizzaBuilder addCrust(String crust){  
	this.pizza.setCrust(crust);  
	return this;  
}  
  
public PizzaBuilder addExtraCheese(){  
	this.pizza.setExtraCheese(true);  
	return this;  
}  
  
public Pizza build(){  
	return pizza;  
}  
  
  
}
```