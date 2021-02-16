package array;

public class ArrayCopy {
	
	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {1,2,3,4,5};
		
		System.arraycopy(arr1, 0, arr2, 1, 3); // 소스 어디부터 여기에 어디서부터 소스꺼 몇 개까지 복사할건데 ?
		
		for(int i = 0; i < arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}

}
