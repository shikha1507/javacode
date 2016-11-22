package tasks;

public class B extends A {
	int k;
	public void display(){
		System.out.println("j:"+j);
		System.out.println("k:"+k);
		this.show();
		
	}
	
	public static void main(String[] args) {
		System.out.println("inside main");
		B b=new B();
		b.putdata(10, 20);
		b.display();
		b.show();

	}

}
