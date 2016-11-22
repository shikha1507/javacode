package genericsPractice;

public class GenDemo {
	Object o;
	Object o1;
	
	

	public GenDemo(Object o, Object o1) {
		super();
		this.o = o;
		this.o1 = o1;
	}

	Object geto(){
	return o;
}
	Object geto1(){
	return o1;
}
	public static void main(String[] args) {
		GenDemo gd= new GenDemo(15, 20);
		GenDemo gd1= new GenDemo("abc","cde");
		Object o= gd.geto();
		Integer i = (Integer) o;
		System.out.println(i);
		Object o1= gd.geto1();
		Integer i1 = (Integer) o1;
		System.out.println(i1);
		Object o2= gd1.geto();
		String s= (String) o2;
		System.out.println(o2);
		

	}

}
