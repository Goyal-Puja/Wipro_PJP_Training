/*Write a Program to take care of Number Format Exception if user enters values other than integer for 
calculating average marks of 2 students. 
The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and 
values out of range (i.e. other than in the range of 0-100)
*/
import java.util.Scanner;

class NegativeValuesException extends Exception{
	
	public NegativeValuesException() {
		System.out.println("NegativeValuesException Occurred");
	}
}

class ValuesOutOfRangeException extends Exception {
	
	public ValuesOutOfRangeException() {
		System.out.println("ValuesOutOfRangeException occured");
	}
}



public class Assignment3 {

	public static void main(String[] args) throws NumberFormatException,ValuesOutOfRangeException,NegativeValuesException
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the User Input : ");
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			String name = null;
			int sub1 = 0;
			int sub2 = 0;
			int sub3 = 0;
			try {
				name = scan.nextLine();
				if(scan.hasNextInt())
					sub1 = scan.nextInt();
				else
					throw new NumberFormatException();
				
				if(scan.hasNextInt())
					sub2 = scan.nextInt();
				else
					throw new NumberFormatException();
				
				if(scan.hasNextInt())
					sub3 = scan.nextInt();
				else
					throw new NumberFormatException();
				
				if(sub1 < 0 || sub2 < 0 || sub3 < 0)
					throw new NegativeValuesException();
				
				if(sub1 > 100 || sub2 > 100 || sub3 > 100)
					throw new ValuesOutOfRangeException();
				
				
			}
			catch(NegativeValuesException e) {
				
				System.out.println(e.getMessage());
			}
			
			catch(ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Name : "+name);
			System.out.println("Marks of Subject1 : "+sub1);
			System.out.println("Marks of Subject2 : "+sub2);
			System.out.println("Marks of Subject3 : "+sub3);
		}
		
		

	}

}
/*Output

Enter the User Input : 
Puja Goyal
98
99
92
Name : Puja Goyal
Marks of Subject1 : 98
Marks of Subject2 : 99
Marks of Subject3 : 92

Enter the User Input : 
Puja
1000
20
30
ValuesOutOfRangeException occured
null
Name : Puja
Marks of Subject1 : 1000
Marks of Subject2 : 20
Marks of Subject3 : 30


*/