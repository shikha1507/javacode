package collectionPractice;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer>q= new PriorityQueue<Integer>();
		q.offer(10);
		q.offer(20);
		q.add(30);
		q.offer(40);
//	System.out.println(q.peek());
//	System.out.println(q.peek());
//	System.out.println(q.poll());
//	System.out.println(q.poll());
//	System.out.println(q.element());
		Iterator< Integer> I= q.iterator();
		while(I.hasNext()){
			System.out.println(I.next());
		}
//		while(q.peek()!= null){
//			System.out.println(q.poll());
//		}
boolean b= Boolean.FALSE;
	}

}
