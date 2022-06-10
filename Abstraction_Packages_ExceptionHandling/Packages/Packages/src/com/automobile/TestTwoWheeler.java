package com.automobile;

import com.automobile.twoWheeler.Hero;
import com.automobile.twoWheeler.Honda;

public class TestTwoWheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("Hero i-smart 110 2s", "MP65MD5060", "Puja Goyal", 70);
		System.out.println("Hero Details:");
		System.out.println("Model Name : "+hero.getModelName());
		System.out.println("Registration Number : "+hero.getRegistrationNumber());
		System.out.println("Owner Name : "+hero.getOwnerName());
		System.out.println("Speed : "+hero.getSpeed());
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda CB Hornet 160R", "M15FZ5101", "Ankit Goyal", 90);
		System.out.println("Honda Details:");
		System.out.println("Model Name : "+honda.getModelName());
		System.out.println("Model Name : "+honda.getModelName());
		System.out.println("Registration Number : "+honda.getRegistrationNumber());
		System.out.println("Owner Name : "+honda.getOwnerName());
		System.out.println("Speed : "+hero.getSpeed());
		honda.cdplayer();

	}

}


/*Output

Hero Details:
Model Name : Hero i-smart 110 2s
Registration Number : MP65MD5060
Owner Name : Puja Goyal
Speed : 70
Controlling the radio device.

Honda Details:
Model Name : Honda CB Hornet 160R
Model Name : Honda CB Hornet 160R
Registration Number : null
Owner Name : Ankit Goyal
Speed : 70
Controlling the CDPlayer


*/
