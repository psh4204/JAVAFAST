package ifexample;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// �����ڿ� �� ���� ������ ������ �� ��Ģ������ ����Ǵ� ���α׷��� ����� ������.
		
		int i, num1, num2, rtn;
		
		Scanner scanner = new Scanner(System.in);
		
		for( i = 0 ; i < 2 ; i++ ) //i�� 0�̸� if, 1�̸� switch�� ������.
		{

			rtn = 0;
			System.out.print("ù ��° ���� �Է� �ϼ���~ :");
			num1 = scanner.nextInt();
			System.out.print("�� ��° ���� �Է� �ϼ���~ :");
			num2 = scanner.nextInt();
			
			if(num1 == '\0' || num2 == '\0') {
				System.out.println("�Է°��� �߸� �Ǿ����ϴ�.");
				break;
			}
			
			System.out.print("(ó���� if, �ι�°�� switch�� Ǯ���)��Ģ���� ��󺸼��� ~ \n\t 1. ���ϱ� \n\t 2. ���� \n\t 3. ���ϱ� \n\t 4. ������\n ::: ");
			rtn = scanner.nextInt();
			
			// if ��
			
			if(i == 0 ) {
				if(rtn == 1) {
					System.out.println("���ϱ�" + (num1+num2));
				}
				else if(rtn == 2) {
					System.out.println("����" + (num1-num2));
				}
				else if(rtn ==3) {
					System.out.println("���ϱ�" + (num1*num2));	
				}
				else if(rtn ==3) {
					System.out.println("������" + (num1/num2));
				}
			}
			
			
			// switch ��

			switch (i) {
			case 1 :
				switch(rtn) {
					case 1: 
						System.out.println("���ϱ�" + (num1+num2));
						break;
					case 2: 
						System.out.println("����" + (num1-num2));
						break;
					case 3: 
						System.out.println("���ϱ�" + (num1*num2));
						break;
					case 4: 
						System.out.println("������" + (num1/num2));
						break;
				}
				break;
			}
		}
		
	}

}
