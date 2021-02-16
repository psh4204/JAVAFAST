package treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2)*(-1);
	}
	
}
public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare()); // 따로 다른방식의 정렬을 하고싶으면 저렇게 위에 함수 만들고 구현 생성자에 넣으면 됨.
		
		treeSet.add("홍");
		treeSet.add("길");
		treeSet.add("동");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
