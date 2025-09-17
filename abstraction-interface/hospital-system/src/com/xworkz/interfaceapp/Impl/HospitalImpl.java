package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.hospital.Hospital;

public class HospitalImpl implements Hospital {
    @Override
    public void admitPatient() {
        System.out.println("Patient admitted");
    }
    @Override
    public void treatPatient() {
        System.out.println("Patient treated");
    }
    @Override
    public void dischargePatient() {
        System.out.println("Patient discharged");
    }
}
