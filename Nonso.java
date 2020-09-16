import java.util.Scanner;
	//code to multiply two numbers.
	public class Nonso{
		public static void main(String... args){
		Scanner input = new Scanner(System.in); //creating a scanner object
		System.out.println("Enter name");       //prompting a user to input a value.
		String name = input.nextLine();		//saving or storing the value input by the us
		System.out.println("Enter firstNumber");
		int firstNumber = input.nextInt();
		System.out.println("Enter secondNumber");
		int secondNumber = input.nextInt();
		int result = firstNumber * secondNumber;
		System.out.printf("%s, The product of %d  and %d is %d", name, firstNumber, secondNumber, result);

	}

}