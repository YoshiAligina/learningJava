 package oops.part2;

 class NJ implements Cities{

	@Override
	public void State() {
		System.out.println("The state we are in is New Jersey.");
		
	}

	@Override
	public void Town() {
		System.out.println("The town is Edison.");
		
	}
	
	public static void main(String[] args) {
		
		NJ ob = new NJ();
		
		ob.State();
		ob.Town();
	}

}
