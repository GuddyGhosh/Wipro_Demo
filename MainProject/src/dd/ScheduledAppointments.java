package dd;



	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.Objects;
	import java.util.Scanner;
	import java.util.TreeSet;

	class Appointment implements Comparable<Appointment>
	{
	    private String patientName;
	    private LocalDateTime dateTime;

	    
	    public Appointment(String patientName, String dateTimeStr)
	    {
	        this.patientName = patientName.trim();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	        this.dateTime = LocalDateTime.parse(dateTimeStr.trim(), formatter);
	    }

	    public LocalDateTime getDateTime()
	    {
	        return dateTime;
	    }

	    public String getPatientName()
	    {
	        return patientName;
	    }

	    // Ensure no duplicate date-time appointments
	    @Override
	    public boolean equals(Object obj) 
	    {
	        if (this == obj) return true;
	        if (!(obj instanceof Appointment)) return false;
	        Appointment other = (Appointment) obj;
	        return this.dateTime.equals(other.dateTime);
	    }

	    
	    public int hashCode() {
	        return Objects.hash(dateTime);
	    }

	    
	    public int compareTo(Appointment other) {
	        return this.dateTime.compareTo(other.dateTime);
	    }

	    
	    public String toString() 
	    {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	        return "Appointment for " + patientName + " at " + dateTime.format(formatter);
	    }
	}

	public class ScheduledAppointments
	{
	     TreeSet<Appointment> appointments = new TreeSet<>();
	     Scanner sc = new Scanner(System.in);

	    public static void main(String[] args)
	    {
	        int choice;

	        do {
	            System.out.println(" Hospital Appointment Manager ");
	            System.out.println("1. Schedule Appointment");
	            System.out.println("2. View All Appointments");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = Integer.parseInt(sc.nextLine());

	            switch (choice)
	            {
	                case 1:
	                    scheduleAppointment();
	                    break;
	                case 2:
	                    viewAppointments();
	                    break;
	                case 3:
	                    System.out.println("Exiting appointment system.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        } while (choice != 3);
	    }

	    private static void scheduleAppointment() 
	    {
	        System.out.print("Enter Patient Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Appointment Date & Time (yyyy-MM-dd HH:mm): ");
	        String dateTime = sc.nextLine();

	        try
	        {
	            Appointment newApp = new Appointment(name, dateTime);
	            if (appointments.add(newApp)) 
	            {
	                System.out.println("✅ Appointment scheduled successfully.");
	            } 
	            else 
	            {
	                System.out.println("⚠️ Duplicate appointment! That slot is already taken.");
	            }
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("❌ Invalid date/time format. Use yyyy-MM-dd HH:mm");
	        }
	    }

	    private static void viewAppointments()
	    {
	        if (appointments.isEmpty())
	        {
	            System.out.println("No appointments scheduled.");
	        } 
	        else 
	        {
	            System.out.println("\n--- Scheduled Appointments (Chronological Order) ---");
	            for (Appointment app : appointments) 
	            {
	                System.out.println(app);
	            }
	        }
	    }
	}

}
