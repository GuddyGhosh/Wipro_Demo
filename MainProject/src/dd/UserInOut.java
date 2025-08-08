package dd;

import java.util.Scanner;
public class UserInOut
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=sc.next();
		System.out.print("Enter age: ");
		int age=sc.nextInt();
		System.out.print("Enter gender: ");
		char gender=sc.next().charAt(0);
		
        System.out.print("Name:"+name+"\n");
        System.out.print("Age:"+age+"\n");
        System.out.print("Gender:"+gender);
      
	}

}
