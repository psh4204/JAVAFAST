package ifexample;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// 다이아몬드 출력
		
		int input, i, j, x;
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.print(" 홀수 값을 입력해주세요 : ");
			input = scanner.nextInt();
			if(input%2 != 0) {
				break;
			}
		}
		
		// 0113 과제 _ 다이아 만들어 보자..!_0113 한생연실습하면서 완료
		
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
