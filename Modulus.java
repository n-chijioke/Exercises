import java.util.Scanner;
	public class Modulus{
		public static void main(String... args){	// Main method
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int number = input.nextInt();
		if ((number%2)==0){				// If Statement
		System.out.println("Even");
		
	}
		if ((number%2)==1){				// If statement 
		System.out.println("Odd");
	}
		
		
	}
}