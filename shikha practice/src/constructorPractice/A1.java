package constructorPractice;

public class A1 {
	int i,j;
	String s;
	double d;
	A1(double d1){
		i=20;
		j=20;
		s="hello";
		d=10.32;
		System.out.println("d");
	}
	A1(int i){
		i=120;
		j=230;
		s="hi";
		d=134.23;
		System.out.println(i);
		
	}
	A1(){
		System.out.println("o p");
		
	}
	public static void main(String[] args) {
		A1 a=new A1(123);
		A1 a1=new A1(123.34);
		A1 a2= new A1();
		System.out.println(a2.i);
		System.out.println(a1.i);
		System.out.println(a.i);
	}

}
