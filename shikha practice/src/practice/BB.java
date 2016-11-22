package practice;

import java.util.Scanner;

public class BB {
	int j,k,i;
	BB(int i){
		this.i=i;
		System.out.println("single parameter");
		
	}
	BB(){
		
	}
	void test1(){
		System.out.println(i);
		
	}
	BB(int j,int k){
		this.j=j;
		this.k=k;
		System.out.println("2 parameter");
	}
	
	public void test(){
		
		
		BB b=new BB();
		b.test1();
		this.test1();
		System.out.println(i);
	}
	
	
	public static void main(String[] aa) {
		
		BB b1=new BB(10);
		BB b4= new BB(50);
		BB b2= new BB(20,40);
		BB b3=new BB(10,30);
		b1.test();
		b4.test();
		b3.test1();
}
}