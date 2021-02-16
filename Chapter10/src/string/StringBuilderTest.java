package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java); //빌더 버퍼 생성
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append("android");
		System.out.println(System.identityHashCode(buffer));
		
		
		java = buffer.toString();
		
		System.out.println(java);
		
		//위에방식으로 스트링처리 정말많이씀..!
	}

}
