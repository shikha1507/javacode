package tasks;

	import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

	public class EntertainmentWorld {
		
		String name;
	     int  balance;
		String DOB;
		ArrayList<String>al= new ArrayList<String>();
		public void selectservices(){
			System.out.println("select services");
			int choice=0;
			int mobilerecharge=1;
			int balanceenquiry=2;
			int transactionhistory=3;
			int balancedeposite=4;
			int profileview=5;
			
			Scanner s= new Scanner(System.in);
			
			System.out.println("1. Mobile Recharge");
			System.out.println("2. Balance Enquiry");
			System.out.println("3. Transaction History");
			System.out.println("4. Balance Deposit");
			System.out.println("5. Profile View");
			choice =read_range (s, 1, 5);
			if(choice==1){
				MobileRecharge();
			}
			else if(choice==2){
				System.out.println("Welcome to balance enquiry");
				balanceEnquiry();
				  
			}
			else if(choice==3){
				transactionHistory();
			}
			else if(choice==4){
				balanceDeposit();
			}
			else if (choice==5){
				profileView();
			}
			else{
				System.out.println("invalid selection");
			}
		}
		public void MobileRecharge(){
			int amount=0;
			System.out.println("please enter your mobile no.");
			Scanner s=new Scanner(System.in);
			
			String n[] = null;
			for (int i = 0; i < 10; i++) {
				String mobno= s.next();
				
				if(mobno.length()<10 || mobno.length()>10)
				{
					System.out.println("invalid number");
					System.out.println("Enter a 10 digit no.");
					 }
				else
				{
					System.out.println("enter your recharge amount");
					amount=s.nextInt();
					if(balance>amount){
						System.out.println("your mobile has been recharged with"+amount+"rupees");
						balance=balance-amount;
						
					}
					else{
						System.out.println("Insufficient Balance in the account");
					}
					
				}
				al.add("your account is debited by Rs."+amount+"for mobile recharge"+new Date());
				selectservices();
			}
			
		}
		public int balanceEnquiry(){
			
			return(balance);
			
		}
			
		public void transactionHistory(){
			//ArrayList<String>al= new ArrayList<String>();
			System.out.println(al);
			selectservices();
			}
				
			public void balanceDeposit(){
				int amount;
				Scanner s= new Scanner(System.in);
				System.out.println("Enter amount");
				amount=s.nextInt();
				balance=balance+amount;
				System.out.println("Balance after deposit:"+balance);
				
				//transactionHistory();
				al.add("your account is credited by Rs."+amount+"by cash deposit"+new Date());
				selectservices();
			}
		public void profileView(){
			name=this.name;
			balance=this.balance;
			DOB= this.DOB;
			System.out.println("Name:"+name);
			System.out.println("Balance:"+balance);
			System.out.println("DOB:"+DOB);
			selectservices();
		}
		
		private static int read_range (Scanner scanner, int low, int high) {
		     int value;
		     value = scanner.nextInt();
		     while (value < low || value > high) {
		       System.out.print("Please enter a value between " + low + " and " + high + ": ");
		       value = scanner.nextInt();
		     }
		     return value;
		   }
		public static void main(String[] args) {
			System.out.println("Welcome to the entertainment world.com ");
			EntertainmentWorld ew= new EntertainmentWorld();
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your name:");
			ew.name=s.next();
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter your balance");
			ew.balance=s1.nextInt();
			Scanner s2=new Scanner(System.in);
			System.out.println("Enter your Date of birth");
			ew.DOB= s2.next();
			
			System.out.println("Your registration is successful");
			System.out.println("Please select the services");
			//ew.MobileRecharge();
			//ew.profileView();
			
			//ew.transactionHistory();
			//ew.balanceDeposit();
			ew.selectservices();
			
			
		}

	}



