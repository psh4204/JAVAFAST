package abstractex;

public class Desktop extends Computer {
	// 하나의 추상메서드를 가지고있어도 abstract로 클래스 열어줘야함
	// 여긴 다 구현했으니까 없어도 됨.
	
	public void display() {
		System.out.println("Dispaly Desktop");
	}
	public void typing() {
		System.out.println("Typing Desktop");
	}
}
