package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("b.txt", "java.lang.string");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);	
		}catch(Exception e) {
			//디폴트 익셉션. 익셉션중에서 최상위. 맨마지막에 걸어야함 무조건
			
		}
	}

}
