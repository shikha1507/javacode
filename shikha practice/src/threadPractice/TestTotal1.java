package threadPractice;


	public class TestTotal1 extends Thread {
		Total t;
		public TestTotal1(Total t) {
			this.t=t;
		}
		public void run(){
			t.m7();
			
			
		}
	

	}



