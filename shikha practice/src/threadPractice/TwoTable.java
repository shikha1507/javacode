package threadPractice;

public class TwoTable extends Thread {
	Table t;
	public TwoTable( Table t) {
		this.t=t;
		
	}
public void run(){
	t.twotable();
}
}
