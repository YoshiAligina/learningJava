package oops.part2;

public class InterfaceSample implements DebitCard {
	
	public void cardName() 
	{
		System.out.println("BOFA  Debit Card");
	}
	
	public void balanceCheck() 
	{
		System.out.println("Visit : BoFA.com");
	}

	public static void main(String[] args)
	{
		InterfaceSample ob = new InterfaceSample();
		ob.cardName();
		ob.balanceCheck();
	}
}
