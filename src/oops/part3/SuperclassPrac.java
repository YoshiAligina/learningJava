package oops.part3;

class one {
	public one() {
		super();
		System.out.println("This is one.");
	}
}
class two extends one {
	public two() {
		super();
		System.out.println("This is two.");
	}
}

public class SuperclassPrac extends two{
	public SuperclassPrac() {
		super();
		System.out.println("This is SuperClassPractice.");

	}
	
	public static void main(String[] args) {
		SuperclassPrac a = new SuperclassPrac();
	}

}
