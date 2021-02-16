package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // ctrl + shift + o --> 자동으로 import 해줌
		
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
				System.out.println("금메달");
				break;
			case 2: medalColor = 'S';
				System.out.println("은메달");
				break;
			case 3: medalColor = 'B';
				System.out.println("동매달");
				break;
			default : medalColor = 'A';
		}
		
		System.out.println(rank + "등은" + medalColor  + "메달입니다!");
	}

}
