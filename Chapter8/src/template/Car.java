package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}
	
	//final은 하위클래스에서 재정의 불가능하게 만들어줌.
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
}
