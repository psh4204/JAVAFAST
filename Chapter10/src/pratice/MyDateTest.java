package pratice;


class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.year;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			if(this.year == date.year) {
				if(this.month == date.month) {
					if(this.day == date.day) {
						return true;
					}
				}
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.year +". "+this.month+". "+this.day;
	}

	
}
public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate date1 = new MyDate(10, 12, 2020);
		MyDate date2 = new MyDate(10, 12, 2020);
		
		System.out.println(date1.equals(date2));
		

	}

}
