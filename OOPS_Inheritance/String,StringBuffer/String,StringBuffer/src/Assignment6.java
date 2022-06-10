/*Given 2 strings, a and b, return a new string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).
If input is "hi" and "hello", then output will be "hihellohi".
*/

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String a:");
		String str1 = scan.nextLine();
		System.out.println("Enter the string b:");
		String str2 = scan.nextLine();
		
		String resultstr = "";
		if(str1.length() < str2.length())
			resultstr = str1+str2+str1;
		else
			resultstr = str2+str1+str2;
		
		System.out.println(resultstr);
		

	}

}

/*output
 Enter the String a:
hi
Enter the string b:
hello
hihellohi

Enter the String a:
hello
Enter the string b:
hi
hihellohi

 * */
