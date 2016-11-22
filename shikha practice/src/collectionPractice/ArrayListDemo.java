package collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List <String> al= new LinkedList<String>();
		al.add("sh");
		al.add("ik");
		al.add(2, "ik");
		al.add(null);
		//System.out.println(al.get(0));
		
		Iterator<String>a= al.iterator();
		while(a.hasNext()){
			String s= a.next();System.out.println(s);
			
		}
//  2.
//		ListIterator<String> l= al.listIterator(al.size());
//		while(l.hasPrevious()){
//			String s= l.previous();
//			System.out.println(s);
//		}
		
//	3.	for (int i = 0; i <al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		
//	4.	for(String a:al){System.out.println(a);
//			
//		}
//	5.	System.out.println(al);
//		

	}

}
