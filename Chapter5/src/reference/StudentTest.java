package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee") ;
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 100);

		Student studenKim = new Student(100, "Kim") ;
		studentLee.setMathSubject("수학", 100);
		studentLee.setMathSubject("수학", 100);
		
	}

}
