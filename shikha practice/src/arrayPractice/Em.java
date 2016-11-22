package arrayPractice;

public class Em {
	int id;
	String name;
	int salary;
	public Em(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public boolean equals(Object o){
	   // if(o == null)                return false;
	    
	    Em other = (Em) o;
	    if(this.id != other.id)     
	    	return false;
	    if(! this.name.equals(other.name)) 
	    	return false;
	    if(this.salary!=(other.salary))   
	    	return false;

	    return true;
	    
	    
	    
	   
	  }
	 }

	


