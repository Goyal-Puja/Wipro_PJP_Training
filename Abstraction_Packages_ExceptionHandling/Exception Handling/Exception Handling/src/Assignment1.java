/*Write a program that takes as input the size of the array and the elements in the array. 
 The program then asks the user to enter a particular index and prints the element at that index.
This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. 
In the catch block, print the class name of the exception thrown.
Sample Input and Output 1:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
2
The array element at index 2 = 4
The array element successfully accessed
Sample Input and Output 2:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
6
java.lang.ArrayIndexOutOfBoundsException
*/
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array:");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements in an array:");
	    for(int i=0;i<n;i++)
	    {
	    	arr[i] = scan.nextInt();
	    }
	    System.out.println("Enter the index of the array that we want to access:");
	    int index = scan.nextInt();
	    try
	    {
	    	System.out.println("The array element at index "+ index +" is:"+arr[index]);
	    	System.out.println("The array element successfully accessed");
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println(e);
	    }

	}

}

/*Output
 
Enter the number of elements in an array:
3
Enter the elements in an array:
20
30
50
Enter the index of the array that we want to access:
2
The array element at index 2 is:50
The array element successfully accessed
 
 Enter the number of elements in an array:
2
Enter the elements in an array:
20
30
Enter the index of the array that we want to access:
5
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2
 
 */

