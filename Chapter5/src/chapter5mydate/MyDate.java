package chapter5mydate;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	
	public MyDate() {
		this.year = 2021;
		this.month = 1;
		this.day = 1;
	}
	
	public void getDate() {
		System.out.println(this.year +". "+ this.month +". "+ this.day );
	}
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void isVaild() {
		// ������ 1�� ���� 12���������� 
		if(month < 0 && month >13) {
			System.out.println(year +". "+ month +". "+ day );
			System.out.println("->��ȿ���� ���� ��¥ �Դϴ�.");
		}
		else{
			System.out.println(year +". "+ month +". "+ day );
			// �ϼ��� 1�Ϻ��� 31�ϱ�������. 2���̸� ����(4��% = 0)�̸� 29�� �ƴϸ� 28��
			if(month == 2) {
				if(year%4 == 0) {
					if(day >= 1 && day <=29) {
						System.out.println("->��ȿ�� ��¥ �Դϴ�.");
					}
					else {
						System.out.println("->��ȿ���� ���� ��¥ �Դϴ�.");
					}
				}
				else {
					if(day >= 1 && day <=28) {
						System.out.println("->��ȿ�� ��¥ �Դϴ�.");
					}
					else {
						System.out.println("->��ȿ���� ���� ��¥ �Դϴ�.");
					}
					
				}
			}
			else {
				if(month == 1 || month == 3|| month == 5|| month == 7||month == 8||month == 10||month == 12) {
					if(day >= 1 && day <=31) {
						System.out.println("->��ȿ�� ��¥ �Դϴ�.");
					}
					else {
						System.out.println("->��ȿ���� ���� ��¥ �Դϴ�.");
					}
				}
				else if(month == 2 || month == 4|| month == 6|| month == 9||month == 11) {
					if(day >= 1 && day <=30) {
						System.out.println("->��ȿ�� ��¥ �Դϴ�.");
					}
					else {
						System.out.println("->��ȿ���� ���� ��¥ �Դϴ�.");
					}
				}
				else {
					System.out.println("->��ȿ���� ���� ��¥ �Դϴ�.");
				}
			}
		}
	}
}
