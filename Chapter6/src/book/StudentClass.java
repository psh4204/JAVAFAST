package book;

public class StudentClass {

	public static void main(String[] args) {
		
		Student Lee = new Student("�̼���");
		Student Park = new Student("�ڸ��");
		
		Lee.readingBook("�ظ�����1");
		Lee.readingBook("�ظ�����2");
		Lee.readingBook("�ظ�����3");
		
		
		Park.readingBook("���缮�Ǳ�1");
		Park.readingBook("���缮�Ǳ�2");
		Park.readingBook("���缮�Ǳ�3");
		Park.readingBook("���缮�Ǳ�4");
		Park.readingBook("���缮�Ǳ�5");
		
		Lee.showStudentInfo();
		Park.showStudentInfo();
		
	}

}
