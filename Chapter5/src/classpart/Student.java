package classpart;

// public class는 자바에 하나밖에 없어야하고, 클래스 이름과 동일해야함.
public class Student {
	
	public int studentID;
	public String studentName; //자바에서 제공하는 string 클래스.
	public String address;
	
	public Student() {}
	
	
	//오버로딩_  동일한 이름이나 메서드를 여러개 만들어서 사용하는것.
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소없음";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address );
	}
	
}
