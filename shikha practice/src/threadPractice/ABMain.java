package threadPractice;

public class ABMain {

	public static void main(String[] args) throws InterruptedException {
		A a= new A();
		
		B b= new B(a);
		
	a.start();
	b.start();
	b.join();
	
	for (int i=21;i<31;i++){
		System.out.println(i);
	}
	}

}
