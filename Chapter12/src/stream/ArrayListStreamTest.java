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
		
		Stream<String> stream = sList.stream(); // �÷��ǿ��� ��Ʈ�� �����ϱ�.
		
		stream.forEach(s->System.out.println(s)); //�ϳ��ϳ��� ����.
		
		
		//������ ���� ����ϴ� ��ü���� �� �� ����.
		//sList.stream().sorted()args.forEach(s->System.out.println(s));
		
	}

}
