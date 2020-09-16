import java.util.Scanner;
	public class StudentTest{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter firstName");
	String firstName = input.next();
	System.out.println("Enter lastName");
	String lastName = input.next();
	System.out.println("Enter level");
	int level = input.nextInt();					
	System.out.println("Enter grade");
	double grade = input.nextDouble();
				
	Student stuobj = new Student();
	stuobj.setFirstName(firstName);
	stuobj.setLastName(lastName);
	stuobj.setLevel(level);
	stuobj.setGrade(grade);
	stuobj.promote();

	
	
}

}