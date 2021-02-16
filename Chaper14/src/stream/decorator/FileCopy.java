package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		long milliseconds = 0;
		
		try(FileInputStream fis = new FileInputStream ("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			milliseconds = System.currentTimeMillis(); //밀리세컨드로 시간제는 녀석
			
			int i;
			while((i = fis.read())!= -1) {
				fos.write(i);
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		Socket socket = new Socket();
		
		BufferedReader isr = new BufferedReader( new InputStreamReader (socket.getInputStream()));
		isr.readLine();
		
		System.out.println("시간" + milliseconds );

	}

}
