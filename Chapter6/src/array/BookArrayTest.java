package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] lib = new Book[5];
		
		lib[0] = new Book("태백산맥1", "조정래");
		lib[1] = new Book("태백산맥2", "조정래");
		lib[2] = new Book("태백산맥3", "조정래");
		lib[3] = new Book("태백산맥4", "조정래");
		lib[4] = new Book("태백산맥5", "조정래");
		for( int i = 0; i < lib.length ; i++){
			System.out.println(lib[i]);
			lib[i].showBookInfo();;
		}
	}

}
