public class EmployeeTest{
	public  static void main(String[] args){
	Employee employobj = new Employee();
	Employee myEmployobj = new Employee("Mikano", "Tetulla", 5000);
	employobj.setFirstName("Peter");
	employobj.setLastName("Mikel");
	employobj.setMonthlySalary(50000);
	employobj.displayMonthlySalary();
	myEmployobj.displayMonthlySalary();
	}


}