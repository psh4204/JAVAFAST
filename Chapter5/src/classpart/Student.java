package classpart;

// public class�� �ڹٿ� �ϳ��ۿ� ������ϰ�, Ŭ���� �̸��� �����ؾ���.
public class Student {
	
	public int studentID;
	public String studentName; //�ڹٿ��� �����ϴ� string Ŭ����.
	public String address;
	
	public Student() {}
	
	
	//�����ε�_  ������ �̸��̳� �޼��带 ������ ���� ����ϴ°�.
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּҾ���";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address );
	}
	
}
