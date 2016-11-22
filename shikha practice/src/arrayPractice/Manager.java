package arrayPractice;

import java.util.Arrays;
import java.util.Comparator;

public class Manager implements Comparator <Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		
		return (e1.id-e2.id);
		
	}


	public static void main(String[] args) {
		Employee []e= new Employee[5];
		e[0]= new Employee(11, "Amit", 10000);
		e[1]= new Employee(12, "Nmit", 15000);
		e[2]= new Employee(2, "vihan", 20000);
		e[3]= new Employee(33, "Anil", 40000);
		e[4]= new Employee(7, "guru", 17000);
		Arrays.sort(e,new Manager());
		for(Employee z:e){
			z.showDetails();
		}
		

	}

	
}
