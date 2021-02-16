package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		
		
		try (FileInputStream fis =new FileInputStream("input.txt")){
			int i;
			while( (i = fis.read()) != -1  ) { // 한바이트씩 읽음. 
				System.out.println((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
		
	}

}
