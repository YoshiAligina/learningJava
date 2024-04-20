package oops.part6;
import java.io.File;
import java.io.IOException;

public class FileHandling 
{
	public static void main(String[] args)
	{
		File ob = new File("C:\\Users\\yoshi\\OneDrive\\Desktop\\FileMaking.txt");
		
		try 
		{
			if(ob.createNewFile())
			{
				System.out.print("File - "+ob.getName()+" is created");
			}
			else 
			{
				System.out.print(ob.getName()+" exists");

			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
