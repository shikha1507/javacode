package threadPractice;

public class Decrement extends Thread{
	Protection p;
	public Decrement(Protection p) {
		this.p=p;
		
	}
	public void run(){
		synchronized (p) {
			for (int i = 0; i < 10; i++) {
				try {
					p.decrement();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
	}
}



