package collectionPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetComparableDemo  {

	public static void main(String[] args) {
		Set<Employee>s= new TreeSet<Employee>();
		
	
		s.add(new Employee(1,20000,"ravi"));
		s.add(new Employee(10, 2000, "ram"));
		s.add(new Employee(11, 3000, "shyam"));
		s.add(new Employee(12, 4000, "geeta"));
		s.add(new Employee(13, 5000, "jaya"));
		s.add(new Employee(10, 2000, "ram"));
		
		Iterator<Employee>i= s.iterator();
		while(i.hasNext()){
			Employee e= i.next();
			System.out.println(e.id+" "+e.salary+" "+e.name);

	}

	}}
