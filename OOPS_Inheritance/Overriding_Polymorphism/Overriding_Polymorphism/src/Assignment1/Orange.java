package Assignment1;

public class Orange extends Fruit {
	Orange(){
		name = "Orange";
		taste = "sweet-tert";
	}
	@Override
	
	void eat()
	{
		System.out.println(name + " is " + taste + " in taste");
	}
}
