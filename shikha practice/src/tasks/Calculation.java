package tasks;

import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
		
		

	}}



 class Number {
	 
	 int i;
	 
	 public void  add() {
		 choice();
		 
		
	}
	 public void subtract(){
		 choice();
		 
	 }
	 public void divide(){
		 choice();
		 
	 }
	 public void multiply(){
		 choice();
		 
		 
	 }
	 public void choice(){
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the no of your choice");
		 int number= sc.nextInt();
		 switch(number){
		 case 1:add();
		 break;
		 case 2: subtract();
		 break;
		 case 3: divide();
		 break;
		 case 4: multiply();
		 break;
		 default: 
			 System.out.println("invalid selection ");
			 System.out.println("please select a no. between 1-4");
		 
		 }
	 }
	}
 class Thread11 extends Thread{
	 Number n;
	 public Thread11(Number n) {
		 this.n=n;
	}
	 public void run(){
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the no.");
		 int a= sc.nextInt();
		 
	 }
 }
