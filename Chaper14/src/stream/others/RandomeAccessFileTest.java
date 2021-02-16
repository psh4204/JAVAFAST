package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomeAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("randome.txt", "rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());
		rf.writeDouble(3.14);
		rf.writeUTF("안녕하세요");
		
		rf.seek(0); //파일포인터 원위치
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
	}

}
