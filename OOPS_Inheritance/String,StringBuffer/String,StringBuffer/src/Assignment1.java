//Write a Program to check whether a given String is Palindrome or not.

import java.util.Scanner;
public class Assignment1 {

	static boolean isPalindrome(String str)
	{
	
		int n = str.length();
		int i = 0;
		int j = n-1;
		while(i <= j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = scan.nextLine();
		if(isPalindrome(str))
			System.out.println("Given string is Palindrome");
		else
			System.out.println("Given string is not Palindrome");
		

	}

}


/*Output
Enter the string :
abba
Given string is Palindrome

Enter the string :
puja
Given string is not Palindrome




*/
