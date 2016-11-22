package practice;

public class AA {
	public static void test(){
		System.out.println("i am in the test method");
	}
	

	public static void main(String[] args) {
		System.out.println("main");
		AA a= new AA();
		
		test();
		a.test();
		AA.test();
		
		
		
	}

}
