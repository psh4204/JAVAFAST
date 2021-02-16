package array;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // 미리 하나 만들어 둠.(1)
	
	
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); //ArrayList가 Subject형식으로 같이 만들어짐.(1)
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score); // Subject로 과목생성.
		
		subjectList.add(subject);  //ArrayList에 subject클래스 저장(2)
	}
	
	//정리
	// Subject 클래스에 여러 메서드를 저장하기 편함
	// (1)ArrayList를 생성자때 생성_Subject타입으로
	// (2)Subject클래스를 생성하여 과목명,점수를 넣고, ArrayList에 저장 .add 그리고 응용하는 것임.
	
	public void showStudentInfo() {
		int total = 0;
		
		for ( Subject subject  : subjectList) { // 우리가 볼 타입과 변수, 해당 배열
			
			total += subject.getScore();
			System.out.println(studentName + "학생의 "+ subject.getName() + " 과목의 성적은" +  subject.getScore()+ "점 입니다.");
		}
		System.out.println(studentName + "학생의 "+ "총 성적은" +  total + "점 입니다.");
		
	}

}
