package scheduler;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {

		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallAgent() {

		System.out.println("���� ������ �������� ����մϴ�.");

	}
	

}