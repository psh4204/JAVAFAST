package abstractex;


//추상클래스는 상위클래스를 구현할때 많이 씀

public abstract class Computer {

	public abstract void display();// 하위메서드를 위해 추상화 함. 
	public abstract void typing();
	
	public void turnOn() { // 꼭 구현해야하는 거만 이렇게 함.
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
