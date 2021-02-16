package chapter5mydate;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	
	public MyDate() {
		this.year = 2021;
		this.month = 1;
		this.day = 1;
	}
	
	public void getDate() {
		System.out.println(this.year +". "+ this.month +". "+ this.day );
	}
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void isVaild() {
		// 월수가 1월 부터 12월까지인지 
		if(month < 0 && month >13) {
			System.out.println(year +". "+ month +". "+ day );
			System.out.println("->유효하지 않은 날짜 입니다.");
		}
		else{
			System.out.println(year +". "+ month +". "+ day );
			// 일수가 1일부터 31일까지인지. 2월이면 윤년(4년% = 0)이면 29일 아니면 28일
			if(month == 2) {
				if(year%4 == 0) {
					if(day >= 1 && day <=29) {
						System.out.println("->유효한 날짜 입니다.");
					}
					else {
						System.out.println("->유효하지 않은 날짜 입니다.");
					}
				}
				else {
					if(day >= 1 && day <=28) {
						System.out.println("->유효한 날짜 입니다.");
					}
					else {
						System.out.println("->유효하지 않은 날짜 입니다.");
					}
					
				}
			}
			else {
				if(month == 1 || month == 3|| month == 5|| month == 7||month == 8||month == 10||month == 12) {
					if(day >= 1 && day <=31) {
						System.out.println("->유효한 날짜 입니다.");
					}
					else {
						System.out.println("->유효하지 않은 날짜 입니다.");
					}
				}
				else if(month == 2 || month == 4|| month == 6|| month == 9||month == 11) {
					if(day >= 1 && day <=30) {
						System.out.println("->유효한 날짜 입니다.");
					}
					else {
						System.out.println("->유효하지 않은 날짜 입니다.");
					}
				}
				else {
					System.out.println("->유효하지 않은 날짜 입니다.");
				}
			}
		}
	}
}
