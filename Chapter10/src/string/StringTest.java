package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("abc");
		String str2 = new String("abc"); 

		System.out.println(str1 == str2); //같은 주소가 아님..   equals하면 같음
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); //같은 동네 친구라는 뜻. 상수풀에서 가져옴 equals 하면 같음
	}

}
