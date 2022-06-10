/*Write a java program that will return the first half of the string, if the length of the string is even.
 It should return null for odd length string.
Example1)
i/p:TomCat
o/p:Tom
Example2)
i/p:Apron
o/p:null
*/

import java.util.Scanner;
public class Assignment4 {
	
	static String firstHalfString(String str)
	{
		int n = str.length();
		if(n%2 == 0)
			return str.substring(0,str.length()/2);
		else
			return "NULL";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = scan.nextLine();
		
		System.out.println(firstHalfString(str));
		
	}

}


/*Output
 Enter the string:
puja
pu

Enter the string:
Apron
NULL

  */
