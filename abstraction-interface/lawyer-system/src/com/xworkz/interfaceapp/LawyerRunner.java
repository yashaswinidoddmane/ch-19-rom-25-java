package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.LawyerImpl;
import com.xworkz.interfaceapp.lawyer.Lawyer;

public class LawyerRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Lawyer lawyer = new LawyerImpl();
        lawyer.argueCase();
        lawyer.fileCase();
        lawyer.winCase();
        System.out.println("main ended");
    }
}
