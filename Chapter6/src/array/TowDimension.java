package array;

public class TowDimension {

	public static void main(String[] args) {
		// ������ �迭. 2�����迭�� ���־����� ����.
		//���� �������� ���� ����� ��.[��][��]
		
		int[][] arr = {{1,2,3}, {4,5,6}};
		/*
		System.out.println(arr.length); // ���� ���� �� ���´� [i][j][k] �̷������� for�� ������ �����ϱ� ���� �׷���.
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
