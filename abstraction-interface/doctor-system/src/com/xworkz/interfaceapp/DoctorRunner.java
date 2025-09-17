package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.DoctorImpl;
import com.xworkz.interfaceapp.doctor.Doctor;

public class DoctorRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Doctor doctor = new DoctorImpl();
        doctor.diagnose();
        doctor.followUp();
        doctor.prescribeMedicine();
        System.out.println("main ended");
    }
}
