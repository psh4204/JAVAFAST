package hide;

public class MyDate {

	int day;
	int month;
	int year;
	
	
	public int getDay() {
		return this.day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public void showDate() {
		System.out.println(year + "³â " +month+ "´Þ "+day +"¿ù")
	}
}
