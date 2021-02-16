package object;

class Book implements Cloneable{  // 마크인터페이스 _ 이 클래스가 복제가능하다 표시해주는  implements임
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + ","+ title;
	} // toString이 String안에서 가장 먼저 돌아가는 Object임.
	// 클래스보다 빨리 선언되기 때문에.. 아무튼 toString을 Object에서 불러줌으로써 인스터느가 문자열로 나옴.

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {  //가비지 콜랙터에서 쓰는 녀석.  직접불리는게 아니라 클래스 정리될때 자동으로 불림
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
	
}
public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Book book = new Book("토지", "박경맆 ");
		
		String str = new String("토지");
		System.out.println(book);
		System.out.println(str.toString());
		
		Book book2 = (Book)book.clone();// 오브젝트로 리턴되기때문에 (타입)으로 명시적을 걸어줘야함
		System.out.println(book2);
		
	}

}
