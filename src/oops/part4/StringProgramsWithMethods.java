package oops.part4;

public class StringProgramsWithMethods {
	
	public static void main(String[] args)
	{
		String input = "Java is platofmr independent";
		
		String a[] = input.split(" ");
		System.out.println(a[3]);
		
		String name = " Airport ";
		System.out.println(name.length());
		String output = name.trim();
		System.out.println(output);
		
		String name2 = "helicopter";
		System.out.println(name2.charAt(4));
		
		

		
		String b[] = new String[5];
		
	}
	
	public void method() 
	{
		String name = "java - ";
		String name2 = "Object Oriented";
		
		String result = name.concat(name2);
		
		System.out.println(result);
	}

}
