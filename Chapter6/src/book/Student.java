package book;

import java.util.ArrayList;

//������Ʈ Ŭ������ ArrayList�� �Բ� ����Ͽ� ����å�� ������� �� �ְ� �Ѵ�.

//�׸��� Ȯ���� �� �ְ� �Ѵ�.

public class Student {

	private String name;
	private ArrayList<Book> bArr;
	
	public Student(String name) {
		this.name = name;
		
		bArr = new ArrayList<Book>();
	}
	
	public void readingBook(String bookName) {
		Book book = new Book(bookName);
		
		bArr.add(book);
	}
	
	public void showStudentInfo() {
		System.out.print(this.name +"�� ���� å��");
		for(Book book : bArr) {
			System.out.print(", "+ book.getBookName());
		}
		System.out.println(" �Դϴ�. ");
	}
	
	
	
}
