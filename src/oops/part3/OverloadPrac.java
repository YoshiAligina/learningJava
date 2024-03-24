package oops.part3;

public class OverloadPrac {
	
	public OverloadPrac() {
		super();
		
		System.out.println("Default");
	}
   	public OverloadPrac(float d) {
		this();
		
		System.out.println("This is a float.");
	}
	public OverloadPrac(boolean j) {
		this('a');
		
		System.out.println("This is a boolean.");
	}
	public OverloadPrac(char i) {
		this(4.5f);
		
		System.out.println("This  is a char.");
	}
	
	public static void main(String[] args) {
		OverloadPrac ob = new OverloadPrac(true);
	}

}
