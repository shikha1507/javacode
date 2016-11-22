package collectionPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeMain {

	public static void main(String[] args) {
		Set<Employee> hs= new LinkedHashSet<Employee>();
		hs.add(new Employee(10, 2000, "ram"));
		hs.add(new Employee(11, 3000, "shyam"));
		hs.add(new Employee(12, 4000, "geeta"));
		hs.add(new Employee(13, 5000, "jaya"));
		hs.add(new Employee(10, 2000, "ram"));
		Iterator<Employee>i= hs.iterator();
		while(i.hasNext()){
			Employee e= i.next();
			System.out.println(e.id+" "+e.salary+" "+e.name);
			
		}

	}

}
