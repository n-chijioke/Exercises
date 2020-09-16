public class Circle{
	private int radius;
	public double calculatecircumference(){
		double circumference = 2 *3.14 * radius; 
		return circumference;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	public int getRadius(){
		return radius;
	}

}