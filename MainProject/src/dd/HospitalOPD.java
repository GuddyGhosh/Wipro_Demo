package dd;


import java.util.ArrayList;
import java.util.Scanner;
 
 
class Patient
{
	private int patientId;
	private String name;
	private int age;
	private String disease;
	
	public Patient (int patientId,String name, int age, String disease)
	{
	this.patientId=	patientId;
	this.name=name;
	this.age=age;
	this.disease=disease;
	}
	
	public String getName()
	{
		return name;
	}
	public void displayDetails()
	{
		System.out.println("Name:" + name + " \nAge :" + age + "\nDisease:" + disease +"\npatientId" + patientId) ;
	}
	}
public class HospitalOPD {
public static void main(String[] args)
	{
ArrayList<Patient> patientList=new ArrayList<>();
 
Scanner scanner =new Scanner (System.in);
patientList.add(new Patient(23,"Vinay Bhat", 45, "fever" ));
patientList.add(new Patient(34,"Sonali Langar", 40, "Cough"));
patientList.add(new Patient(56,"Renu Sai", 30, "Pain"));

while(true)
{
	System.out.println("\n Hospital OPD Manu :");
	System.out.println("1. Add New Patient:");
	System.out.println("2. Display All Pateints");
	System.out.println("3. Searrch Patient by Name");
	System.out.println("update patinet details");
	System.out.println("Remove patient by Index");
	System.out.println("Remove patient by Name");
	System.out.println("Check if patinet is exist");
	System.out.println("show total patient");
	System.out.println("clear all records");
	System.out.println("4. Exit");
	System.out.println("Enter your choice :");
	
	int choice =scanner.nextInt();
   
	scanner.nextLine();    // consume newline
 
	switch(choice)
	{
	case 1:
		System.out.print("Enter patient name :");
		String name=scanner.nextLine();
		System.out.println("Enter patient age:");
		int age =scanner.nextInt();
		scanner.nextLine();			     // consume newline
        System.out.println("Enter disease:");
        String disease=scanner.nextLine();
        patientList.add(new Patient(patientId,name, age, disease));
        System.out.println("Patient added successfully !");
        break;
	case 2:
		System.out.println("All Registered Patients:");
		for(Patient p : patientList)
		{
			p.displayDetails();
		}
		break;	
	case 3:
		System.out.println("Enter patient name to search:");
		String searchName=scanner.nextLine();
		boolean found=false;
		
	
		for(Patient p: patientList)
		{
			if(p.getName().equalsIgnoreCase(searchName))
			{
				p.displayDetails();
				found=true;
			}
		}
		if(!found)
		{
			System.out.println("No patient found with name :" + searchName);
		}
		break;
		
	case 4:
		System.out.println("Exiting...");
		scanner.close();
		return;
		
		default: System.out.println("Invalid choice!");
		
}
}
}
}
