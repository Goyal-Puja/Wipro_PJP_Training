/*Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 
Example1)
i/p:Wipro,3
o/p:propropro
*/

import java.util.Scanner;
public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = scan.nextLine();
		System.out.println("enter the integer n: ");
		int n = scan.nextInt();
		
		String repeatstr = str.substring(str.length()-n);
		String resultstr = "";
		for(int i=0;i<n;i++)
		{
			resultstr += repeatstr;
		}
         System.out.println(resultstr);
         
	}

}



/*output
Enter the String :
wipro
enter the integer n: 
3
propropro

Enter the String :
wipro
enter the integer n: 
2
roro
 */
