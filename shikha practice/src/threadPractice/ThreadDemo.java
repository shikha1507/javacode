package threadPractice;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		//System.out.println("main");
		MyThread.mt= Thread.currentThread();
		MyThread t= new MyThread();
		
		//System.out.println(Thread.currentThread().isAlive());
		t.start();
		System.out.println(t);
		System.out.println(t.getState());
		System.out.println(t.isAlive());
		//t.join();
		//System.out.println(Thread.currentThread().getState());
		//System.out.println(Thread.currentThread().isAlive());
		//System.out.println(t.isAlive());
		System.out.println("-----------");
		
	}

}
