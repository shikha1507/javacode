package threadPractice;

public class ThreeTable extends Thread {
	
		Table t;
		public ThreeTable( Table t) {
			this.t=t;
			
		}
	public void run(){
		t.threetable();
	}
	

}
