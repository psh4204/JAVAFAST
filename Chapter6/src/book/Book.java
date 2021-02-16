package book;

//서브젝트 클래스
// 책이름 저장


public class Book {
	
	private String bookName;
	
	public Book(String bookName) {
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	

}
