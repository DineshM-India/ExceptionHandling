package ExceptionHandling;
public class Multiplecatchblock{
public static void main(String[] args) {  
    
    try{    
         int a[]=new int[5];    
         a[6]=30;   
        }    
       catch(ArithmeticException e)  
           {  
            System.out.println("Arithmetic");  
           }   
        catch(ArrayIndexOutOfBoundsException e)  
           {  
            System.out.println("Array");  
           }    
        
        System.out.println("rest of the code");    
}  
}  
