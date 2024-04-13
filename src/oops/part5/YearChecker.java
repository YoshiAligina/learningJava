package oops.part5;

public class YearChecker {
	
	public static void main(String[] args) {
		int year =1;
		String s = "Hi";
		
		
		try {
			if ( year  <4)
			{
				throw new CustomException("You must be a year four to be a senior.");
			}
			else
			{
				System.out.println("You are a senior.");
			}
		} 
		catch (CustomException e)
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
	
	try {
		if ( "Hello" != s)
		{
			throw new CustomException("You did'nt say hi");
		}
		else
		{
			System.out.println("Hi.");
		}
	} 
	catch (CustomException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
