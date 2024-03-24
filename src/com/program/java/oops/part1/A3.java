package com.program.java.oops.part1;

public class A3 
{

	public void go(int a) 
	{

		System.out.println("One param - int "+ a);

	}

	protected static int go(int a, int b)
	{
		
		int c = a + b;
		
		System.out.println("Two params - a(int) & b(int)");
		
		System.out.println("Result "+ c);

		return 10;

	}
	protected static int go1(int a , int b)
	{
		int g = a-b;
		System.out.println("Two params - a(int) & b(int)");
		System.out.println("Result "+ g);
		return g;
	}

	private char go(int a, float b)
	{
		
		float c1 = a*b;
		
		System.out.println("Two params - a(int) & b(float)");
		
		System.out.println("Result "+c1);

		return 'A';
	}
	private char go2(int a, float b)
	{
		float num = a/b;
		System.out.println("Two parms - a(int) && b(float)");
		System.out.println("Result "+num) ;
		return 0;
	}

	public static void main(String[] args)
	{

		A3 ob = new A3();

		         
		ob.go(30);
		
		ob.go(20, 10.5f);
		
		A3.go(20, 40);
		
		ob.go1(10,5);
		
		ob.go2(10, 2.4f);

	}
	
}

            