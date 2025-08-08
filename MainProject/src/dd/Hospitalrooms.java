package dd;

import java.util.TreeSet;
import java.util.Comparator;
public class Hospitalrooms 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		TreeSet<Integer> rooms=new TreeSet<>(Comparator.reverseOrder());
		System.out.println("Available rooms: ");
		
		rooms.add(101);
		rooms.add(99);
		rooms.add(100);
		rooms.add(105);
		rooms.add(44);
		System.out.println(rooms);
		
		

	}

}
