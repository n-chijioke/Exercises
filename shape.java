UJT-public class Shape{
 	private int length;
	private int width;
	private double radius;
	private int side;
}
	public Shape(int length, int width){
	this.length=length;
}
	public Shape(double radius){
	this.radius=radius;
}
	public Shape(int side){
	this.side=side;
}
	
	public int getAreaL(){
		int area= length * width;
		return area;
	}
	public double getAreaC(){
		double area= 3.142 * radius*radius;
		return area;
	}
	public int getAreaS(){
		int area= side * side;
		return area;
	}
}