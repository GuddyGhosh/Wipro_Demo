package dd;

import java.io.File;
public class Gumsum
{
	public static void main(String args[])
	{
		System.out.println("File handling in java");
		File f=new File("abc.txt");
		f.exists();
		f.createNewFile()
		System.out.println(f.exists());
	
	}
	
}