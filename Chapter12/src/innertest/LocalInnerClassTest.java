package innertest;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	
	Runnable getRunnable(final int i) {
		int num = 100;
		
		return new Runnable() {
		
			
			@Override
			public void run() {
				

				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				
			}
		};
		
	}
}

public class LocalInnerClassTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
		
	}

}
