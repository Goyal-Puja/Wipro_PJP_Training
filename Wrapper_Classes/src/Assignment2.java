/*Write a program to receive an integer number as a command line argument, and print the binary, octal and hexadecimal equivalent of the given number.
Sample Output:
java  Test 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
*/
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		
		System.out.println("Given number :"+num);
		System.out.println("Binary Equivalent :"+Integer.toBinaryString(num));
		System.out.println("Octal Equivalent :"+Integer.toOctalString(num));
		System.out.println("HexaDecimal Equivalent :"+Integer.toHexString(num));

	}

}
/*Output
Given number :20
Binary Equivalent :10100
Octal Equivalent :24
HexaDecimal Equivalent :14



*/