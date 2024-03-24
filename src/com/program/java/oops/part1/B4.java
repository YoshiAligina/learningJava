package com.program.java.oops.part1;


class A4 { // overriding - run time polymorphism - dynamic
	
	protected void go(int a) {  
		System.out.println("go - super class");
		System.out.println("a = "+a);
	}
}

public class B4 extends A4 {
	public void go(int a) {
		super.go(a); 
		System.out.println("go -sub class");
	}
	
public static void main(String[]args) {
	B4 ob = new B4();
	
	ob.go(30);
}
}


