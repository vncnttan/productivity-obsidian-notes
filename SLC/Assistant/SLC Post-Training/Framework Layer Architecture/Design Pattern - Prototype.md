Problem
``` java
package after;  
  
public class Demo {  
	public static void main(String[] args){  
		Dog dog = new Dog("Michael", 3, "Black", "Mutt");  
		Dog dog1 = dog;  
		dog1.setRace("Labrador");  
		  
		System.out.println(dog1.getRace());  
		System.out.println(dog.getRace());  
	}  
}
```

This will results in
```
>> Labrador
>> Labrador
```

Even though we want to try to see the dog with another race. We need to "clone" the dog

```java

@Override  
public Clone createClone() {  
	Dog dog = null;  
	try {  
		dog = (Dog) this.clone();  
	} catch (CloneNotSupportedException e) {  
		e.printStackTrace();  
	}  
	  
	return dog;  
}
```

``` java

package after;  
  
public class Demo {  
	public static void main(String[] args){  
		Dog dog = new Dog("Michael", 3, "Black", "Mutt");  
		Dog dog1 = (Dog) dog.createClone();  
		dog1.setRace("Labrador");  
		  
		System.out.println(dog1.getRace());  
		System.out.println(dog.getRace());  
	}  
}
```