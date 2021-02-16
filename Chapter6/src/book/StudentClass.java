package book;

public class StudentClass {

	public static void main(String[] args) {
		
		Student Lee = new Student("이순신");
		Student Park = new Student("박명수");
		
		Lee.readingBook("해리포터1");
		Lee.readingBook("해리포터2");
		Lee.readingBook("해리포터3");
		
		
		Park.readingBook("유재석되기1");
		Park.readingBook("유재석되기2");
		Park.readingBook("유재석되기3");
		Park.readingBook("유재석되기4");
		Park.readingBook("유재석되기5");
		
		Lee.showStudentInfo();
		Park.showStudentInfo();
		
	}

}
