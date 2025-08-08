package dd;

import java.io.*;
import java.util.Scanner;

public class PatientFileHandler 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        String filename = "patient.txt";

        
        try {
            FileWriter writer = new FileWriter(filename, true); 
            writer.write(id + "," + name + "," + disease + "," + age + "\n");
            writer.close();
            System.out.println("\nPatient data saved to file successfully.\n");
        } 
        catch (IOException e)
        {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        
        System.out.println("Reading all patients from file:");
        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                System.out.println("ID: " + details[0] + ", Name: " + details[1] +", Disease: " + details[2] +", Age: " + details[3]);
                        
                        }
            reader.close();
        } 
        catch (IOException e)
        {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
