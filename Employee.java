public class Employee{
	private String firstName;
	private String lastName;
	private int monthlySalary;
 
	public Employee(){}
	public Employee(String firstName, String lastName, int monthlySalary ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setMonthlySalary(int monthlySalary){
		this.monthlySalary = monthlySalary;
	}
	public void displayMonthlySalary(){
		System.out.printf(firstName + '\n' + lastName + '\n' + monthlySalary + '\n');		
	}




}