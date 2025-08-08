package dd;


import java.util.HashMap;
import java.util.Scanner;

public class PersonHashMapExmple
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> patients = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        
        patients.put(101, "Manisha");
        patients.put(102, "Priya");
        patients.put(103, "Charlie");

        
        patients.put(102, "Bobby"); 

        String patientName = patients.get(101);
        System.out.println("Patient with ID 101: " + patientName);

        
        String removed = patients.remove(103);
        System.out.println("Removed Patient with ID 103: " + removed);

        
        System.out.println("Listing Patients Manually:");
        System.out.println( patients.get(101));
        System.out.println( patients.get(102));
        System.out.println( patients.get(103)); 

        
        boolean exists = patients.containsKey(102);
        System.out.println("Is Patient with ID 102 present? " + exists);

       
        int total = patients.size();
        System.out.println("Total Patients: " + total);

        patients.clear();
        System.out.println("All patients cleared: " + patients.isEmpty());
    }
}
