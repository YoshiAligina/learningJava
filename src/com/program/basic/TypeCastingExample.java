package com.program.basic;

public class TypeCastingExample {
	
	// It is the process of converting one data type to another
	
	// Implicit - widening
	
	// byte -> short -> int -> long -> float -> double
	
	// Explicit - narrowing
	
	// double(8) -> float(4) -> long(4) ->int(4) -> short(2) -> byte

	public static void main(String[] args) {
		
	
		//int a = 65;
		
		//char c = (char) a;
		
		//System.out.println(" type cast to char from int is - "+c);
		
		TypeCastingExample ob = new TypeCastingExample();
		
		ob.narrowing();
		
		
	}
	
	void narrowing() {
		
		double d = 166.66;
		long l = (long)d;
		int i = (int)l;
		
		System.out.println("Before conversion, double value "+ d);
		System.out.println("After conversion, long value "+ l);
		System.out.println("After conversion, int value "+ i);
		
	}
	
	void widening() {
		
		int x = 7;
		long y = x;
		float z = y;
		
		System.out.println("Before conversion, int value "+ x);
		System.out.println("After conversion, long value "+ y);
		System.out.println("After conversion, float value "+ z);
	}
	

}
