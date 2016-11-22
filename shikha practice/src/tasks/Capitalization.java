package tasks;

public class Capitalization {
    public static void main(String[] args) {
    	 String s = "java is an object oriented programming language.";      
    	    final StringBuilder result = new StringBuilder(s.length()); 
    	    
    	    String words[] = s.split("\\ "); // space found then split it  
    	    
    	    for (int i = 0; i < words.length; i++) 
   	         {
    	    if (i > 0){
   	    result.append(" ");
    	    }   
   	    result.append(Character.toUpperCase(words[i].charAt(0))).
   	    append(words[i].substring(1));   
    	    }  
    	    System.out.println(result);  
}


}
