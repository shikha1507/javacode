package threadPractice;

public class Increment extends Thread {
	Protection p;
	public Increment(Protection p) {
		this.p=p;
		
	}
	public void run(){
		synchronized (p) {
			for (int i = 0; i < 10; i++) {
				try {
					p.increment();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
	}
}
