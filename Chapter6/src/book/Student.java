package book;

import java.util.ArrayList;

//서브잭트 클래스를 ArrayList와 함께 사용하여 읽은책을 집어넣을 수 있게 한다.

//그리고 확인할 수 있게 한다.

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
		System.out.print(this.name +"이 읽은 책은");
		for(Book book : bArr) {
			System.out.print(", "+ book.getBookName());
		}
		System.out.println(" 입니다. ");
	}
	
	
	
}
