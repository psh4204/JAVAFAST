package ifexample;

import java.util.Scanner;

public class ifExample1 {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in); //입력을 도와주는 클래스. (System.in_ 이볅용 스트림)
		
		int grade = scanner.nextInt();
		
		if(90<= grade && grade <= 100){
			System.out.println("A");
		}
		else if(80<= grade && grade <= 89){
			System.out.println("B");
		}
		else if(70 <= grade && grade <= 79){
			System.out.println("C");
		}
		else if(60<= grade && grade <= 69){
			System.out.println("D");
		}
		else if(grade <= 59){
			System.out.println("F");
		}
		*/
		
		int a =10;
		int b =20;
		
		int max;
		
		max = (a>b)?a:b;
		System.out.println(max);
	}

}
