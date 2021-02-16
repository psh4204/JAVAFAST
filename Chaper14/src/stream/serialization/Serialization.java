package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Person implements Externalizable{
	String name;
	transient String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	public String toSting() {
		return name + ", " + job ;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {  //직접 읽고쓰는걸 구현하는것임
		// TODO Auto-generated method stub
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
}

public class Serialization {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personLee = new Person("이순신", "엔지니어");
		Person personSee = new Person("이순순", "순지니어");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personLee);
			oos.writeObject(personSee);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
	}

}
