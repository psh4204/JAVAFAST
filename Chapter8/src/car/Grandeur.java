package car;

public class Grandeur extends Car {

	private String name = "Grandeur";
	
	@Override
	public void start() {
		System.out.println(name+" : �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		System.out.println(name+" : �޸��ϴ�.");

	}

	@Override
	public void stop() {
		System.out.println(name+" : ����ϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println(name+" : �õ��� ���ϴ�..");
		
	}
	
}
