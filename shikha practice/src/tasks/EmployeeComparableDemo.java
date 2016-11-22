package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeComparableDemo implements Comparable<EmployeeComparableDemo> {
	
		int id;
		String name;
		int salary;
		int option=0;
		int choice=0;

		public EmployeeComparableDemo(int id, String name, int salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		public EmployeeComparableDemo() {
			
		}
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
	public void showDetails(){
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("salary="+salary);
	}
	public int orderchoice(){
		System.out.println("what is the sorting order");
		System.out.println("1. Ascending");
		System.out.println("2.Descending");
		Scanner sc= new Scanner(System.in);
		this.choice=sc.nextInt();
		return(choice);
	}
	public int select(){
		Scanner sc= new Scanner(System.in);
		this.option=sc.nextInt();
		return(option);
	}
	public int compareTo(EmployeeComparableDemo e){
		orderchoice();
		if(choice==1){{
			select();
			if(option==1){
			return(this.id-e.id);}
			
			else if(option==2){
			
			return(this.salary-e.salary);}
			else if (option==3){
			
			return(this.name.compareTo(e.name));}
			else{
				return(0);
			}	
		}
		
	}
		
		
	else if(choice==2){
		select();
		if(option==1){
		return(e.id-this.id);}
		
		else if(option==2){
		
		return(this.salary-e.salary);}
		else if (option==3){
		
		return(this.name.compareTo(e.name));}
		else{
			return(0);
		}
	}else
	{
	return(0);	
		
	}}
		


		public static void main(String[] args) {
			
			
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the no of Employees");
			int n= sc.nextInt();
			
			EmployeeComparableDemo[]e	= new EmployeeComparableDemo[n];
			
			for (int i = 0; i <n; i++) {
				System.out.println("enter the id of  employee");
				int	id= sc.nextInt();
				System.out.println("enter the name of employee");
				String name= sc.next();
				System.out.println("Enter the salary of Employee");
				int salary= sc.nextInt();
				e[i]=new EmployeeComparableDemo();
				e[i].setId(id);
				e[i].setName(name);
				e[i].setSalary(salary);
			}
		
System.out.println("what is the sorting order");	

System.out.println("on what parameter you want to sort the array");
System.out.println("1. Id ");
System.out.println("2. Salary");
System.out.println("3. Name");

		Arrays.sort(e);
	for(EmployeeComparableDemo e1:e){
		e1.showDetails();
		
	}

		
		}}

	

	
