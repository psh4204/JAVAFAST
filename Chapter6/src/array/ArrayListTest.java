package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(); // <Type>���� ����� Ÿ���� ������ ��
		
		//Ŭ���� �޼��� = API 
		
		list.add("aaa");
		list.add("baa");
		list.add("caa");
		
		for(int i = 0; i <list.size(); i++) { //length ��� size
			String str = list.get(i);// �������� ��������
			System.out.println(str);
		}
		
		for(String s : list) {
			System.out.println(s);
		}
	}

}
