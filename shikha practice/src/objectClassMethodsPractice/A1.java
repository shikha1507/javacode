package objectClassMethodsPractice;

public class A1 {
	int a;
	A1(int a){
		this.a=a;
	}
	public boolean equals(Object o){
		return(this.hashCode()==o.hashCode());
	}
	public int hashCode(){
		return(a);
		
	}
}
