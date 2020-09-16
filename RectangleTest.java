import java.util.Scanner;
public class RectangleTest{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter length");
	int Length = input.nextInt();
	System.out.println("Enter width");
	int Width = input.nextInt();
	
	Rectangle rectangleobj = new Rectangle();
	rectangleobj.setRectangle();
	System.out.printf("Rectangleobj", calculateRectangle());


}



}