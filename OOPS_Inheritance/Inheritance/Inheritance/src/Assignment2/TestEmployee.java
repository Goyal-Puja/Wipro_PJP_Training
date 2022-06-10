package Assignment2;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee em = new Employee("Puja Goyal", 650000, 2022, "123456");
          System.out.println("Details of Employee");
          System.out.println("Name :" +em.getName());
          System.out.println("Annual Salary :" +em.getAnnualSalary());
          System.out.println("Year of Start :" +em.getYearOfStart());
          System.out.println("National Insurance :"+em.getNationalInsurance());
	}

}

/*Output:
Details of Employee
Name :Puja Goyal
Annual Salary :650000.0
Year of Start :2022
National Insurance :123456

*/