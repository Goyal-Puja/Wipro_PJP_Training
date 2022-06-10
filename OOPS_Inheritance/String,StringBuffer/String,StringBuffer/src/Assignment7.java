/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
 otherwise return the string unchanged. 
If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
*/
import java.util.Scanner;
public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = scan.nextLine();
		
		String resultstr = "";
		if(str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')
			resultstr = str.substring(1,str.length()-1);
		else
			resultstr = str;
		
		System.out.println(resultstr);
			

	}

}
/* output
Enter the string :
xhix
hi

Enter the string :
america
america



*/