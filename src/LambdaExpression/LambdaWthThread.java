package LambdaExpression;

public class LambdaWthThread {

	public static void main(String[] args) {
		Runnable t1 = () -> System.out.println("Thread one is created");
		t1.run();
		
		Runnable thread2 = () ->{
			for(int i=0; i<5; i++) {
				System.out.println("Thread"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		  Thread t2=new Thread(thread2);
		  t2.start();
		  
	}

}
