package staticeg;

public class F {

	public static void main(String[] args) {
		Feg Feg1=new Feg();
		System.out.println(Feg1.i);
		Feg1.i=10;
		int k=Feg1.get();
		System.out.println(k);
		Feg1.set(20);
		System.out.println(Feg1.get());
		

	}

}
