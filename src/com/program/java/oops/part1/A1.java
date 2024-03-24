package com.program.java.oops.part1;

public class A1 {
	
	void go() {
		System.out.println("go - Hierarchical");
	}

}

class C1 extends A1 {
	
	void good() {
		System.out.println("good - Hierarchical");
	}
}

class B1 extends A1{
	
	void gone() {
		System.out.println("gone - Hierarchical");
	}
}
