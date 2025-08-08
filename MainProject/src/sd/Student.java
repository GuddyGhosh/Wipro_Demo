package sd; 

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
		System.out.print("Name: "+this.name);
		System.out.print("rollno: "+this.rollno);		
		System.out.print("marks: "+this.marks);
		
	}
	
 public class Student{
  public static void main(String args[])
	{
	  studentmangt s1=new studentmangt ("Manisha",3,100);
	   s1.display();
	  
	}
 }
}