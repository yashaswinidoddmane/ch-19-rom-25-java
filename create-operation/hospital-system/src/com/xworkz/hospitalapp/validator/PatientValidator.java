package com.xworkz.hospitalapp.validator;
import com.xworkz.hospital.app.Patient;

public class PatientValidator {
        public boolean validatePatientInfo(Patient patient) {
            boolean patientValidated = false;

            boolean nameValid = false;
            boolean ageValid = false;
            boolean genderValid = false;
            boolean diseaseValid = false;
            boolean admissionDateValid = false;
            boolean doctorAssignedValid = false;
            boolean contactNumberValid = false;

            if (patient.getName() != null && !patient.getName().isEmpty()) {
                nameValid = true;
            } else {
                System.out.println("Patient name is not valid");
            }

            if (patient.getAge() > 0 && patient.getAge() < 120) {
                ageValid = true;
            } else {
                System.out.println("Age is not valid");
            }

            if (patient.getGender() != null && !patient.getGender().isEmpty()) {
                genderValid = true;
            } else {
                System.out.println("Gender is not valid");
            }

            if (patient.getDisease() != null && !patient.getDisease().isEmpty()) {
                diseaseValid = true;
            } else {
                System.out.println("Disease is not valid");
            }

            if (patient.getAdmissionDate() != null && !patient.getAdmissionDate().isEmpty()) {
                admissionDateValid = true;
            } else {
                System.out.println("Admission date is not valid");
            }

            if (patient.getDoctorAssigned() != null && !patient.getDoctorAssigned().isEmpty()) {
                doctorAssignedValid = true;
            } else {
                System.out.println("Doctor assigned is not valid");
            }

            if (patient.getContactNumber() != null && patient.getContactNumber().isEmpty() {
                contactNumberValid = true;
            } else {
                System.out.println("Contact number is not valid");
            }

            if (nameValid && ageValid && genderValid && diseaseValid && admissionDateValid && doctorAssignedValid && contactNumberValid) {
                patientValidated = true;
            }

            return patientValidated;
        }
    }


