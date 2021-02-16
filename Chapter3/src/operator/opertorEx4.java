package operator;

public class opertorEx4 {

	public static void main(String[] args) {
		
		int num1 = 0B00001010; //10;
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num1 << 3 );  //이렇게 해서 출력값이 나오지만, 실제 값은 변하지 않는다
		System.out.println(num1 <<= 3); // 실제 값이 변하게 하려면 대입연산자를 써야함 
		
		
	}

}
