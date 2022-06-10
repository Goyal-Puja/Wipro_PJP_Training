package Assignment1;

public class Apple extends Fruit {
	Apple() {
	    name = "Apple";
	    taste = "sweet and caramelized";
	}
	@Override
	void eat() {
		System.out.println(name + " is "+ taste + " in taste.");
	}
}
