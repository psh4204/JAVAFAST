package object;


class Student{
	
	int studentNum;
	String studentName;

	public Student(int num, String name){
		this.studentNum = num;
		this.studentName = name;
	}

	@Override
	public boolean equals(Object obj) {//������Ʈ�� �ѿ����� ���ɽ��õǴµ�
		//�ٿ�ĳ���� �ʿ�
		if(obj instanceof Student) { //�ν��Ͻ��� ����(����)�Ǿ��ֳ�
			Student std = (Student)obj;
			if(this.studentNum == std.studentNum)
				return true;
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	} 
	
	
}



public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));  //�������� �³� Ȯ��
		*/
		
		Student Lee = new Student(100, "�̼���");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "�̼���");
		
		
		System.out.println(Lee == Shin);
		System.out.println(Lee.equals(Shin));
		
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i1.hashCode());
		
		
	}

}
