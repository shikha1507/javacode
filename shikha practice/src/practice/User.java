package practice;

public class User {
	It1 i;
	User(It1 i){
		this.i=i;
		
	}
//	public void setDetails(It1 i){
//		this.i=i;
//	}
	public void show(){
		i.m1();
		i.m2();
	}
	public static void main(String[] args) {
		User u =new User(new C1());
		//u.setDetails(new C1());
		u.show();
	}

}
