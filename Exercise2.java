import java.util.Scanner;                //Scanner Package
	public class Exercise2{                  // The Class
		public static void main(String...args){    // Class Main Method
		Scanner input = new Scanner(System.in);   // To import or collect new object
		System.out.println("Enter name");       // Reuesting the User Name
		String name = input.next();           // To save or Store User Name
		System.out.printf("Good morning %s", name);  // Output Result
	}
}