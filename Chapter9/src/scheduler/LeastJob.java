package scheduler;

public class LeastJob implements Scheduler{
	@Override
	public void getNextCall() {

		System.out.println("������� ���� ���� call�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallAgent() {

		System.out.println("�������õ��� ���� �������� ����˴ϴ�.");

	}
	

}
