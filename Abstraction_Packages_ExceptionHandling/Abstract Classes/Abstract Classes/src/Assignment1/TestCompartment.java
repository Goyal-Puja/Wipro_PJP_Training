/*Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 
public abstract String notice();
Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.
Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]
*/

package Assignment1;

import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Compartment[] compartments = new Compartment[10];
      Random rand = new Random();
      
      for(int i=0;i<10;i++)
      {
    	  int randNum = rand.nextInt(4)+1;
    	  if(randNum == 1)
    		  compartments[i] = new Luggage();
    	  else if(randNum == 2)
    		  compartments[i] = new Ladies();
    	  else if(randNum == 3)
    		  compartments[i] = new General();
    	  else if(randNum == 4)
    		  compartments[i] = new Firstclass();
    	  
    	  System.out.println(compartments[i].notice());
      }
	}

}
/*Output

You are in the Luggage Class Compartment
You are in the General Class Compartment
You are in the General Class Compartment
You are in the Luggage Class Compartment
You are in the Luggage Class Compartment
You are in the Luggage Class Compartment
You are in the General Class Compartment
You are in the Ladies Compartment
You are in the Luggage Class Compartment
You are in the First Class Compartment

 */


*/