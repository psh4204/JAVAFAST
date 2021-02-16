package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>() ;
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		myList.add(1, "D");
		myList.removeLast();
	}
	
}
