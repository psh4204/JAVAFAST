package ifexample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		int i, j;
		
		for(i =1 ; i<10 ; i++) {
			if(i%2 != 0) {
				continue;
			}
			for(j =1 ; j <10 ; j++) {
				if(j > i) {
					break;
				}
				System.out.println(i + " °öÇÏ±â " + j + " ´Â " + i*j);	
			}
			System.out.println();
		}
	}

}
