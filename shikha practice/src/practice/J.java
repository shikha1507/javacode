package practice;

public class J {
	void show(J j){
		j.display();
		this.display();
	
	}
	void display(){
		System.out.println("inside j's display");
		
	}
}
