package classex;

import java.lang.reflect.Constructor;

import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		Class c3 = Class.forName("java.lang.String");
		
		Constructor[] cons = c3.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		Method[] methods = c3.getMethods();
	}

}
