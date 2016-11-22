package tasks;

import java.util.Scanner;

public class EmployeeGD {
		int id;
		String name;
		int salary;
		

		public EmployeeGD(int id, String name, int salary) {
			
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

	public void showDetails(){
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("salary="+salary);
	}
	
		
	
	
	
	
	
	
	
	
	
	
	public int compareTo(EmployeeGD e){
		//return(this.id-e.id);
		return(this.salary-e.salary);
		//return(this.name.compareTo(e.name));
	}


}
