package threadPractice;

public class RunnableThreadP implements Runnable {
	public void run(){
		Thread t=Thread.currentThread();
		System.out.println(t.hashCode());
		for (int i = 0; i < 10; i++) {
			System.out.println("runnable child");
			
		}
	}

}
