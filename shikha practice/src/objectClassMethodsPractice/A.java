package objectClassMethodsPractice;

public class A {
	int a;
	String name;
	
	
	
	A(int a,String name){
		this.name=name;
		this.a=a;
	}
	
	public boolean equals(Object o){
		return (this.hashCode()== o.hashCode());
	}
	public int hashCode(){
		
		return(name.substring(0, 1).hashCode());
	}
	public static void main(String[] args) {
		A a=new A(10,"AAA");
		A a1= new A(11,"ABC");
		System.out.println(a.equals(a1));
		

	}

}
