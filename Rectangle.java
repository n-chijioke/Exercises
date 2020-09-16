public class Rectangle{
	private int length;
	private int width;

	public int calculatePerimeter(){
	int perimeter = length + width;
		return perimeter;
	}
	public int calculateRectangle(){
	int rectangle = 2*length + 2*width; 
		return rectangle;
	}	
	public void setLength(int length){
		this.length = length;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}
	

}