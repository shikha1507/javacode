package practice;

public class A11 {
	int i;
	public void show(){
		this.i=i;
		
	}
public boolean equals(Object o){
	A11 a= (A11)(o);
	return (this.i==a.i);
	
	
}
	public static void main(String[] args) {
		A11 a=new A11();
		A11 a1= new A11();
		System.out.println(a.equals(a1));



	}

}
