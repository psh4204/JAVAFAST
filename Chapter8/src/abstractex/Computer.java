package abstractex;


//�߻�Ŭ������ ����Ŭ������ �����Ҷ� ���� ��

public abstract class Computer {

	public abstract void display();// �����޼��带 ���� �߻�ȭ ��. 
	public abstract void typing();
	
	public void turnOn() { // �� �����ؾ��ϴ� �Ÿ� �̷��� ��.
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
