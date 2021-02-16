package array;

public class AtoZ {

	public static void main(String[] args) {
		/*
		String[] sArr = new String[] {"A", "B","C","D","E","F","G","H","I","J","K","L","N","M","O","V","Q","R","S","T","U","W","S","Y","Z"};
		for(int i = 0; i <sArr.length ; i++) {
			System.out.println(sArr[i]);
		}
		*/
		
		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < alpahbets.length ; i++) {
			System.out.println(ch);
			alpahbets[i] = ch++;
		}
		
	}

}
