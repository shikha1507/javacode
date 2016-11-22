package threadPractice;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Child1 c1= new Child1();
		Child2 c2= new Child2();
		c1.start();
		c2.start();
		c1.join();
		c2.join();
		System.out.println("main ends");
		
	}

}
