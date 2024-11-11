package MultiThreading;

public class ThreadCreationUsingRunnableClass implements Runnable{
	@Override
	public void run() { 
		System.out.println("Single thread for single task");
	}
	public static void main(String[] args) {
		ThreadCreationUsingRunnableClass obj = new ThreadCreationUsingRunnableClass();
		
		//Get object of Thread class to get start() method
		Thread thread = new Thread(obj);
		thread.start();

	}


}
