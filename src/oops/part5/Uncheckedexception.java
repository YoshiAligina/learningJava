package oops.part5;

public class Uncheckedexception 
{
	public static void main(String[] args) 
	{
		try {  // TRy blocks are used to monitor the errors that could occur
			
			
		int a[] = new int [5];
		a[6] = 10;
		System.out.println(a[4]);
		
		}
		catch(ArithmeticException e) // catch block will throw the exception
		{
			System.out.println(e.getMessage());  
			e.printStackTrace(); //Detailed error message 
			e.fillInStackTrace();
		} 
		catch(ArrayIndexOutOfBoundsException e) // catch block will throw the exception
		{
			System.out.println(e.getMessage());
			e.printStackTrace(); 
			e.fillInStackTrace();
		} 
	}
}
                    