package objectClassMethodsPractice;

public class A12CloneExample implements Cloneable {
	int i;
	public A12CloneExample(int i) {
		this.i=i;
		
	}
	public void show(){
		System.out.println(i);
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		A12CloneExample a= new A12CloneExample(10);
		a.show();
		A12CloneExample a1=new A12CloneExample(20);
		a1.show();
		Object o= a1.clone();
		A12CloneExample a2= (A12CloneExample)o;
		a2.show();
		
		
	}

}
