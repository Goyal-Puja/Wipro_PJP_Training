package com.automobile;
import com.automobile.fourWheeler.Ford;
import com.automobile.fourWheeler.Logan;

public class TestFourWheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ford ford = new Ford("Ford Ecosport", "MP68MC6060", "Ankit Goyal", 90);
		System.out.println("Ford Details:");
		System.out.println("Model Name : "+ford.getModelName());
		System.out.println("Registration Number : "+ford.getRegistrationNumber());
		System.out.println("Owner Name : "+ford.getOwnerName());
		System.out.println("Speed : "+ford.getSpeed());
		ford.tempControl();
		
		
		System.out.println();
		
		Logan logan = new Logan("Mahindra Logan", "M15FD5103", "Puja Goyal", 100);
		System.out.println("Logan Details:");
		System.out.println("Model Name : "+logan.getModelName());
		System.out.println("Registration Number : "+logan.getRegistrationNumber());
		System.out.println("Owner Name : "+logan.getOwnerName());
		System.out.println("Speed : "+logan.getSpeed());
		logan.gps();
		
		
		

	}

}

/*output
Ford Details:
Model Name : Ford Ecosport
Registration Number : MP68MC6060
Owner Name : Ankit Goyal
Speed : 90
Controlling the air conditioning device.

Logan Details:
Model Name : Mahindra Logan
Registration Number : M15FD5103
Owner Name : Puja Goyal
Speed : 100
Controlling the GPS device

 */
