package com.program.basic;

public class Test {

	public static int a = 100;  // global variable

	public static void main(String[] args) {

		Test ob = new Test();
		
		int x = ob.go();
		
		int result = x + a;
		
		System.out.println(result);

	}

	public int go() {

		int b = 200; // local variable

		return b;
	}

}
