package collectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> m= new HashMap<Integer, String>();
		m.put(1, "ram");
		m.put(12, "ravi");
		m.put(3, "ram");
		m.put(null, "shyam");
		m.put(null, "amit");
		Set <Map.Entry<Integer,String>>s= m.entrySet();
		for(Map.Entry<Integer, String>m1:s){
			System.out.println(m1.getKey()+" "+m1.getValue());
		}

	}

}
