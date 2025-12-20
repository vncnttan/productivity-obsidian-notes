Generic memungkinkan untuk membuat class, interface, dan methods yang bisa dioperasikan mneggunakan beberapa tipe data dan tetap memberikan compile-time safety

### Generic class 
A generic class in Java is a class that can work with different data types. It is defined with one or more type parameters, enclosed in angle brackets (`<>`).
```java
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
```


### Generic Methods
Generic sebagai return data type atau parameter data type
```java
public class Utils {
    public static <T> T doSomething(T value) {
        // Perform some operation
        return value;
    }
}
```



