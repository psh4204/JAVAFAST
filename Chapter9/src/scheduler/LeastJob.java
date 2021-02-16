package scheduler;

public class LeastJob implements Scheduler{
	@Override
	public void getNextCall() {

		System.out.println("고객등급이 높은 고객의 call을 먼저 가져옵니다.");
	}

	@Override
	public void sendCallAgent() {

		System.out.println("업무숙련도가 높은 상담원에게 연결됩니다.");

	}
	

}
