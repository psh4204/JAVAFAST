package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("전화상담원 할당 방식을 선택하세요");
		System.out.println("R : 한명씩 차례로");
		System.out.println("L :  데기가 적은 상담원 순서대로");
		System.out.println("P : 우선순위가 높은 고객우선숙련도 높은 상담원");

		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new RoundRobin();
		}
		else {
			System.out.println("구현 안됨");
		}
		
		scheduler.getNextCall();
		scheduler.sendCallAgent();
		
	}

}