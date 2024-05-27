``` java
package after;  
  
public class SquareToRoundAdapter extends RoundPeg {  
  
// Adaptee -> What to change  
public SquareToRoundAdapter(SquarePeg sp) {  
this.setDiameter((int) (sp.getSide() * Math.sqrt(2)));  
}  
  
@Override  
public void setDiameter(int diameter) {  
super.setDiameter(diameter);  
}  
}
```


jadinya objectnya kayak
``` java
package after;  
  
public class Demo {  
	public static void main(String[] args) {  
		RoundHole hole = new RoundHole(5);  
		SquarePeg sp = new SquarePeg(5);  
		  
		hole.isFit(new SquareToRoundAdapter(sp));  
	}  
}
```