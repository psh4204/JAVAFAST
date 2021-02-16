package reference;

public class Student {

	int studentId;
	String studentName;
	
	int koreaScore;
	int mathScore;
	int engScore;
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.engName = name;
		korea.score = score;
		
	}
	
	public void setMathSubject(String name, int score) {
		math.engName = name;
		math.score = score;
	}
	
}
