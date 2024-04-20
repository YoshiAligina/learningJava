package oops.part6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInput
{
	public static void main(String[] args) {
		File ob = new File("C:\\Users\\yoshi\\OneDrive\\Desktop\\FileMaking.txt");


		try {
			FileInputStream ob1 = new FileInputStream(ob);

			int i = 0;
			
			while((i = ob1.read()) != 1)
			{
				System.out.print((char)i);
			}
			ob1.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
