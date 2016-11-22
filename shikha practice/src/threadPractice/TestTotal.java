package threadPractice;

public class TestTotal extends Thread {
	Total t;
	public TestTotal(Total t) {
		this.t=t;
	}
	public void run(){
		t.m3();
		
		
	}}

	

