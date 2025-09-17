package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.doctor.Doctor;

public class DoctorImpl implements Doctor {
    @Override
    public void diagnose() {
        System.out.println("Doctor is diagnosing patient");
    }
    @Override
    public void prescribeMedicine() {
        System.out.println("Doctor is prescribing medicine");
    }
    @Override
    public void followUp() {
        System.out.println("Doctor is following up with patient");
    }
}
