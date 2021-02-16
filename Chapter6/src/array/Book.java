package array;

public class Book {
	
	private String title;
	private String author;
	
	
	//Alt + Shft + S -> Source 창 열어서 Getter Setter 만들기 
	public Book() {
		
	}
	
	public Book(String title, String atuhor) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println( title +", "+author);
	}
	
	
}
