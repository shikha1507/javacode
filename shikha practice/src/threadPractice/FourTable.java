package threadPractice;

public class FourTable extends Thread {
		Table t;
		public FourTable( Table t) {
			this.t=t;
			
		}
	public void run(){
		t.fourtable();
	}

}
