package Corpation;

public class Student {
	

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1000);
		this.money -= 1000;
	}
	
	public void takeTexi(Texi texi) {
		texi.take(10000);
		this.money -= 10000;
	}
	
	
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ����"+  money + "�� �Դϴ�");
	}
}
