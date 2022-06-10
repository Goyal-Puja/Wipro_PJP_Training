/*Given a string, return a new string made of 'n' copies of the first 2 chars of the original string 
 where 'n' is the length of the string.
Example1)
i/p:Wipro
o/p:WiWiWiWiWi
*/
import java.util.Scanner;
public class Assignment3 {

	static String RepeatSubstr(String str)
	{
		String repeatstr = str.substring(0,2);
		String resultstr = "";
		int n = str.length();
		for(int i=0;i<n;i++)
		{
			resultstr += repeatstr;
		}
		return resultstr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = scan.nextLine();
		
		System.out.println(RepeatSubstr(str));
	}

}


/*Output
Enter the string:
Wipro
WiWiWiWiWi
*/
