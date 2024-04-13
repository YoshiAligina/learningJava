package oops.part5;

public class ExceptionHandling 
{
	public static void main(String[] args)
	{
		
		try {  // TRy blocks are used to monitor the errors that could occur
			
		
		int a = 10/0;
		
		System.out.println("Result = "+a);
		} catch(ArithmeticException e) // catch block will throw the exception
		{
			System.out.println(e.getMessage());
		} finally {
		System.out.println("Thanks");
	}
		System.out.println("Thanks 2"); // Can print outside of 

	}
	
	// Exceptions are events that disrupt the flow of the program that prevent it from running.   
}
