public class MyWeather{
	private String name;
	private String weather;
	private int temperature;
	
public void setName(String name){
	this.name = name;
}
public void setWeather(String weather){
	this.weather = weather;
}
public void setTemperature(int temperature){
	this.temperature = temperature;
}
public String getName(){
	return name;
}
public String getWeather(){
	return weather;
}
public int getTemperature(){
	return temperature;
}
public void checkTemperature(int temp){
if (temp > 35){
System.out.println("It will be sunny weather");
}else{
System.out.println("It's likely to rain");
}
}

}