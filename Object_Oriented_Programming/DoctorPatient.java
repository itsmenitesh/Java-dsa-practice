//package oops;
//
//import java.util.*;
//
//class Doctor {
//    public Integer id;
//    public Integer wallet;
//    public String name; // Changed the data type to String
//
//    Doctor(Integer id, Integer wallet, String name) {
//        this.id = id;
//        this.wallet = wallet;
//        this.name = name;
//    }
//}
//
//class Patient {
//    public Integer id;
//    public String name;
//
//    public Patient(String name, Integer id) {
//        this.name = name;
//        this.id = id;
//    }
//}
//
//public class DoctorPatient { // Changed class name to HelloWorld to match the file name
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // Doctor Initialization
//        Doctor doc1 = new Doctor(1, 0, "Doctor1");
//        Doctor doc2 = new Doctor(2, 0, "Doctor2");
//        Doctor doc3 = new Doctor(3, 0, "Doctor3");
//
//        // Patient
//        Patient pat1 = new Patient("Patient1", 101);
//        Patient pat2 = new Patient("Patient2", 102);
//        Patient pat3 = new Patient("Patient3", 103);
//        Patient pat4 = new Patient("Patient4", 104);
//        Patient pat5 = new Patient("Patient5", 105);
//
//        // doctorId, List of Patients
//        HashMap<Doctor, List<Patient>> hm = new HashMap<>();
//        List<Patient> list1 = new ArrayList<>();
//        List<Patient> list2 = new ArrayList<>();
//        List<Patient> list3 = new ArrayList<>();
//
//        list1.add(pat1);
//        list1.add(pat2);
//
//        list2.add(pat3);
//        list2.add(pat4);
//
//        list3.add(pat5);
//
//        hm.put(doc1, list1);
//        hm.put(doc2, list2);
//        hm.put(doc3, list3);
//
//        // Example of updating a doctor's wallet when a patient makes a payment
//        Doctor selectedDoctor = doc1; // Choose a doctor
//        Patient selectedPatient = pat1; // Choose a patient
//        int paymentAmount = 50; // Set the payment amount
//
//        hm = updatePayment(selectedDoctor, selectedPatient, paymentAmount, hm);
//
//        // Print the updated wallet balance for the selected doctor
//        System.out.println(selectedDoctor.name + "'s Updated Wallet Balance: $" + selectedDoctor.wallet);
//    }
//
//    public static HashMap<Doctor, List<Patient>> updatePayment(Doctor doctor, Patient patient, int amt,
//                                                               HashMap<Doctor, List<Patient>> hm) {
//
//        for (Doctor doc : hm.keySet()) {
//            if (doc.equals(doctor)) {
//                // Updating the wallet
//                doc.wallet = doc.wallet + amt;
//            }
//        }
//
//        return hm;
//    }
//}
//
