package tasks;

import java.util.Scanner;

public class Employee {
	String FirstName;
	String LastName;
	int mob_no;
	String address;
	String email;
	int pincode;
	synchronized public void thread1data(String FirstName,String LastName,
	int mob_no){
		
		this.FirstName=FirstName;
		this.LastName= LastName;
		this.mob_no= mob_no;
		System.out.println("FirstNo:"+FirstName);
		System.out.println("LastNo:"+LastName);
		System.out.println("MobileNo:"+mob_no);
	}
	
 synchronized public void thread2data(String address,String email,int pincode){
	
	System.out.println("Address:"+address);
	System.out.println("Emailid:"+email);
	System.out.println("PINCode:"+pincode);
}
}
class Thread1 extends Thread{
	Employee e;
	Thread1(Employee e){
		this.e= e;
	}
	public void run(){
		
	
		e.thread1data("ss","rr",123);
	}
	
}
class Thread2 extends Thread{
	Employee e;
	public Thread2(Employee e) {
		this.e=e;
		
		
	}
	public void run(){
		
		e.thread2data("45", "gupta.shikha@gmail.com", 452018);
	}
}
class Main{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of users");
		int no= sc.nextInt();
		Employee e= new Employee();
		for (int i = 0; i <=no; i++) {
		
		
        new Thread1(e).start();
			
        new Thread2(e).start();
        
        
		
			
		}
		
		
	}
}
