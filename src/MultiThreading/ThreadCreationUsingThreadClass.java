package MultiThreading;

class Demo extends Thread{
	public void run() {
		System.out.println("Child thread has been created for sing task by extending Thread class");
	}
}
public class ThreadCreationUsingThreadClass {
	public static void main(String[] args) {
		Demo dm = new Demo();
		
		//Thread start
		dm.start();

	}

}
