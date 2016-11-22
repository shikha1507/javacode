package arrayPractice;

import java.util.Arrays;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;
	

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

public void showDetails(){
	System.out.println("id="+id);
	System.out.println("name="+name);
	System.out.println("salary="+salary);
}
public int compareTo(Employee e){
	//return(this.id-e.id);
	return(this.salary-e.salary);
	//return(this.name.compareTo(e.name));
}

	public static void main(String[] args) {
		Employee []e= new Employee[5];
		e[0]= new Employee(11, "Amit", 10000);
		e[1]= new Employee(12, "Nmit", 15000);
		e[2]= new Employee(2, "vihan", 20000);
		e[3]= new Employee(33, "Anil", 40000);
		e[4]= new Employee(7, "guru", 17000);
		Arrays.sort(e);
for(Employee e1:e){
	e1.showDetails();
	
}
	}

}
