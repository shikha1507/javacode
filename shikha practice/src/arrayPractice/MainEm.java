package arrayPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainEm {
	

	public static void main(String[] args) {
		List<Em> l= new ArrayList<Em>();
	
		l.add(new Em(1,"ravi",1000));
		l.add(new Em(2,"navi",2000));
		l.add(new Em(3,"Amit",3000));
		l.add(new Em(4,"Nmit",4000));
		l.add(new Em(5,"Ajay",5000));
		System.out.println(l.contains(new Em(1,"ravi",1000)));
	
		Iterator<Em> I= l.iterator();
		while(I.hasNext()){
			Em s=I.next();
			
			System.out.println(s.id+" "+ s.name+" "+ s.salary);
			
		}
		
	}

	@Override
	public String toString() {
		return "MainEm []";
	}

}
