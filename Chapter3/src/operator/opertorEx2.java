package operator;

public class opertorEx2 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) > 10) && ((i = i +2)<10); 
		// &&일땐 두개비교 시 앞에꺼 에서 false가 나오면 뒤에꺼 보지도않고 넘김
		// ||는 뒤에꺼까지 다 봄 
		
		
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println(value);
		
		int num2 = 10;
		
		int num3 = 20;
		
		int max = (num2 > num3)? num2 : num3;
		
		System.out.println(max);
		
	}

}
