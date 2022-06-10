/*Write a program to copy contents from one file to another and check the output.
Sample Input and Output:
Enter the input file name
Input.txt
Enter the output file name
Output.txt
File is copied.
*/


package Assignment2;

import java.io.*;


public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			String inputFile = "C:\\Users\\dhara goyal\\workspace\\IO_Stream\\src\\Assignment2\\input.txt";
			String outputFile = "C:\\Users\\dhara goyal\\workspace\\IO_Stream\\src\\Assignment2\\output.txt";
			
			fin = new FileInputStream(inputFile);
			fout = new FileOutputStream(outputFile);
			
			int i;
			do {
				i = fin.read();
				fout.write(i);
			}
			while(i != -1);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	   System.out.println("File Copied");
	   br.close();
      
	}
      
}

