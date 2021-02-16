package array;

public class TowDimension {

	public static void main(String[] args) {
		// 다차원 배열. 2차원배열은 자주쓸때가 있음.
		//행을 기준으로 열을 만들면 됨.[행][열]
		
		int[][] arr = {{1,2,3}, {4,5,6}};
		/*
		System.out.println(arr.length); // 행의 갯수 가 나온다 [i][j][k] 이런식으로 for문 돌리기 쉽게하기 위해 그런드.
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		*/
		
		for(int i = 0 ; i< arr.length; i++){
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
