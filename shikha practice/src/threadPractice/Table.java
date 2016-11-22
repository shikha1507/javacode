package threadPractice;

public class Table {
	int mutex=1;
	synchronized public void twotable(){
		
		for (int i = 1; i <=10; i++) {
			while(mutex==2||mutex==3){
				try {
					wait();
				} catch (InterruptedException e){}
			}
			int x=2*i;
			System.out.println("2*"+i+"="+x);
			mutex=2;
			this.notifyAll();
			
		}
	}

	synchronized public void threetable(){
		
			for (int i = 1; i <=10; i++) {
				while(mutex!=2){
					
					try {
						wait();
					} catch (InterruptedException e) {
						
					}}
				int x= 3*i;
				System.out.println("3*"+i+"="+x);
				mutex=3;
				this.notifyAll();
				
			}
		}
		
		
	
	synchronized public void fourtable(){
		
			for (int i = 1; i <=10; i++) {
				while(mutex!=3){
					try {
						wait();
					} catch (InterruptedException e) {
						
					}}
				int x= 4*i;
				System.out.println("4*"+i+"="+x);
				System.out.println("---------------");
				mutex=1;
				notifyAll();
				
			
		}
	}
	
}
