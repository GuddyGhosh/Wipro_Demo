package sd;

//Patient.java
class Patient {
 private int id;
 private String name;
 private int age;
 private String disease;

 // Constructor
 public Patient(int id, String name, int age, String disease) {
     this.id = id;
     this.name = name;
     this.age = age;
     this.disease = disease;
 }

 // Method to display patient details
 public void displayDetails() {
     System.out.println("Patient ID: " + id);
     System.out.println("Name     : " + name);
     System.out.println("Age      : " + age);
     System.out.println("Disease  : " + disease);
     System.out.println("-------------------------");
 }
}
