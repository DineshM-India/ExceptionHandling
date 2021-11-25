package ExceptionHandling;

public class ArrayindexOutofBoundException {
	  public static void main(String args[]){  
		   try{  
		int a[]= new int [5];
		    a[6]=5;
		   }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
		    
		   System.out.println("Exception handling");  
		  }  
		}  


