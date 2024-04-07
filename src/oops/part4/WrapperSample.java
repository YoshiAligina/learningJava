package oops.part4;

public class WrapperSample {
	public static void main(String[] args) 
	{
		Integer ob = 30;
		System.out.println("Autounboxing - Toconvert object to an primative.");
		int b = ob.intValue();
		System.out.println(b); 
		
		String s = "Hello, my name is Hello";
		String c = s.replace('l','j');
		System.out.println(c); 
		
		String k = s.replaceAll("ll","oo");
		System.out.println(k); 

		

	}
	
	public void autoboxing()
	{
		int a = 20;
		
		Integer j = Integer.valueOf(a); //Object
		System.out.println("Autoboxing - Toconvert primative to an object.");
		System.out.println(j); 
	}

}
