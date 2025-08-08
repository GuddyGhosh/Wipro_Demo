package sd;


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

// PatientService.java
interface PatientService {
    void registerPatient(Patient patient);
    void showAllPatients();
}

// PatientServiceImpl.java
class PatientServiceImpl implements PatientService {
    private Patient[] patients;
    private int count;

    public PatientServiceImpl(int size) {
        patients = new Patient[size];
        count = 0;
    }

    @Override
    public void registerPatient(Patient patient) {
        if (count < patients.length) {
            patients[count++] = patient;
            System.out.println("Patient registered successfully.");
        } else {
            System.out.println("Patient list is full. Cannot register more patients.");
        }
    }

    @Override
    public void showAllPatients() {
        System.out.println("Displaying all patient details:");
        for (int i = 0; i < count; i++) {
            patients[i].displayDetails();
        }
    }
}
