package ifexample;

import java.util.Scanner;

public class SwitchCaseEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		int day; //스위치 문 사용시 이렇게 값을 초기화 하지 않으면  default를 반드시 써줘야함.
		
		switch(month) {
		case 1 : day =31; 
		break;
		case 2 : day =28; 
		break;
		case 3 : day =31; 
		break;
		case 4 : day =30; 
		break;
		case 5 : day =31; 
		break;
		case 6 : day =30; 
		break;
		case 7 : day =31; 
		break;
		case 8 : day =31; 
		break;
		case 9 : day =30; 
		break;
		case 10 : day =31; 
		break;
		case 11 : day =30; 
		break;
		case 12 : day =31; 
		break;
		default : day = 0;
		}
		
		if(day > 0) {
			System.out.println("입력하신 " + month + "월의 날짜 수는 " + day + "일 입니다.");
		}
		else {
			System.out.println("1~12사이의 값을 입력해야합니다.");
		}
	}

}
