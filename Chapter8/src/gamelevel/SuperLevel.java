package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("정말 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("매우 높게 점프합니다..");
		
	}

	@Override
	public void turn() {
		System.out.println("소닉처럼 빙빙 돕니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******* 고-수");
		
	}
}
