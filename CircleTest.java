import java.util.Scanner;
public class CircleTest{

	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.println(" Enter radius ");
	int radius = input.nextInt();
	Circle circleobj = new Circle();
	circleobj.setRadius ( radius );
	System.out.println ( circleobj, calculatecircum());
}

}