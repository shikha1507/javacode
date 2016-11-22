package threadPractice;

public class Protection {
	int x;
	public void increment() throws InterruptedException{
		++x;
		Thread.sleep(500);
		System.out.println("incremented value"+x);
	}
	public void decrement() throws InterruptedException{
		--x;
		Thread.sleep(500);
		System.out.println("Decremented value"+x);
	}
}
