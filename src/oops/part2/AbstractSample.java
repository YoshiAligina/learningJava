package oops.part2;                      


abstract class Yoshi
{
	void go() 
	{
		System.out.println("go");
	}
	abstract void gone();
}    

abstract class Test extends Yoshi 
{
	void gone() 
	{
		System.out.println("gone");
	}
}
public class AbstractSample extends Test 
{
	void good() 
	{
		System.out.println("good");
	}
	
	public static void main(String[] args) 
	{
		AbstractSample ob = new AbstractSample();
		
		ob.go();
		ob.gone();
		ob.good();
	}

}
