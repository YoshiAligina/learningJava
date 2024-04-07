package oops.part4;

public class StringSamplePrograms {
	
	public static void main(String[] args)
	{
		StringBuffer ab  = new StringBuffer(); // String buffer is mutable and synchronized. Performance is loww 
		// compared to StringBuilder. 
		ab.append("java");
		
		ab.append("Thread");
		
		System.out.println(ab);
		
		StringBuilder ob = new StringBuilder();
		ob.append("highlevel");
		ob.append(" program");
		System.out.println(ob); // Also mutable, but not synchronized.

		
	}


public void StringConcept()
{
	int a = 10;
	
	// String is immutable, its object state can not be changed. 
	
	String s1 = "name"; // Literal object - String Constant Code
	
	String s2 = new String("java"); // Normal Object - Heap Memory
	
	String ob1 = "HELLO";
	
	String ob2 = "HELLO";
	
	String ob3 = new String("HELLO");
	
	System.out.println("COMPARE 1 and 2");
	if(ob1 == ob2)
	{
		System.out.println("SAME");
	}
	else
	{
		System.out.println("NOT SAME");
	}
	System.out.println("COMPARE 1 and 2");
	if(ob1 == ob3)
	{
		System.out.println("SAME");
	}
	else
	{
		System.out.println("NOT SAME");
	}
}
}
