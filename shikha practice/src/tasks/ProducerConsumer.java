package tasks;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
	public static void main(String args[]) {
	       List<Integer> sharedQueue = new ArrayList<Integer>(); 
	      
	       Producer producer=new Producer(sharedQueue);
	       Consumer consumer=new Consumer(sharedQueue);
	      
	      
	        
	        producer.start();
	        consumer.start();
	    }
	}


class Producer extends Thread {
	 
    private List<Integer> sharedQueue;
    private int maxSize=5; 
    public Producer(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {  
         try {
             produce(i);
         } catch (InterruptedException e) {  e.printStackTrace();   }
        }
}
 
    private void produce(int i) throws InterruptedException {
    
       synchronized (sharedQueue) {
        
           while (sharedQueue.size() == maxSize) {
             System.out.println("Queue is full, producerThread is waiting for "
                     + "consumerThread to consume, sharedQueue's size= "+maxSize);
             sharedQueue.wait();
         }
        }
       
      
        synchronized (sharedQueue) {  
           System.out.println("Produced : " + i);
           sharedQueue.add(i);
         Thread.sleep((2000));
         sharedQueue.notify();
        }
    }
}
 


class Consumer extends Thread {
    private List<Integer> sharedQueue;
    public Consumer(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
   
    @Override
    public void run() {
        while (true) {
         try {
             consume();
             Thread.sleep(100);
         } catch (InterruptedException e) {  e.printStackTrace();   }
        }
    }
 
    private void consume() throws InterruptedException {
      
       synchronized (sharedQueue) {
                    while (sharedQueue.size() == 0) {
                  System.out.println("Queue is empty, consumerThread is waiting for "
                               + "producerThread to produce, sharedQueue's size= 0");
             sharedQueue.wait();
         }
       }
       
 
     
        synchronized (sharedQueue) {
           Thread.sleep(2000);
         System.out.println("CONSUMED : "+ sharedQueue.remove(0));
         sharedQueue.notify();
        }
    }
}

 
   
    
 