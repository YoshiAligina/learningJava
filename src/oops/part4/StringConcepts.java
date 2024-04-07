package oops.part4;

public class StringConcepts {
	
	public static void main(String[] args)
	{
		String a = "java";
		
		String b = "HighLevel";
		
		String c = "";
		
		System.out.println("Before Swapping "+a+" "+b);
		
		/* c = a;
		a = b;
		b = c;
		
		System.out.println("After: "+a+" "+b); */
		
		a = a+b;
	//	System.out.println(a); // A becomes Javahighlevel
		
		b = a.substring(0,a.length()-b.length());
		
	//	System.out.println(b); 
		
		a = a.substring(b.length());
		
		//System.out.println(a); 

		System.out.println("After Swapping "+a+" "+b);



		
	}

}
