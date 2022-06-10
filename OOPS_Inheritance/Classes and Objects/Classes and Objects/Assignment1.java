/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. 
The class should have a method that can return the volume of the box. 
Create an object of the Box class and test the functionalities.
*/


public class Box {
	
	private double width;
	private double height;
	private double depth;
	
	Box(double width,double height,double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
		
	}
	public double getVolume() {
	
		 return width * height * depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b = new Box(20,40,60);
		System.out.println("Volume of the box is : "+b.getVolume());
		

	}

}


/*Output: 
Volume of the box is : 48000.0
*/