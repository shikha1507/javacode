package threadPractice;

public class Producer extends Thread {
	Resource r;
	Producer(Resource r){
		this.r=r;
		
	}
	public void run(){
		while(true){
			r.produce();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
