package oops.part3;

// Obj is the super class for all

class A {
	public A() {
		super();
		
		System.out.println("A");
	}
} 

class B extends A {
	public B() {
		super();
		System.out.println("B");
	}
}

public class C extends B{
	public C( ) {
		super();
		
		System.out.println("C");
	}
	public static void main(String[] args)
	{
		C ob = new C();
	}

}
