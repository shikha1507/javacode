package threadPractice;

public class A extends Thread {
	
	

	public void run(){
		
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			
		}
	}

}
