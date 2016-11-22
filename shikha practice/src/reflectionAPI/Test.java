package reflectionAPI;

public class Test extends A {
	int i;
	 public String s="shikha";
	Test(){
		System.out.println("Default");
		
	}
	Test(int i){
		System.out.println("parametrized");
		this.i=i;
		System.out.println(i);
	}
	public void display(int k){
		System.out.println("display method"+k);
		
	}
	private void show(){
		System.out.println("show method");
		System.out.println(i);
	}
	static{
		System.out.println("static block");
	}
}
