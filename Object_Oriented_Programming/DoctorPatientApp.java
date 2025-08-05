package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Doctor {
    public Integer id;
    public Integer wallet;
    public String name;
    public List<Patient> patients;

    Doctor(Integer id, Integer wallet, String name) {
        this.id = id;
        this.wallet = wallet;
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient, Integer payment) {
        this.patients.add(patient);
        this.wallet += payment;
    }
}

class Patient {
    public Integer id;
    public String name;

    Patient(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}

class DoctorComparator implements Comparator<Doctor> {
    @Override
    public int compare(Doctor doctor1, Doctor doctor2) {
        return doctor2.wallet.compareTo(doctor1.wallet);
    }
}

public class DoctorPatientApp {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor(1, 0, "Dr. Smith");
        Doctor doctor2 = new Doctor(2, 0, "Dr. Johnson");

        Patient patient1 = new Patient(101, "Alice");
        Patient patient2 = new Patient(102, "Bob");
        Patient patient3 = new Patient(103, "Charlie");

        doctor1.addPatient(patient1, 50);
        doctor1.addPatient(patient2, 75);
        doctor2.addPatient(patient3, 60);

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(doctor1);
        doctors.add(doctor2);

        Collections.sort(doctors, new DoctorComparator());

        for (Doctor doctor : doctors) {
            System.out.println("Doctor " + doctor.name + " (ID: " + doctor.id + ")");
            System.out.println("Total Earnings: $" + doctor.wallet);
            System.out.println("Patients:");
            for (Patient patient : doctor.patients) {
                System.out.println("- " + patient.name);
            }
            System.out.println();
        }
    }
}
