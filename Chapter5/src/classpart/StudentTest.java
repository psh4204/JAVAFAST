package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
		
		studentKim.showStudentInfo();
	}

}
