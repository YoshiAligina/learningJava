package com.program.java.oops.part1;

public class A { // Single , multilevel inheritance
	
	void go() {
		System.out.println("go");
	}

}

class B extends A { // A - super class / base class || B - sub class / derived class
	
	void good() {
		System.out.println("good");
	}
}

 class C extends B { // B - super class || C - sub class
	 void gone() {
		System.out.println("gone");
	}
}
	
