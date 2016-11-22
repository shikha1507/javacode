package arrayPractice;

import java.util.Arrays;

public class B {

	public static void main(String[] args) {
//		int []i=new int [10];
//		int []j=new int [5];
//		j=i;
//		j[7]=100;
//		System.out.println(j[7]);

		String []s= new String[6];
		s[0]="s";
		s[1]="h";
		s[2]="i";
		s[3]="k";
		s[4]="h";
		s[5]="a";
		Arrays.sort(s);
		for(String e:s){
			System.out.print(e);
		}
		
	}

}
