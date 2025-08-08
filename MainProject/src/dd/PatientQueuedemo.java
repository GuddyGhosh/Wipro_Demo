package dd;

//Patients arrive and wait their turn (FIFO).
//Emergency patients are inserted at the front of the queue.
//Patients can cancel appointments.
//Staff can view all patients, check the next patient, or see who is last.
//The system prevents duplicate patient entries (based on ID)
import java.util.LinkedList;
import java.util.Scanner;
public class PatientQueuedemo 
{

	public static void main(String args[]) 
	{
		LinkedList<String> patientQueue=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n Hospital Patient Queue :");
			System.out.println("1. Add New Patient(normal)");
			System.out.println("2. Display emergency Pateints");
			System.out.println("3. callNextPatient");
			System.out.println("4. viewNextPatient");
			System.out.println("5. View All Patient");
			System.out.println("6. Remove Patient by Name");
			System.out.println("7. View first and last patient ");
			System.out.println("8.Exit ");
			System.out.println("Enter your choice :");
			choice=sc.nextInt();
			sc.nextLine();
		
	
         switch(choice)
         {
         case 1: 
        	   System.out.print("Enter your choice:");
        	   String patient=sc.nextLine();
        	   patientQueue.addLast(patient);
        	   System.out.println("Add to queue: ");
        	   break;
        	   
         case 2: 
      	   System.out.print("Enter emergency patient name:");
      	   String emergencyPatient=sc.nextLine();
      	   patientQueue.addLast(emergencyPatient);
      	   System.out.println("Emergency patinet added to front: ");
      	   break;
      	   
         case 3: if (!patientQueue.isEmpty()) 
         {
             System.out.println("Next patient: " + patientQueue.peek());
         } 
         else 
         {
             System.out.println("Queue is empty.");
         }
         
         case 4:
        	 if (!patientQueue.isEmpty()) 
        	 {
                 System.out.println("Next patient: " + patientQueue.peek());
             } 
        	 else 
             {
                 System.out.println("Queue is empty.");
             }
         case 5: 
        	 if(!patientQueue.isEmpty())
        	 {
        		 String remove= patientQueue.removeFirst();
        			System.out.println("Removed patient :" + remove );
        	 }
        	 else
        	 {
        		 System.out.print("No patinet in queue:");
        		 break;
        	 }
         case 6:
    		 System.out.print("Current Queue:"+patientQueue);
    		 break;
      	   
         case 7:
        	 if(!patientQueue.isEmpty())
        	 {
        		 System.out.println("First:"+patientQueue.getFirst());
        		 System.out.println("Last:"+patientQueue.getLast());
        	 }
        	 else
        	 {
        		 System.out.println("Queue is Empty");
        		
        	 }
        	 break;
         
         default:
        	 System.out.println("Invalid choice:");
         
	}
	}while(choice!=6);
	sc.close();
	}
}

