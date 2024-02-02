```java
package after;  
  
import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.function.Consumer;  
  
public class EmployeeIterator implements Iterator<Employee> {  
private ArrayList<Employee> employees = new ArrayList<>();  
private int curr;  
  
public EmployeeIterator(ArrayList<Employee> employees) {  
this.curr = 0;  
this.employees = employees;  
}  
  
@Override  
public boolean hasNext() {  
return curr < employees.size();  
}  
  
@Override  
public Employee next() {  
return employees.get(curr++);  
}  
}
```

```java
package after;  
  
import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.Vector;  
  
public class EmployeeDatabase implements Iterable<Employee> {  
  
ArrayList<Employee> employeeList;  
  
public EmployeeDatabase() {  
employeeList = new ArrayList<>();  
  
employeeList.add(new Employee("A", "A1", 20000));  
employeeList.add(new Employee("B", "B1", 70000));  
employeeList.add(new Employee("C", "C1", 900000));  
}  
  
@Override  
public Iterator<Employee> iterator() {  
return new EmployeeIterator(employeeList);  
}  
}
```

```java
package after;  
  
public class Employee {  
private String name;  
private String id;  
private int salary;  
  
public Employee(String name, String id, int salary) {  
super();  
this.name = name;  
this.id = id;  
this.salary = salary;  
}  
  
public String getName() {  
return name;  
}  
  
public void setName(String name) {  
this.name = name;  
}  
  
public String getId() {  
return id;  
}  
  
public void setId(String id) {  
this.id = id;  
}  
  
public int getSalary() {  
return salary;  
}  
  
public void setSalary(int salary) {  
this.salary = salary;  
}  
  
  
@Override  
public String toString() {  
return "Employee{" +  
"name='" + name + '\'' +  
", id='" + id + '\'' +  
", salary=" + salary +  
'}';  
}  
}
```