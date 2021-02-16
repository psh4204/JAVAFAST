package ifexample;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// 연산자와 두 수를 변수로 선언한 후 사칙연산이 수행되는 프로그램을 만들어 보세요.
		
		int i, num1, num2, rtn;
		
		Scanner scanner = new Scanner(System.in);
		
		for( i = 0 ; i < 2 ; i++ ) //i가 0이면 if, 1이면 switch로 구동됨.
		{

			rtn = 0;
			System.out.print("첫 번째 숫자 입력 하세요~ :");
			num1 = scanner.nextInt();
			System.out.print("두 번째 숫자 입력 하세요~ :");
			num2 = scanner.nextInt();
			
			if(num1 == '\0' || num2 == '\0') {
				System.out.println("입력값이 잘못 되었습니다.");
				break;
			}
			
			System.out.print("(처음은 if, 두번째는 switch로 풀어요)사칙연산 골라보세요 ~ \n\t 1. 더하기 \n\t 2. 빼기 \n\t 3. 곱하기 \n\t 4. 나누기\n ::: ");
			rtn = scanner.nextInt();
			
			// if 문
			
			if(i == 0 ) {
				if(rtn == 1) {
					System.out.println("더하기" + (num1+num2));
				}
				else if(rtn == 2) {
					System.out.println("빼기" + (num1-num2));
				}
				else if(rtn ==3) {
					System.out.println("곱하기" + (num1*num2));	
				}
				else if(rtn ==3) {
					System.out.println("나누기" + (num1/num2));
				}
			}
			
			
			// switch 문

			switch (i) {
			case 1 :
				switch(rtn) {
					case 1: 
						System.out.println("더하기" + (num1+num2));
						break;
					case 2: 
						System.out.println("빼기" + (num1-num2));
						break;
					case 3: 
						System.out.println("곱하기" + (num1*num2));
						break;
					case 4: 
						System.out.println("나누기" + (num1/num2));
						break;
				}
				break;
			}
		}
		
	}

}
