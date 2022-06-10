/*Write a Java program that accepts a string (with * in it). The program should return a new string 
in which the following characters are removed-*, the characters that are to the left and right of *
Example1)
i/p:ab*cd
o/p:ad
*/
import java.util.Scanner;
public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the string :");
           String str = scan.nextLine();
           int pos = str.indexOf("*");
           StringBuffer newstr = new StringBuffer(str);
           newstr.delete(pos-1,pos+2);
           
           System.out.println(newstr);
           
           
	}

}

/* Output
 Enter the string :
ab*cd
ad
*/