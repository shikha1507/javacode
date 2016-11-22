package ioPractice;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
//		InputStream is= System.in;
//		byte b= (byte) is.read();
//System.out.println(b);
		
//		InputStreamReader isr= new InputStreamReader(System.in);
//		char c= (char) isr.read();
//		System.out.println(c);
		
//		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//		String str=  null;
//		while((str = br.readLine())!= null){
//			System.out.println(str);		
//		}
	
//		FileInputStream fis= new FileInputStream("C:\\Users\\Shikha (Ranu)\\Desktop\\ht.docx");
//		byte b[]= new byte[500];
//		fis. read(b);
		
//	File f= new File("C:\\Users\\Shikha (Ranu)\\Desktop\\ht.docx");
//	FileInputStream fis= new FileInputStream(f);
//	long bytes=  f.length();
//	byte b[]= new byte[(int) bytes];
//	fis.read(b);
	
	File f= new File("C:\\Users\\Shikha (Ranu)\\Desktop\\ht1.docx");
	BufferedInputStream bis= new BufferedInputStream(new FileInputStream("C:\\Users\\Shikha (Ranu)\\Desktop\\ht.docx"));
	FileOutputStream fos= new FileOutputStream(f);
	byte[]b= null;
	//while((b=bis.read())!=null){
		fos.write(b);
		
	}
// --------------------------------------------------------------------------------------------------------------
		
		
		
//		FileInputStream instream = null;
//		FileOutputStream outstream = null;
//	 
//	    	try{
//	    	    File infile =new File("C:\\Users\\Shikha (Ranu)\\Desktop\\ht.docx");
//	    	    File outfile =new File("C:\\Users\\Shikha (Ranu)\\Desktop\\ht1.docx");
//	 
//	    	    instream = new FileInputStream(infile);
//	    	    outstream = new FileOutputStream(outfile);
//	 
//	    	    byte[] buffer = new byte[1024];
//	 
//	    	    int length;
//	    	    
//	    	    while ((length = instream.read(buffer)) > 0){
//	    	    outstream.write(buffer, 0, length);
//	    	   
//	    	    }
//
//	    	   
//	    	    instream.close();
//	    	    outstream.close();
//
//	    	    System.out.println("File copied successfully!!");
//	 
//	    	}catch(IOException ioe){
//	    		ioe.printStackTrace();
//	    	 }
	    }
		
		
		
	


