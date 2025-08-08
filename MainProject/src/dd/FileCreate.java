package dd;

import java.io.*;
import java.io.File;
import java.io.IOException;
public class FileCreate
{
	public static void main(String[] args)
	{
	try
	{
		File file=new File("C:\\Users\\hp\\OneDrive\\Desktop\\New folder\\test.txt");
		if(file.createNewFile())
		System.out.print("File Created: "  + file.getName());
		else
		System.out.print("File already exists");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
 
		
	}
}