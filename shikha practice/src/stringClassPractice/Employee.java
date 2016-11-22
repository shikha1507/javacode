package stringClassPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{
	int id;
	String name;
	int salary;
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
void show(){
	System.out.println("id:"+id);
	System.out.println("name:"+name);
	System.out.println("salary:"+salary);
}
}



