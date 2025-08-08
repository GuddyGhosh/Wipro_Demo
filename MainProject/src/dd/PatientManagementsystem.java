package dd;

import java.util.ArrayList;
import java.util.Scanner;

class Patient 
{
    String name;
    int age;
    String disease;

    public Patient(String name, int age, String disease)
    {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    	
    public String toString() 
    {
        return "Name: " + name + ", Age: " + age + ", Disease: " + disease;
    }
}

public class PatientManagementsystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patientList = new ArrayList<>();

        while (true)
        {
            System.out.println("\n--- Patient Management System ---");
            System.out.println("1. Add New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Patient by Index");
            System.out.println("4. Update Patient Disease");
            System.out.println("5. Remove Patient by Index");
            System.out.println("6. Remove Patient by Name");
            System.out.println("7. Check if Patient Exists");
            System.out.println("8. Show Total Patients");
            System.out.println("9. Clear All Records");
            System.out.println("10. Find First/Last Index of a Patient");
            System.out.println("11. Check if List is Empty");
            System.out.println("12. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
            {
                case 1: 
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter disease: ");
                    String disease = sc.nextLine();
                    patientList.add(new Patient(name, age, disease));
                    System.out.println("Patient added successfully.");
                    break;

                case 2: 
                    if (patientList.isEmpty()) {
                        System.out.println("No patient records found.");
                    } else {
                        System.out.println("\n-- All Patients --");
                        for (int i = 0; i < patientList.size(); i++) 
                        {
                            System.out.println(i + ": " + patientList.get(i));
                        }
                    }
                    break;

                case 3: 
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < patientList.size())
                    {
                        System.out.println("Patient: " + patientList.get(index));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4: 
                    System.out.print("Enter index of patient to update: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();
                    if (updateIndex >= 0 && updateIndex < patientList.size()) 
                    {
                        System.out.print("Enter new disease: ");
                        String newDisease = sc.nextLine();
                        patientList.get(updateIndex).disease = newDisease;
                        System.out.println("Patient disease updated.");
                    } else 
                    {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5: 
                    System.out.print("Enter index to remove: ");
                    int removeIndex = sc.nextInt();
                    if (removeIndex >= 0 && removeIndex < patientList.size()) 
                    {
                        patientList.remove(removeIndex);
                        System.out.println("Patient removed.");
                    } 
                    else
                    {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6: 
                    System.out.print("Enter patient name to remove: ");
                    String removeName = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < patientList.size(); i++) 
                    {
                        if (patientList.get(i).name.equalsIgnoreCase(removeName)) 
                        {
                            patientList.remove(i);
                            System.out.println("Patient removed.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 7: 
                    System.out.print("Enter name to check: ");
                    String searchName = sc.nextLine();
                    boolean exists = false;
                    for (Patient p : patientList) 
                    {
                        if (p.name.equalsIgnoreCase(searchName))
                        {
                            System.out.println("Patient exists: " + p);
                            exists = true;
                            break;
                        }
                    }
                    if (!exists)
                    {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 8: 
                    System.out.println("Total patients: " + patientList.size());
                    break;

                case 9: 
                    patientList.clear();
                    System.out.println("All patient records cleared.");
                    break;

                case 10: 
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();
                    int first = -1, last = -1;
                    for (int i = 0; i < patientList.size(); i++) 
                    {
                        if (patientList.get(i).name.equalsIgnoreCase(search)) 
                        {
                            if (first == -1) first = i;
                            last = i;
                        }
                    }
                    if (first != -1) 
                    {
                        System.out.println("First index: " + first + ", Last index: " + last);
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 11: 
                    System.out.println("List is empty: " + patientList.isEmpty());
                    break;

                case 12: 
                    System.out.println("Exiting system. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

