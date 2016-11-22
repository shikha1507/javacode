package threadPractice;

public class ThreadPriority extends Thread {
	volatile boolean running=true;
	int p=0;
	public void run(){
		while(running){
			++p;
		//System.out.println(Thread.currentThread().getState());
		}
	}

}
