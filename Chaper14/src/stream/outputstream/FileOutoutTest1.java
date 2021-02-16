package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutoutTest1 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream ("output.txt")){
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
