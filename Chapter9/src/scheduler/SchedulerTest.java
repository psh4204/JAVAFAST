package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("��ȭ���� �Ҵ� ����� �����ϼ���");
		System.out.println("R : �Ѹ� ���ʷ�");
		System.out.println("L :  ���Ⱑ ���� ���� �������");
		System.out.println("P : �켱������ ���� ���켱���õ� ���� ����");

		
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
			System.out.println("���� �ȵ�");
		}
		
		scheduler.getNextCall();
		scheduler.sendCallAgent();
		
	}

}