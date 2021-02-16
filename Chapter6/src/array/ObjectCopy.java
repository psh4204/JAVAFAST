package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] lib = new Book[5];
		Book[] copyLibarary = new Book[5];
		
		lib[0] = new Book("태백산맥1", "조정래");
		lib[1] = new Book("태백산맥2", "조정래");
		lib[2] = new Book("태백산맥3", "조정래");
		lib[3] = new Book("태백산맥4", "조정래");
		lib[4] = new Book("태백산맥5", "조정래");
		
		
		
		for( int i = 0; i < lib.length ; i++){
			System.out.println(lib[i]);
			lib[i].showBookInfo();;
		}
		
		System.arraycopy(lib, 0, copyLibarary, 0 , 5);// 쉽지만, 얕은복사임(주소만 복사) .. 아래와같은 영향이 남..
		//깊은복사는 하나하나 일일이 다 복사해줘야 됨. 값이 진짜로 옮겨지는것임.
		
		for(Book book: copyLibarary) { //향상된  for문 . (타입, 해당 배열) -> 해당배열크기만큼 돎.
			book.showBookInfo();
		}
		
		lib[0].setTitle("나목"); //얕은복사_ 주소만 복사
		lib[0].setAuthor("박완서");
		
		for(Book book: copyLibarary) {
			book.showBookInfo();
		}
	}

}
