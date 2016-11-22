package collectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class MyList extends Thread {
	List<Integer> l;
	 MyList( List <Integer> l) {
		this.l= l;
		
	}
	public void run()
	{
		for (int i = 1; i <100; i++) {
			l.add(i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		List<Integer> l= new ArrayList<Integer>();
		List<Integer> synlist = Collections.synchronizedList(l);
		MyList mylist=new MyList(synlist);
		
	
		mylist.start();
		for (int i = 100; i < 200; i++) {
			l.add(i);
			
		}
		mylist.join();
		for (Integer i:l) {
			System.out.println(i);
			
		}
	}

}
