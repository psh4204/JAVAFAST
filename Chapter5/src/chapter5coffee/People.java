package chapter5coffee;

public class People {

	private String name;
	private int money;
	
	public People() {
		this.name = "��ƹ���";
		this.money = 10000;
	}
	public People(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void giveMoney(int money) {
		this.money -= money;
	}
	public void setMoney(int money) {
		this.money += money;
	}
	public void showPeople() {
		System.out.println("���� " + this.name +"�̰�, ���� "+this.money+"�� �ִ�.");
	}
	
	public void buyCoffee(Coffee cafe,String menu, int num) {
		int buy;
		if(menu == "americano") {
			buy = CoffeeMenu.americano * num;
			this.money -= buy;
			cafe.sellCoffee(buy, num);
		}
		else if(menu == "latte") {
			buy = CoffeeMenu.latte * num;
			this.money -= buy;
			cafe.sellCoffee(buy, num);
		}
		else if(menu == "mistgaru") {
			buy = CoffeeMenu.mistgaru * num;
			this.money -= buy;
			cafe.sellCoffee(buy, num);
		}
		else if(menu == "sihwanChew") {
			buy = CoffeeMenu.sihwanChew * num;
			this.money -= buy;
			cafe.sellCoffee(buy, num);
		}
		else 
		{
			System.out.println("�ٽ� ��Ű����..!");
		}
		System.out.println("����, " +menu +" "+ num+"�� �ֹ��ϼ̳׿�!");
	}
}
