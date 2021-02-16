package array;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int total = 0;
		for(int i = 0, num =1 ; i <arr.length ; i++) {
			arr[i] = num+i;
			
		}
		for(int i = 0; i <arr.length; i++) {
			total += arr[i];
			System.out.println(arr[i]);
			System.out.println(total);
			
		}
		
		
		double[] dArr = new double[5];
		int cnt;
		dArr[0] = 1.1; cnt++;
		dArr[1] = 2.1; cnt++;
		dArr[2] = 3.1; cnt++;
	}

}
