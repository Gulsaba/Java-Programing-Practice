package MultiThreading;

import java.util.Iterator;

class SleepMethodDemo extends Thread{
	@Override
	public void run(){
		Thread ref = Thread.currentThread();
		for(int i =1; i<=5; i++) {
			System.out.println("Child Thread : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
 				e.printStackTrace();
			}
		}
	}
}
public class SleepMethod {
	static public void main(String[] args) {
		SleepMethodDemo sDemo = new SleepMethodDemo();
		sDemo.start();
		
		for(int i =1; i<=5; i++) {
			System.out.println("Main Thread : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
 				e.printStackTrace();
			}
		}
		
	}
}
