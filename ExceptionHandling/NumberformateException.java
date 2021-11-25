package ExceptionHandling;

public class NumberformateException{  
	  public static void main(String args[]){  
	   try{  
	      
	      String hello ="Dinesh"; 
	      int i=Integer.parseInt(hello);
	   }catch(NumberFormatException e){System.out.println(e);}  
	    
	   System.out.println("Exception handling");  
	  }  
	}  
