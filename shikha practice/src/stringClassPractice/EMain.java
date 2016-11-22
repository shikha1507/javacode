package stringClassPractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EMain {

	public static void main(String[] args) throws IOException {
		Employee e= new Employee(123, "shikha", 20000);
		File f= new File("F:\\java p\\shikha practice\\src\\file.txt");
		FileOutputStream fos= new FileOutputStream(f);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("object is serialized successfully");
		

	}
	
}
