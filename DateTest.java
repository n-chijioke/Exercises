public class DateTest{
	public static void main(String... args){
	Date dateobj = new Date();
	Date myDate = new Date();
	myDate = new Date(12, 4, 2015);
	dateobj.setMonth(07);
	dateobj.setDay(03);
	dateobj.setYear(2020);
	dateobj.displayDate();
	myDate.displayDate();
	}



}