/*Write a java program that will concatenate 2 strings and return the result. 
The result should be in lowercase.
Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar
Example2)
i/p:Mark,kate
o/p:markate
*/


import java.util.Scanner;
public class Assignment2 {

	static String appendThemTogether(String str1,String str2)
	{
		String appendStr = "";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.charAt(str1.length()-1) == str2.charAt(0))
		
			appendStr = str1.substring(0,str1.length()-1)+str2;
		
		else
		     appendStr = str1 +" " + str2;
		
		return appendStr;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1 = scan.nextLine();
		System.out.println("ENter the second string:");
		String str2 = scan.nextLine();
		
		System.out.println(appendThemTogether(str1,str2));

	}

}

/*Output
 
 Enter the first string:
Puja
ENter the second string:
Goyal
puja goyal

Enter the first string:
Ma
ENter the second string:
Am
mam


 
 
 */

