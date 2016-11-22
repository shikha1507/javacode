package collectionPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Employee implements Comparable<Employee> {
	int id;
	int salary;
	String  name;
	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
}	
		//public int hashCode(){
//		return id;
//	}
//	public boolean equals(Object o){
//		return (this.hashCode()==o.hashCode());
//	}
//	
//	public boolean equals(Object o){
//		Employee e=(Employee)o;
//		return(this.id==e.id);
//	}
//

public int compareTo(Employee e){
	return (this.id-e.id);
}

}


	


