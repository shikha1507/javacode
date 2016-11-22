package threadPractice;

public class PriorityTest {

	public static void main(String[] args) throws InterruptedException {
		ThreadPriority p1=new ThreadPriority();
		ThreadPriority p2=new ThreadPriority();
		ThreadPriority p3=new ThreadPriority();
		p1.setPriority(2);
		p2.setPriority(5);
		p3.setPriority(8);
		Thread.currentThread().setPriority(10);
		p1.start();
		p2.start();
		p3.start();
		try {
			Thread.sleep(10000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.running=false;
		p2.running=false;
		p3.running=false;
		p1.join();
		System.out.println(Thread.currentThread().getState());
		System.out.println(p1.getState());
		p2.join();
		p3.join();
		System.out.println(p1.p);
		System.out.println(p2.p);
		System.out.println(p3.p);

	}

}
