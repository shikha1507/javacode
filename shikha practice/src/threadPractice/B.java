package threadPractice;

public class B extends Thread  {
	A a;
	B(A a){
		this.a=a;
	}

	public void run(){
			try {
				a.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	for (int i = 11; i < 21; i++) {
		System.out.println(i);
	

}
	}
}