package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] lib = new Book[5];
		Book[] copyLibarary = new Book[5];
		
		lib[0] = new Book("�¹���1", "������");
		lib[1] = new Book("�¹���2", "������");
		lib[2] = new Book("�¹���3", "������");
		lib[3] = new Book("�¹���4", "������");
		lib[4] = new Book("�¹���5", "������");
		
		
		
		for( int i = 0; i < lib.length ; i++){
			System.out.println(lib[i]);
			lib[i].showBookInfo();;
		}
		
		System.arraycopy(lib, 0, copyLibarary, 0 , 5);// ������, ����������(�ּҸ� ����) .. �Ʒ��Ͱ��� ������ ��..
		//��������� �ϳ��ϳ� ������ �� ��������� ��. ���� ��¥�� �Ű����°���.
		
		for(Book book: copyLibarary) { //����  for�� . (Ÿ��, �ش� �迭) -> �ش�迭ũ�⸸ŭ ��.
			book.showBookInfo();
		}
		
		lib[0].setTitle("����"); //��������_ �ּҸ� ����
		lib[0].setAuthor("�ڿϼ�");
		
		for(Book book: copyLibarary) {
			book.showBookInfo();
		}
	}

}
