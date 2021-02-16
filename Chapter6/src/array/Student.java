package array;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // �̸� �ϳ� ����� ��.(1)
	
	
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); //ArrayList�� Subject�������� ���� �������.(1)
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score); // Subject�� �������.
		
		subjectList.add(subject);  //ArrayList�� subjectŬ���� ����(2)
	}
	
	//����
	// Subject Ŭ������ ���� �޼��带 �����ϱ� ����
	// (1)ArrayList�� �����ڶ� ����_SubjectŸ������
	// (2)SubjectŬ������ �����Ͽ� �����,������ �ְ�, ArrayList�� ���� .add �׸��� �����ϴ� ����.
	
	public void showStudentInfo() {
		int total = 0;
		
		for ( Subject subject  : subjectList) { // �츮�� �� Ÿ�԰� ����, �ش� �迭
			
			total += subject.getScore();
			System.out.println(studentName + "�л��� "+ subject.getName() + " ������ ������" +  subject.getScore()+ "�� �Դϴ�.");
		}
		System.out.println(studentName + "�л��� "+ "�� ������" +  total + "�� �Դϴ�.");
		
	}

}
