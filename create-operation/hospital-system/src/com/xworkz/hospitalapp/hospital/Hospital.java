package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.validator.PatientValidator;

public class Hospital {
    Patient patient;

    public boolean admitPatient(Patient patient) {
        boolean isPatientAdmitted = false;
        boolean isPatientInfoValid = false;

        PatientValidator patientValidator = new PatientValidator();
        isPatientInfoValid = patientValidator.validatePatientInfo(patient);

        if (isPatientInfoValid) {
            this.patient = patient;
            isPatientAdmitted = true;
        }
        return isPatientAdmitted;
    }

    public void getPatientDetails() {
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Gender: " + patient.getGender());
        System.out.println("Disease: " + patient.getDisease());
        System.out.println("Admission Date: " + patient.getAdmissionDate());
        System.out.println("Discharge Date: " + patient.getDischargeDate());
        System.out.println("Doctor Assigned: " + patient.getDoctorAssigned());
        System.out.println("Contact Number: " + patient.getContactNumber());
    }
}
}
