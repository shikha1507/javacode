package threadPractice;

public class Resource {
	int shared;
	boolean mutex= false;
	synchronized public void produce(){
		while(mutex==true){
			try {
				wait();
			} catch (InterruptedException e) {
								e.printStackTrace();
			}
			
		}
		shared++;
		System.out.println("produced:"+shared);
		mutex=true;
		notify();
	}
	synchronized public void consume(){
		while(mutex==false){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("consumed:"+shared);
			mutex=false;
			notify();
			
		}
	}

}
