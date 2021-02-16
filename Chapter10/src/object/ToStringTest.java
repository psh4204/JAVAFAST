package object;

class Book implements Cloneable{  // ��ũ�������̽� _ �� Ŭ������ ���������ϴ� ǥ�����ִ�  implements��
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + ","+ title;
	} // toString�� String�ȿ��� ���� ���� ���ư��� Object��.
	// Ŭ�������� ���� ����Ǳ� ������.. �ƹ�ư toString�� Object���� �ҷ������ν� �ν��ʹ��� ���ڿ��� ����.

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {  //������ �ݷ��Ϳ��� ���� �༮.  �����Ҹ��°� �ƴ϶� Ŭ���� �����ɶ� �ڵ����� �Ҹ�
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
	
}
public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Book book = new Book("����", "�ڰ搠 ");
		
		String str = new String("����");
		System.out.println(book);
		System.out.println(str.toString());
		
		Book book2 = (Book)book.clone();// ������Ʈ�� ���ϵǱ⶧���� (Ÿ��)���� ������� �ɾ������
		System.out.println(book2);
		
	}

}
