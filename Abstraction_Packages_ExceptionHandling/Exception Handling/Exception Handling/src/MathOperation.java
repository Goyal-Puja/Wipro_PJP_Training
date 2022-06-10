/*Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. 
 Loop through the array and obtain the sum and average of all the elements and display the result. 
Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
*/

public class MathOperation {

	public static void main(String[] args) throws ArithmeticException, NumberFormatException {
		// TODO Auto-generated method stub
		
		if(args.length == 5)
		{
			int[] arr = new int[args.length];
			int sum = 0;
			double avg = 0;
			
			try {
				
				for(int i=0;i<args.length;i++)
				{
					arr[i] = Integer.parseInt(args[i]);
				}
				for(int i=0;i<arr.length;i++)
				{
					sum = sum+arr[i];
				}
				avg = sum/arr.length;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Sum of all the elements :"+sum);
			System.out.println("Average of all the elements :"+avg);
		}
		else
		{
			System.out.println("Enter the five integers in command line.");
		}

	}

}

