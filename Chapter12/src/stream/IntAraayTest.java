package stream;

import java.util.Arrays;

public class IntAraayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sum = Arrays.stream(arr).sum(); //일반 Array에서 스트림 생성하기.
		int count = (int)Arrays.stream(arr).count();  
		
		System.out.println(sum);
		System.out.println(count);
		
	}

}
