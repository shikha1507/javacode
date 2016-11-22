package arrayPractice;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of elements");
		int a= sc.nextInt();
		
		int []store= new int[a];
		System.out.println("enter elements");
		
		 for(int i=0;i<a;i++){
		        store[i]=sc.nextInt();

		    }

		for(int b:store){
			System.out.println(b);
		}
		
		

	}

}
