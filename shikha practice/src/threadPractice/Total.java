package threadPractice;

public class Total {
	static int x;
	int y;
	public synchronized void m3(){
		for (int i = 0; i < 10; i++) {
			x++;
	System.out.println("m3:"+x);
		}
//		for (int i = 0; i < 10; i++) {
//			y++;
//			System.out.println(y);
//		}
		
	}
	
	public synchronized static void m7(){
		for (int i = 0; i < 10; i++) {
			x--;
			System.out.println("m7:"+x);
		}
		
		
	}
}
