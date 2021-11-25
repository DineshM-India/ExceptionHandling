package ExceptionHandling;

public class ArithmaticException{  
	  public static void main(String args[]){  
	   try{  
	      
	      int a = 20/0;//zero is not devisible  
	   }catch(ArithmeticException e){System.out.println(e);}  
	    
	   System.out.println("Exception handling");  
	  }  
	}  
