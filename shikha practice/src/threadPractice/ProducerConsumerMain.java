package threadPractice;

public class ProducerConsumerMain {

	public static void main(String[] args) throws InterruptedException {
		Resource r= new Resource();
		Producer p= new Producer(r);
		Consumer c= new Consumer(r);
		c.start();
		p.start();
		System.out.println("main over");
		
	}

}
