package objectClassMethodsPractice;

public class B1 {
	int id;
	B1(int id){
		this.id=id;
		
	}
	public int hashCode(){
		return (id);
	}
	public static void main(String[] args) {
		A1 a=new A1(10);
		B1 b= new B1(10);
		System.out.println(b.equals(a));
		//System.out.println(a.hashCode());

	}

}
