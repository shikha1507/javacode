package staticeg;

public class G {
	int i,j;
	G(){
		System.out.println("G()");
		System.out.println(i);
	}
	G(int i){
		this.i=i;
		System.out.println("G(int)");
		System.out.println(this.i);
	}
	G(int i,int j){
		this.i=i;
		this.j=j;
		System.out.println("G(int int)");
		System.out.println(this.i);
		System.out.println(j);
	}
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("iib2");
	}
	{
		System.out.println("iib3");
	}

	public static void main(String[] args) {
		G g=new G();
		System.out.println("------");
		G g1=new G(10);
		System.out.println("--------");
		G g2= new G(10,30);
	}

}
