package ifexample;

import java.util.Scanner;

public class ForExampleEx1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int num = 0;

		do {
			sum += num = scanner.nextInt();	
		}while(num != 0); 
		
		System.out.println(sum);
		
		
	}

}
