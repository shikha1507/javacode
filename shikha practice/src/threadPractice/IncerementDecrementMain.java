package threadPractice;

public class IncerementDecrementMain {

	public static void main(String[] args) {
		Protection p= new Protection();
		Increment i= new Increment(p);
		Decrement d= new Decrement(p);
		i.start();
		d.start();

	}

}
