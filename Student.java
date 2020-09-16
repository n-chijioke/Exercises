public class Student{
	private String firstName;
	private String lastName;
	private int level;
	private double grade; 

public void setFirstName(String firstName){
this.firstName = firstName;
}
public void setLastName(String lastName){
this.lastName  = lastName;
}
public void setLevel(int level){
this.level = level;
}
public void setGrade(double grade){
this.grade = grade;
}

public String getFirstName(){
return firstName;
}
public String getLastName(){
return lastName;
}
public int getLevel(){
return level;
}
public double getGrade(){
return grade;
} 

public void promote(){
if(grade>3.5){
System.out.println("you are promoted");
}else{
System.out.println("Repeat class");
}

}


}