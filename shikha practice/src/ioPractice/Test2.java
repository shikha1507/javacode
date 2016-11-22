package ioPractice;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		File f= new File("t1.txt");
		BufferedInputStream bis= new BufferedInputStream(new FileInputStream("C:\\Users\\Shikha (Ranu)\\Desktop\\ht.docx"));
FileOutputStream fos= new FileOutputStream(f);
byte[]b=null;
int length;
//while ((length = bis.read(b))!=null){
	fos.write(b);
	
	
}
	}


