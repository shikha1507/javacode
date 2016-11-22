package threadPractice;

import java.security.Provider.Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {

	public static void main(String[] args) {
		
		 ExecutorService executor = Executors.newFixedThreadPool(5);
		 
		 for (int i = 0; i < 10; i++) {  
	            Thread tt = new Task();  
	            executor.execute(tt);
	          } 
		
	        executor.shutdown();  
	        while (!executor.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");  
	    }  
	    	   
	    	   
	       
			
		}

	


