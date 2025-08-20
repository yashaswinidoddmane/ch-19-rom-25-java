 package com.xworkz.hospitalapp.validator;

import com.xworkz.hospital.app.Patient;
import com.xworkz.hospital.hos.Hospital;

public class HospitalRunner {
        public static void main(String args[]) {

            Patient patient = new Patient();
            patient.setName("Ramesh Kumar");
            patient.setAge(45);
            patient.setGender("Male");
            patient.setDisease("Pneumonia");
            patient.setAdmissionDate("12-Aug-2025");
            patient.setDischargeDate("20-Aug-2025");
            patient.setDoctorAssigned("Dr. Sharma");
            patient.setContactNumber("9876543210");

            Hospital hospital = new Hospital();
            boolean admitted = hospital.admitPatient(patient);

            if (admitted) {
                System.out.println("Patient admitted successfully");
                hospital.getPatientDetails();
            } else {
                System.out.println("Patient admission failed due to invalid details.");
            }
        }
    }
