package dd;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class patientmngt 
{
    private String id;
    private String name;
    private String disease;

    public patientmngt(String id, String name, String disease) 
    {
        this.id = id.trim();
        this.name = name.trim();
        this.disease = disease.trim();
    }

    public String getId()
    {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof patientmngt)) return false;
        patientmngt patient = (patientmngt) o;
        return id.equalsIgnoreCase(patient.id);  // Compare only by ID
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id.toLowerCase()); // Case-insensitive hash
    }

    @Override
    public String toString()
    {
        return "Patient ID: " + id + ", Name: " + name + ", Disease: " + disease;
    }
}

public class HospitalSystem 
{
    private static HashSet<patientmngt> patients = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int choice;
        do {
            System.out.println("\n--- Hospital Patient Registration System ---");
            System.out.println("1. Register New Patient");
            System.out.println("2. View All Registered Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) 
            {
                case 1:
                    registerPatient();
                    break;
                case 2:
                    viewAllPatients();
                    break;
                case 3:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        } while (choice != 3);
    }

    private static void registerPatient() 
    {
        System.out.print("Enter Patient ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Disease: ");
        String disease = scanner.nextLine();

        patientmngt newPatient = new patientmngt(id, name, disease);
        if (patients.add(newPatient)) 
        {
            System.out.println("Patient registered successfully.");
        } 
        else
        {
            System.out.println("Duplicate patient ID! Registration failed.");
        }
    }

    private static void viewAllPatients() 
    {
        if (patients.isEmpty())
        {
            System.out.println("No patients registered.");
        } 
        else 
        {
            System.out.println("\n--- Registered Patients ---");
            for (patientmngt patient : patients) 
            {
                System.out.println(patient);
            }
        }
    }
}

