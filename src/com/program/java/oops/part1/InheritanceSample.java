package com.program.java.oops.part1;

public class InheritanceSample {

	public static void main(String[] args) {

		//C ob = new C();

		//ob.gone();
		//ob.good();
		//ob.go();

		B1 ob1 = new B1();
		
		ob1.go();
		ob1.gone();
		
		C1 ob2 = new C1();
		
		ob2.go();
		ob2.good();
		
	}
	
	

	// the properties of one class can be inherited by the other
	// control the object creation
	// create object at the sub class for all above super class use extend keyword
	
	//Types : 1. Single inheritance , 2. Multilevel inheritance, 3. Multiple Inheritance
	
	// 4.Hierarchical inheritance // 5. Hybrid
	
	//class  - class  extends

}
