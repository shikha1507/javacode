package tasks;

public class VIPCustomer extends Customer {


	public VIPCustomer(int acc_no, String name, int balance, String DOB) {
		super(acc_no, name, balance, DOB);
		// TODO Auto-generated constructor stub
	}


	int pancard;
	int address;
	public void cardissue(){
	
		if (balance>200000){
			System.out.println("Generate the platinum gold card automatically without deduction");
		}
		else{
		balance=balance-500;
		System.out.println("card generation on a deduction of 500");
		}
	}
	

	public static void main(String[] args) {
	VIPCustomer vip=new VIPCustomer(15, "15", 15, "15");
		
		

		vip.deposit(800);
		vip.withdraw(200);

	}

}
