package ifexample;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// ���̾Ƹ�� ���
		
		int input, i, j, x;
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.print(" Ȧ�� ���� �Է����ּ��� : ");
			input = scanner.nextInt();
			if(input%2 != 0) {
				break;
			}
		}
		
		// 0113 ���� _ ���̾� ����� ����..!_0113 �ѻ����ǽ��ϸ鼭 �Ϸ�
		
		for(i = 1 ; i < input+1 ; i+=2) {
			for(x=0; x < input-(i/2) ; x++) {
				System.out.print(" ");
			}
			x = 0;
			do {
				System.out.print("*");
				x++;
			}while(x < i);
			System.out.println();
		}
		for(i = input-2 ; i >0 ; i-=2) {
			for(x=0; x < input-(i/2) ; x++) {
				System.out.print(" ");
			}
			x = 0;
			do {
				System.out.print("*");
				x++;
			}while(x < i);
			
			System.out.println();	
		}
		
		
	}

}
