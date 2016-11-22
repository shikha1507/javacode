package tasks;

public class Customer {
	int acc_no;
	String name;
	int balance;
	String DOB;
	public Customer(int acc_no, String name,int balance,String DOB) {
		this.acc_no=acc_no;
		this.name=name;
		this.balance=balance;
		this.DOB=DOB;
			
	}
public void deposit(int amount){
	balance=balance+amount;
	System.out.println(balance);
}
public int withdraw(int amount){
	balance=balance-amount;
	return(amount);
	
}
public int enquiry(){
	return(balance);
}
public static void main (String[]args){
	Customer c=new Customer(111, "shikha", 2000, "15");
	c.deposit(2000);
}
}
