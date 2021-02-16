package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(); // <Type>에는 사용할 타입을 적으면 됨
		
		//클래스 메서드 = API 
		
		list.add("aaa");
		list.add("baa");
		list.add("caa");
		
		for(int i = 0; i <list.size(); i++) { //length 대시 size
			String str = list.get(i);// 꺼내오기 꺼내오기
			System.out.println(str);
		}
		
		for(String s : list) {
			System.out.println(s);
		}
	}

}
