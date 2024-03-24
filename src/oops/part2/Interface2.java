package oops.part2;

public class Interface2 implements Cities 
{ 
	public void State() 
	{
		System.out.println("The state we are in is New York.");
	}

	@Override
	public void Town() {
		System.out.println("The town is Albany.");
		
	} 
	
	public static void main(String[] args)
	{
		Interface2 ob = new Interface2();
		ob.State();
		ob.Town();
	}

}
    