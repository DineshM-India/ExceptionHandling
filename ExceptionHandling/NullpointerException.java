package ExceptionHandling;


public class NullpointerException{  
	  public static void main(String args[]){  
	   try{  
	      
	      String hello =null; 
	      System.out.println(hello.length());
	   }catch(NullPointerException e){System.out.println(e);}  
	    System.out.println("Exception handling");  
	  }  
	}  