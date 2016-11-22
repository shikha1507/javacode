package collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class PracticeMethods {

	public static void main(String[] args) {
		List<Integer>l= new Vector<Integer>();
		l.add(1);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(11);
		l.add(17);
		
		List<Integer> l1= new Vector<Integer>(l);
		List<Integer> l2= new Vector<Integer>(1, 2);
		l2.add(15);
		l2.add(23);
		l2.add(56);
		l2.add(78);
		l2.add(99);
		
		
		System.out.println(l2);
		
	}
	}
//		Collections.sort(l);
//		Collections.reverse(l);
//		List<Integer>al= new ArrayList<Integer>(l);
//		al.add(111);
//		System.out.println(al);
//		System.out.println("----------------");
//		List <Integer>ll= new ArrayList<Integer>();
//		ll.add(44);
//		ll.add(67);
//		ll.add(99);
//		l.remove(ll);
//		
//		//System.out.println(l.contains(13));
//		
//		System.out.println(ll);
//		Iterator<Integer> i= l.iterator();
//		while (i.hasNext()){
//			Integer a= i.next();
//			System.out.println(a);
//			
//			
//		}
////     converting array into list either by using asList() or by using allAll();
//		String[]  wordArray =  {"Love Yourself"  , "Alive is Awesome" , "Be in present"};
//		List<String> m= new ArrayList<String>();
//		//List<String> l =  Arrays.asList(wordArray);
//		
//		Collections.addAll(m, wordArray);
//		m.add("shikha");
//		System.out.println(m);
//		
//	}
//
//}
