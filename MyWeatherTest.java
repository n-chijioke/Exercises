import java.util.Scanner;
public class MyWeatherTest{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter name");
	String name = input.nextLine();
	System.out.println("Enter temperature");
	int temp = input.nextInt();

	MyWeather tempobj = new MyWeather();
	tempobj.setName(name);
	tempobj.setTemperature(temp);
	System.out.println("Hi "  +  tempobj.getName() + " the weather temperature is " + tempobj.getTemperature());

	tempobj.checkTemperature(temp);
}

}