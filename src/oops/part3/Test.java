package oops.part3;

public class Test { // Constructor overload

	public Test() {
		super();

		System.out.println("Default constructor");
	}
	
	public Test(String name) {
		this();
	
		System.out.println("Parameter is String");
	}

	public Test(double d) {

		this("Sky");
		System.out.println("parameter is double");
	}

	Test(int x) {

		this(2.5);
		System.out.println("parameter is int");
	}

	public static void main(String[] args) {

		Test ob = new Test(10);
	}

}

// this() -> access the current class constructor
// this -> to access the global variable of the current class


// super() ->  - > To access the super class constructor
// super -> to access the methods of the super class