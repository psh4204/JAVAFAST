package lambda;

interface PrintString{
	void showString(String str);// 람다식의 인터페이스엔 추상메서드 1개만 만들수 있음.
}

public class TestLambda {

	public static void main(String[] args) {
		PrintString lambdaStr = s->System.out.println(s);
		lambdaStr.showString("Test");

		showMyString(lambdaStr);
		
		
		PrintString test = returnString();
		test.showString("Test3");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s+"!!!");
	}

}
