package threadPractice;

public class Consumer extends Thread {
Resource r;
public Consumer(Resource r) {
	this.r= r;
	
}
	public void run(){
		while(true){
			r.consume();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
