package threadPractice;

public class TotalMain {

	public static void main(String[] args) {
		Total t= new Total();
		TestTotal t1= new TestTotal(t);
		TestTotal1 t2= new TestTotal1(t);
		t1.start();
		t2.start();
	}

}
