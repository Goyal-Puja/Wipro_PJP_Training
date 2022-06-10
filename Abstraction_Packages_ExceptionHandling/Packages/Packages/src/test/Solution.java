package test;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foundation foundation = new Foundation();
		//foundation.var1 = 1;            // ---> Not Accessible
		foundation.var2 = 2;             // ----> Accessible
		foundation.var3 = 3;            //  ----> Accessible
		foundation.var4 = 4;           //   ----> Accessible
		
         //System.out.println(foundation.var1);
         System.out.println(foundation.var2);
         System.out.println(foundation.var3);
         System.out.println(foundation.var4);

	}

}

/*output
2
3
4


*/