package threadPractice;

public class RunnableTest {

	public static void main(String[] args) {
		RunnableThreadP r= new RunnableThreadP();
		Thread t= new Thread(r);
		t.start();
		t.setPriority(8);
		System.out.println(t.hashCode());
		
		System.out.println("---------------------");

	}

}
