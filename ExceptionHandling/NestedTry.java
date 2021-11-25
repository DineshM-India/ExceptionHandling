package ExceptionHandling;

public class NestedTry {
	public static void main(String args[]) {
	try {
		
		try {
			int a = 10/0;	
			System.out.println("try1");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
try {
	int a[] = new int[5];
	a[7] = 7; 
	System.out.println("try2");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}catch(Exception e) {
		System.out.println("User def exception");
	}

}
}