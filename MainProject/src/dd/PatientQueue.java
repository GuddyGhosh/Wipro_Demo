package dd;


		import java.util.LinkedList;

		import java.util.Scanner;



		public class PatientQueue {



			

			 public static void main(String[] args) {

			        LinkedList<String> patientQueue = new LinkedList<>();

			        Scanner sc = new Scanner(System.in);

			        int choice;



			        do {

			            System.out.println("\n--- Hospital Queue ---");

			            System.out.println("1. Add Patient");

			            System.out.println("2. Cancel Appointment");

			            System.out.println("3. View All Patients");

			            System.out.println("4. View Next Patient");

			            System.out.println("5. View Last Patient");

			            System.out.println("6. Exit");

			            System.out.print("Enter your choice: ");

			            choice = Integer.parseInt(sc.nextLine());



			            switch (choice) {

			                case 1:

			                    System.out.print("Enter patient ID: ");

			                    String id = sc.nextLine();



			                    boolean duplicate = false;

			                    for (String patient : patientQueue) {

			                        if (patient.startsWith(id + " -")) {

			                            duplicate = true;

			                            break;

			                        }

			                    }



			                    if (duplicate) {

			                        System.out.println("Patient with ID " + id + " already exists.");

			                        break;

			                    }



			                    System.out.print("Enter patient name: ");

			                    String name = sc.nextLine();



			                    System.out.print("Is it an emergency? (yes/no): ");

			                    String emergency = sc.nextLine();



			                    String entry = id + " - " + name;



			                    if (emergency.equalsIgnoreCase("yes")) {

			                        patientQueue.add(0, entry);

			                        System.out.println("Emergency patient added to the front.");

			                    } 
			                    else 
			                    {

			                        patientQueue.add(entry);

			                        System.out.println("Patient added to the end of the queue.");

			                    }

			                    break;



			                case 2:

			                    System.out.print("Enter patient ID to cancel: ");

			                    String cancelId = sc.nextLine();

			                    boolean removed = false;



			                    for (int i = 0; i < patientQueue.size(); i++) {

			                        if (patientQueue.get(i).startsWith(cancelId + " -")) {

			                            patientQueue.remove(i);

			                            removed = true;

			                            System.out.println("Patient with ID " + cancelId + " has been removed.");

			                            break;

			                        }

			                    }



			                    if (!removed)
			                    {

			                System.out.println("No patient found with ID " + cancelId + ".");

			                    }

			                    break;



			                case 3:

			                    if (patientQueue.isEmpty()) {

			                        System.out.println("The queue is empty.");

			                    } else {

			                        System.out.println("Patients in queue:");

			                        for (String patient : patientQueue) {

			                            System.out.println(patient);

			                        }

			                    }

			                    break;



			                case 4:

			                    if (patientQueue.size() > 0) {

			                        System.out.println("Next patient: " + patientQueue.get(0));

			                    } else {

			                        System.out.println("Queue is empty.");

			                    }

			                    break;



			                case 5:

			                    if (patientQueue.size() > 0) {

			                        System.out.println("Last patient: " + patientQueue.get(patientQueue.size() - 1));

			                    } else {

			                        System.out.println("Queue is empty.");

			                    }

			                    break;



			                case 6:

			                    System.out.println("Exiting system...");

			                    break;



			                default:

			                    System.out.println("Invalid choice. Try again.");

			            }

			        } while (choice != 6);



			        sc.close();

			    }

			}
	


