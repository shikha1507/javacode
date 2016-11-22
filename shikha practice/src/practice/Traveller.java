package practice;

import java.util.Scanner;

public class Traveller {
	Vehicle v;
	 public void setVehicle(Vehicle v){
		this.v=v;
		
	}
	 public void move(){
		 v.run();
		
	}
	
public static void main (String[]args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//	System.out.println("inside main");
	Traveller t= new Traveller();
//	t.setVehicle(new Train());
//	t.move();
//	
	
	System.out.println("enter vehicle name");
	Scanner sc = new Scanner(System.in);
	String className=sc.next();
	Class  c=Class.forName(className);
	Object o = null;
	
		o = c.newInstance();
	
	
	Vehicle v=(Vehicle)o;
	t.setVehicle(v);
	t.move();
	
	
	
	
}
}
