package chapter5coffee;

public class Coffee{
	
	private String name;
	private int money;
	private int peopleCount;
	
	public Coffee() {
		this.name = "��ȯī��";
		this.money = 0;
		this.peopleCount = 0;
	}
	public Coffee(String name, int money, int peopleCount) {
		this.name = name;
		this.money = money;
		this.peopleCount = peopleCount;
		
		System.out.println("�ȳ��ϼ���. "+ this.name + "�Դϴ�~^^");
	}
	
	public void getCoffee() {
		System.out.println("�ȳ��ϼ���. "+ this.name +"�Դϴ�~^^\n" +"���� ���� ������ " +  this.money + "�� �Դϴ�.\n" + "�׸��� �̿밴�� "+ this.peopleCount + "�� �Դϴ�.");
	}
	public void setCoffee(int money) {
		this.money = money;
	}
	public void sellCoffee(int money, int cnt) {
		this.money += money;
		this.peopleCount += cnt;
	}
	
	public void showCoffee() {
		System.out.println("���� "+name+"�� "+money+"����ŭ ������, "+peopleCount+"�� �̿��޽��ϴ�.");
	}
	
}
