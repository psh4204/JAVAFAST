package operator;

public class opertorEx4 {

	public static void main(String[] args) {
		
		int num1 = 0B00001010; //10;
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num1 << 3 );  //�̷��� �ؼ� ��°��� ��������, ���� ���� ������ �ʴ´�
		System.out.println(num1 <<= 3); // ���� ���� ���ϰ� �Ϸ��� ���Կ����ڸ� ����� 
		
		
	}

}
