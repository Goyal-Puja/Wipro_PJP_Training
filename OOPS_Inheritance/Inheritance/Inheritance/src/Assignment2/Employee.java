package Assignment2;

public class Employee extends Person {
        private String name;
        private double annualSalary;
        private int yearOfStart;
        private String nationalInsurance;
        
        Employee(String name,double annualSalary,int yearOfStart,String nationalInsurance)
        {
        	super(name);
        	this.annualSalary = annualSalary;
        	this.yearOfStart = yearOfStart;
        	this.nationalInsurance = nationalInsurance;
        	
        }
        
        public double getAnnualSalary() {
        	return annualSalary;
        	
        }
        
        public int getYearOfStart() {
        	return yearOfStart;
        	
        }
        public String getNationalInsurance() {
        	return nationalInsurance;
        	
        }
        
        
}
