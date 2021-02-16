package thread;

import java.io.IOException;

public class TerminatedTest extends Thread{
	private boolean flag = false;
	int i;
	
	
	public TerminatedTest(String name) {
		super(name);
	}
	
	public void run() {
		while(!flag) {
			try{
				
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "end");
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public static void main(String[] args) throws IOException {

		TerminatedTest threadA = new TerminatedTest("A");
		TerminatedTest threadB = new TerminatedTest("B");
		
		
		threadA.start();
		threadB.start();
		
		int in;
		while(true) {
			in = System.in.read();
			if(in == 'A') {
				threadA.setFlag(true);
			}
			else if(in == 'B') {
				threadB.setFlag(true);
			}
			else if(in == 'M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				
			}
			else {
				System.out.println("try again");
			}
		}
		
	}

}
