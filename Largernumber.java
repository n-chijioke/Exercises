import java.util. Scanner;
	// A code that will print out larger number
	public class Largernumber{
		public static void main(String... args){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter firstNumber");
			int firstNumber = input.nextInt();
			System.out.println("Enter secondNumber");
			int secondNumber = input.nextInt();
			int largerNumber = 0;			// Creating A Variable And Instantiating
			if (largerNumber > firstNumber){
			largerNumber = firstNumber;	
		}
			if(largerNumber < secondNumber){
			largerNumber = secondNumber;
	 	}
			System.out.printf("The larger number is %d%n", largerNumber);
	}
}