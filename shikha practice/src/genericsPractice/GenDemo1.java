package genericsPractice;

public class GenDemo1<T,V> {
	T o;
	V o1;
	
	

	public GenDemo1(T o, V o1) {
		super();
		this.o = o;
		this.o1 = o1;
	}

	T geto(){
	return o;
}
	V geto1(){
	return o1;
}
	public static void main(String[] args) {
		GenDemo1 <Integer,Integer> gd= new GenDemo1(15, 20);
		GenDemo1<String,String> gd1= new GenDemo1("abc","cde");
		
		Integer i = gd.geto() ;
		System.out.println(i);
		
		
		String s= gd1.geto1();
		System.out.println(s);
		

	}


	
}
