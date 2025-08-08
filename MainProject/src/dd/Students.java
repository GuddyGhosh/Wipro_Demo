package dd;
import java.util.*;

class studentmangt 
{
	String name;
	int rollno;
	int marks;
	
	
	studentmangt(String n,int r,int m)
	{
		this.name=n;
		this.rollno=r;
		this.marks=m;
	
}
  
	public void display()
	{
		System.out.print("name: "+this.name);
		System.out.print("rollno: "+this.rollno);		
		System.out.print("marks: "+this.marks);
		
	}
	
 public class Student
 {
  public static void main(String args[])
	{
	  ArrayList<studentmangt> lists=new ArrayList<studentmangt>();
	  String[] name= {"Manisha","Ravi","Sunita"};
	  int[] rno= {1,2,3};
	  int[] marks= {70,30,50};
	  
	  for(int i=0;i<3;i++)
	  {
		  studentmangt s=new studentmangt (name[i],rno[i],marks[i]);
		  lists.add(s);
	  }
	  lists.get(1).display();
	  lists.get(2).display();
	  lists.get(3).display();
	  
	}
 }
}