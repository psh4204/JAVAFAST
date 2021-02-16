package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Tomas");
		sList.add("Tomas");
		
		Stream<String> stream = sList.stream(); // 컬랙션에서 스트림 생성하기.
		
		stream.forEach(s->System.out.println(s)); //하나하나씩 수행.
		
		
		//연산을 위해 사용하는 객체임을 알 수 있음.
		//sList.stream().sorted()args.forEach(s->System.out.println(s));
		
	}

}
