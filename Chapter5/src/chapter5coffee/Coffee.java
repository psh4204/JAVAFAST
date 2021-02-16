package chapter5coffee;

public class Coffee{
	
	private String name;
	private int money;
	private int peopleCount;
	
	public Coffee() {
		this.name = "시환카페";
		this.money = 0;
		this.peopleCount = 0;
	}
	public Coffee(String name, int money, int peopleCount) {
		this.name = name;
		this.money = money;
		this.peopleCount = peopleCount;
		
		System.out.println("안녕하세요. "+ this.name + "입니다~^^");
	}
	
	public void getCoffee() {
		System.out.println("안녕하세요. "+ this.name +"입니다~^^\n" +"현재 가게 수익은 " +  this.money + "원 입니다.\n" + "그리고 이용객은 "+ this.peopleCount + "명 입니다.");
	}
	public void setCoffee(int money) {
		this.money = money;
	}
	public void sellCoffee(int money, int cnt) {
		this.money += money;
		this.peopleCount += cnt;
	}
	
	public void showCoffee() {
		System.out.println("현재 "+name+"은 "+money+"원만큼 있으며, "+peopleCount+"명 이용햇습니다.");
	}
	
}
