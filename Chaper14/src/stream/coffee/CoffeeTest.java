package stream.coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new KenyaAmericano();
		americano.brweing();
		
		Coffee kenyaLatte = new Latte(new KenyaAmericano());
		kenyaLatte.brweing();
		
		
		// ������ �Ẹ��. ��¥ ������.. ������(������(������())) �̷������� ��.���ڷ������������� IO������ ���� �ϱ����� ����.
	}

}
