package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] lib = new Book[5];
		
		lib[0] = new Book("�¹���1", "������");
		lib[1] = new Book("�¹���2", "������");
		lib[2] = new Book("�¹���3", "������");
		lib[3] = new Book("�¹���4", "������");
		lib[4] = new Book("�¹���5", "������");
		for( int i = 0; i < lib.length ; i++){
			System.out.println(lib[i]);
			lib[i].showBookInfo();;
		}
	}

}
