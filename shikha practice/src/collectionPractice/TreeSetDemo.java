package collectionPractice;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String>ts= new TreeSet<String>();
		
		ts.add("lion");
		ts.add(new String("cat"));
		ts.add("dog");
		ts.add("dog");
		//ts.add(null);
		for(String s:ts){
			System.out.println(s);
		}
		
		
	}

}
