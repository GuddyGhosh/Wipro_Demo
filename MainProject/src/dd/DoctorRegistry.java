package dd;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;


class Doctor
{
    private String licenseNumber;
    private String name;
    private String department;

    public Doctor(String licenseNumber, String name, String department)
    {
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.department = department;
    }

    public String getLicenseNumber() 
    {
        return licenseNumber;
    }

    
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (!(obj instanceof Doctor)) return false;
        Doctor other = (Doctor) obj;
        return this.licenseNumber.equalsIgnoreCase(other.licenseNumber);
    }

    
    public int hashCode() 
    {
    	 return Objects.hash(licenseNumber.toLowerCase());
    }

    
    public String toString()
    {
        return "Doctor [License#: " + licenseNumber + ", Name: " + name + ", Department: " + department + "]";
    }
}

public class DoctorRegistry 
{
    private static HashSet<Doctor> doctorSet = new HashSet<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int choice;

        do {
            System.out.println(" Hospital Doctor Registration System ");
            System.out.println("1. Register New Doctor");
            System.out.println("2. View All Registered Doctors");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice)
            {
                case 1:
                    registerDoctor();
                    break;
                case 2:
                    showAllDoctors();
                    break;
                case 3:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);
    }

    private static void registerDoctor() 
    {
        System.out.print("Enter License Number: ");
        String license = sc.nextLine();
        System.out.print("Enter Doctor's Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        Doctor newDoctor = new Doctor(license, name, dept);
        if (doctorSet.add(newDoctor))
        {
            System.out.println(" Doctor registered successfully.");
        } 
        else 
        {
            System.out.println(" Already registered!");
        }
    }

    private static void showAllDoctors()
    {
        if (doctorSet.isEmpty())
        {
            System.out.println("No doctors registered yet.");
        } 
        else 
        {
            System.out.println(" Registered Doctors ");
            for (Doctor d : doctorSet)
            {
                System.out.println(d);
            }
        }
    }
}
