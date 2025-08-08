
 
package dd;
import java.util.*;
import java.util.LocalDateTime;
import java.time.

 
class PatientAppS
{
	private String patientName;
	private int patientId;
	private String time;
	private String appointment;
	
	public PatientAppS(String patientName,int patientId,String time,String appointment)
	{
		this.patientId = patientId;
		this.patientName = patientName;
		this.appointment = appointment;
		this.time = time;
	}
	public String toString()
	{
		return " Patient ID: " + patientId + " Patient Name :" + patientName + " Appointment: " + appointment + " Time: " + time;
	}
	public boolean equals(Object obj)
	{
		if(this ==obj) return true;
		if(obj instanceof PatientAppS)
		{
			return false;
		}
		return patientId == this.patientId;
	}
	
}
public class PatientDetails 
{
 
	public static void main(String[] args)
	{
		TreeMap<Integer,PatientAppS> p1 = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n---- Patient Appointment System ----");
			System.out.println("1. Add Appointment");
			System.out.println("2. View All Appointment");
			System.out.println("3. Remove a Appointment");
			System.out.println("4. Check the Next and Last Appointment");
			System.out.println("5. Reschedule an appointment");
			System.out.println("6. Exit");
			System.out.println("Enter your Choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			LocalDateTime currentTime=LocalDateTime.now();
			
			switch(choice) 
			{
			   case 1:
				   System.out.println("Enter Patient ID: ");
				   int patientId = sc.nextInt();
				   sc.nextLine();
				   
				   System.out.println("Enter Patinet Name: ");
				   String patientName = sc.nextLine();
				   
				   System.out.println("Enter Appointment: ");
				   String patientAppointment = sc.nextLine();
				   
				   System.out.println("Enter Appointment Time(HH:MM:SS): ");
				   String patientAppTime = sc.nextLine();
				   
				   
				   PatientAppS	patient = new PatientAppS(patientName,patientId,patientAppTime,patientAppointment) ;
				   if(p1.containsKey(patientId)) 
				   {
					   System.out.println("Patiet Already exist");
				   }
				   else
				   {
					   p1.put(patientId, patient);
					   System.out.println("Patient Regiested Successfully");
				   }
				   break;
			   case 2:
				   if(!(p1.isEmpty()))
				   {
					   

					   
					   for(Map.Entry<Integer,PatientAppS>entry :p1.entrySet()) {
						   System.out.println(entry.getValue());
					   }
				   }
				   else
				   {
					   System.out.println("There is no Appointment");
				   }
				   break;
			   case 3:
				   System.out.println("Enter ID for Removing the patient");
				   int id = sc.nextInt();
				   p1.remove(id);
				   break;
			   case 4:
				   System.out.println("The next Appointment is" + p1.firstKey());
				   System.out.println("The last Appointment is" + p1.lastKey());
				   break;
			   case 5:
				   System.out.println("Reschudle the Appointment By ID");
				   
				   System.out.println("Enter ID the patient");
				   int id1 = sc.nextInt();
				   sc.nextLine();				   
				   if(p1.containsKey(id1)) {
					   System.out.println("Enter Patinet Name: ");
					   String patientName1 = sc.nextLine();
					   
					   System.out.println("Enter Appointment: ");
					   String patientAppointment1 = sc.nextLine();
					   
					   System.out.println("Enter Appointment Time(HH:MM:SS): ");
					   String patientAppTime1 = sc.nextLine();
					   
					   
					   PatientAppS	patient1 = new PatientAppS(patientName1,id1,patientAppTime1,patientAppointment1) ;
					   if(p1.containsKey(id1)) {
			
						   p1.put(id1, patient1);
						   System.out.println("Patient Update Successfully");
					   }
					   else 
					   {
						  
						  System.out.println("Patient Id is not in your database");
					   }
				   }
				   else 
				   {
					   System.out.println("This is Wrong ID");
				   }
				  
				   break;
			   case 6:
				   System.out.print("Exiting...");
				   sc.close();
				   return;
			  default:
				  System.out.println("Invalid Choice");
				   
				   
				   
			}
				   
				   
			}
			
			
			
		}
 
	}
 

 
 