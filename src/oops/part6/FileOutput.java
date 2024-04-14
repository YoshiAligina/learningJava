package oops.part6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

	public static void main(String[] args) {
		File ob = new File("C:\\Users\\yoshi\\OneDrive\\Desktop\\FileMaking.txt");
		String c = "Java has a function!";
		byte b[] = c.getBytes();

		try {
			FileOutputStream ob1 = new FileOutputStream(ob);
			ob1.write(b);
			ob1.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
