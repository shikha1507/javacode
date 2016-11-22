package collectionPractice;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set hs= new HashSet();
		hs.add(10);
		hs.add(new Integer(10));
		hs.add(new Byte((byte) 10));
		hs.add(new Short((short) 10));
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		

	}

}
