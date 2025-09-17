package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.HospitalImpl;
import com.xworkz.interfaceapp.hospital.Hospital;

public class HospitalRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Hospital hospital = new HospitalImpl();
        hospital.admitPatient();
        hospital.dischargePatient();
        hospital.treatPatient();
        System.out.println("main ended");
    }
}
