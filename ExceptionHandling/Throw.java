package ExceptionHandling;

import java.util.Scanner;
class TravelTime extends Exception{
	public void TravelTime(){
		System.out.println("Travel not alllowed in Chennai local train");
	}
}
public class Throw {   
    public static void validate(int time) throws Exception{  
        if(time < 9) {  
         throw new TravelTime();    
        }  
        else {  
            System.out.println("Travel allowed");  
        }  
    }  
 public static void main(String args[]){  
        int a;
        System.out.println("Enter any number");
        Scanner o = new Scanner(System.in);
        a = o.nextInt();
        try {
			validate(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
           
  }    
}    