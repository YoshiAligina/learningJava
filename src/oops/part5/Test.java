package oops.part5;

public class Test extends Thread 
{
	public void run()
	{
		for(int i = 1; i <= 5;i++)
		{
			try {
				Thread.sleep(5);			
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}

			System.out.println("Child -" +i);
		}
	}
	public static void main(String[] args)
	{
		Test ob = new Test();
		ob.start();
		

		for(int i = 1; i <= 5;i++)
		{
			try {
				ob.join();        		
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}

			System.out.println("Parent -" +i);
		}
		
	}
}
