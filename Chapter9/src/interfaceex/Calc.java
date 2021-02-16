package interfaceex;

public interface Calc {
	double Pi = 3.14;
	int ERROR = 9999999;

	// 이런일들을 하라고 인터페이스로 선언
	int add(int num1, int num2);
	int substact(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	

	default void description() {
		System.out.println("정수의 계산기를 구현합니다.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) 
		{
			total += i;
		}
		return total;
	}
}
