package before;

public class Dog extends Animal{
	
	private String race;
	
	
	
	public Dog(String name, int age, String color, String race) {
		super(name, age, color);
		this.race = race;
	}



	public void bark() {
		System.out.println("Bark Bark!");
	}

}
