package com.automobile.twoWheeler;
import com.automobile.Vehicle;

public class Honda extends Vehicle{
	
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
     public Honda(String modelName,String registrationName,String ownerName,int speed) {
    	 
    	 this.modelName = modelName;
    	 this.registrationNumber = registrationNumber;
    	 this.ownerName = ownerName;
    	 this.speed = speed;
    	 
     }
     
     public String getModelName() {
    	 return modelName;
     }
     public String getRegistrationNumber() {
    	 return registrationNumber;
    	 
     }
     public String getOwnerName() {
    	 return ownerName;
    	 
     }
     public int speed() {
    	 return speed;
    	 
     }
     public void cdplayer() {
    	 System.out.println("Controlling the CDPlayer");
     }
}
