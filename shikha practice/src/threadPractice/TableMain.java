package threadPractice;

public class TableMain {

	public static void main(String[] args) {
		Table t=new Table();
		TwoTable t1= new TwoTable(t);
		ThreeTable t2 = new ThreeTable(t);
		FourTable t3= new FourTable(t);
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t2.getState());
		
		
	}

}
