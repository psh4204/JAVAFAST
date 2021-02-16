package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer = new Desktop(); //추상클래스는 인스턴스를 (new)를 줄수 없기때문에, 하위 구현 다됨 메서드로 열 수 있음.
		computer.display();
		computer.turnOff();
		
		
		
	}

}
