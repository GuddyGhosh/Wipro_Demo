package dd;

/*✅ Use Case: Patient Appointment Scheduler in Hospital (Using TreeMap)
🎯 Scenario:
In a hospital system, patient appointments must be stored in sorted order based on their appointment time (or ID, or any other natural order). Doctors and staff should be able to:
Add appointments
View all scheduled appointments in order
Remove a specific appointment
Reschedule an appointment
Check the next or last appointment
 */
public class Classroom 
{
 private 

for(Map.Entry<Integer,String>entry:patientMap.entrySet())
{
	System.out.print("\nID:"+entry.getKey()+"->"+entry.getvalue());
}