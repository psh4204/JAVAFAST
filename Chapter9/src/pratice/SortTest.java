package pratice;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		
		
		if(ch == 'B' || ch == 'b')
		{
			BubleSort sort = new BubleSort();
			sort.run();
		}
		else if(ch == 'H' || ch == 'h')
		{
			HeapSort sort = new HeapSort();
			sort.run();
		}
		else if(ch == 'Q' || ch == 'q')
		{
			QuickSort sort = new QuickSort();
			sort.run();
		}
		else {
			System.out.println("Please, Press B or H or Q");
		}


	}

}

