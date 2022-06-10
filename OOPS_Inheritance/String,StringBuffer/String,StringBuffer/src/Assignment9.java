/*Given two strings, a and b, print a new string which is made of the following combination-first 
character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.
Example1)
i/p:Hello,World
o/p:HWeolrllod
*/
import java.util.Scanner;
public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string a :");
		String str1 = scan.nextLine();
		System.out.println("Enter the string b:");
		String str2 = scan.nextLine();
		
		String bigstr = "";
		if(str1.length() > str2.length())
			bigstr = str1;
		else
			bigstr = str2;
		String smallstr = "";
		if(str1.length() < str2.length())
			smallstr = str1;
		else
			smallstr = str2;
		
		String resultstr = "";
		for(int i=0;i<smallstr.length();i++)
		{
			resultstr += str1.charAt(i);
			resultstr += str2.charAt(i);
			
		}
		
		resultstr += bigstr.substring(smallstr.length(),bigstr.length());
		
		System.out.println(resultstr);

	}

}

/*Output
 * 
 * Enter the string a :
Hello
Enter the string b:
World
HWeolrllod

*/
