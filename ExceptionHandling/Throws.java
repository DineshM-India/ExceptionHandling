package ExceptionHandling;

public class Throws
{
	static void sample(int a,int b) throws ArithmeticException
	{
		
		int c = a/b;
		throw new ArithmeticException("Tested");
	}
	public static void main(String args[])
	{
		try
		{
			sample(10, 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage()+"  "+e.getCause()+"  "+e.getStackTrace()+"  "+e.getClass());
			
		}
	}
}

