package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompleteCalc calc = new CompleteCalc();
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.divide(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.substact(n1, n2));
		
		calc.showInfo();
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr); //인터페이스 static 선언시 따로 선언없이 사용가능
		System.out.println(sum);
	}

}
