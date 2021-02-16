package innertest;


class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	
	public OutClass(){
		inClass = new InClass();
	}
	class InClass{
		int num = 100;
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int inNum = 1000;
		static int sInNum = 2000;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println();
		}
		
		static void sTest() {
			
		}
	}
}

public class InnerTest {

	public static void main(String argv[]) {
		OutClass outClass = new OutClass();
	
		outClass.usingInner();
		
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
	}
}
