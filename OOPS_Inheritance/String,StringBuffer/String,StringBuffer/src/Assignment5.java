/*Write a java program that accepts a string and 
returns a new string without the first and last character of the input string.
Example1)
i/p:Suman
o/p:uma
*/
import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        
        String resultstr = str.substring(1,str.length()-1);
        
        System.out.println(resultstr);
        
		
	}

}

/*output
Enter the String :
Puja
uj
*/