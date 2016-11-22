package practice;

public class K extends J{
	void show(J j){
		System.out.println(" K's show");
		j.display();
		this.display();
	}
	void display(){
		System.out.println("k's display");
	}
	
}
