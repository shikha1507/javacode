package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		//int[]i= new int[5];
		System.out.println("Enter the elements");
		Scanner sc= new Scanner(System.in);
		
		 int e=sc.nextInt();
		 
		 
		int []i={1,4,7,2,5,9,10};
		
		
//		for (int j = 0; j < i.length; j++) {
//			System.out.println(i[j]);
//			
//		}

		for(int j:i){
			System.out.println(j);
		}
		Arrays.sort(i);
//		System.out.println("sorted Array is:");
//		for(int j:i){
//			
//			System.out.println(j);
//		}
//		System.out.println(Arrays.binarySearch(i, 4));
		System.out.println("-----------------");
//		System.out.println(Arrays.binarySearch(i, 0, 5, 7));
		
//		int[] j= Arrays.copyOf(i, 10);
//		for(int k:j){
//			System.out.println(k);
//		}
		int []l=Arrays.copyOfRange(i, 2, 10);
		for(int y:l){
			System.out.println(y);
		}
	}

}
