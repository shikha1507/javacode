package threadPractice;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		Protectionn p= new Protectionn();
		
		
		Incrementt i= new Incrementt(p);
		Decrementt d= new Decrementt(p);
		i.start();
		d.start();
		

	}

}



class Local{
	ThreadLocal tl= new ThreadLocal();
	public void setData(Protectionn p){
		tl.set(p);
	}
}



class Protectionn{
	int x;
	public void increment(){
		++x;
		System.out.println("incremented:"+x);
		
	}
	public void decrement(){
		--x;
		System.out.println("decremented:"+x);
	}
}
class Incrementt extends Thread{
	Protectionn p;
	public Incrementt(Protectionn p) {
		this.p=p;
		
	}
	
	public void run(){
		ThreadLocal tl= new ThreadLocal();
	tl.get();
		for (int i = 0; i < 10; i++) {
			
			p.increment();
			
		}
	}
}



class Decrementt extends Thread{
	Protectionn p;
	public Decrementt(Protectionn p) {
		this.p=p;
		
	}
	ThreadLocal tl= new ThreadLocal();
	
	public void run(){
		tl.set(p);
		for (int i = 0; i < 10; i++) {
			tl.equals(p);
			p.decrement();
			
		}
	}
}