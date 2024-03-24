 package oops.part2;

public class ChaseBank implements DebitCard{

	@Override
	public void cardName() {
		System.out.println("ChaseBank Debit Card");
		
	}

	@Override
	public void balanceCheck() {
		System.out.println("Visit : Chase.com");
		
	}
	
	public static void main(String[] args) {
		
		ChaseBank ob = new ChaseBank();
		
		ob.cardName();
		ob.balanceCheck();
	}

}
