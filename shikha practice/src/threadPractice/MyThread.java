package threadPractice;

public class MyThread extends Thread {
	public static Thread mt;
public void run(){
	try {
		mt.join();
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	for (int i = 0; i < 20; i++) {
		System.out.println("shikha");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
}
