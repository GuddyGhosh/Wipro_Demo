package dd;

import java.util.HashMap;
import java.util.Map;
public class Student
{
  private int id;
  private String name;
  private String disease;
  
  public Student(int id,String name,String disease)
  {
	  this.id=id;
	  this.name=name;
	  this.disease=disease;
  }
    public int getID()
    {
    	return id;
  }
    
    public String getName()
    {
    	return name;
    }
    public String getDisease()
    {
    	return disease;
    }
    
    public String toString()
    {
    	return "Patient{id="+id+"", name="+name+"",disease="+disease+""};
    }
    public class HospitalMap
    {
    	public static void main(String args[])
    	{
    		HashMap<Integer,String> patientMap=new HashMap<>();
    		patientMap.put(101,new Student(101,"Manisha","Cold"));
    		patientMap.put(103,new Student(101,"Guddy","Fever"));
    		patientMap.put(104,new Student(101,"Riya","Flu"));
    		
    		System.out.println("\n Get Patient With ID 102: ");
    		System.out.println(patientMap.get(102));
    		System.out.println(patientMap.containsKey(101));
    		System.out.println(patientMap.containsValue(103));
    		
    	}
    }
    
}
    
    
    
    
    
}
