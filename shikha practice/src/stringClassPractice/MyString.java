package stringClassPractice;

public class MyString {

	public static void main(String[] args) {
		String s= new String("Shikha");
		String s1= "Shikha";
		String s2= "Shikha";
		String s3= new String("Shikha");
		//System.out.println(s.equals(s1));
		System.out.println(s==s1);
		System.out.println(s1==s2);
		
		System.out.println(s.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
