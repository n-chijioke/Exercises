import java.util.Scanner;
public class Exercise3{
	Public static void main(String...args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name");
		String name = input.nextLIne();
		System.out.println("Enter firstNumber");
		int firstNumber = input.nextInt();
		System.out.println("Enter secondNumber");
		int secondNumber = input.nextInt();
		int result = firstNumber + secondNumber;
		System.out.printf("%s,The sum of %d and %d is %d %n", name, firstNumber, secondnumber);
	}
		
}