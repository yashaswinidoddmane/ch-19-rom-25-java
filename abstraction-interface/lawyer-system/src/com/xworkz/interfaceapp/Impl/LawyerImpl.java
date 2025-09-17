package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.lawyer.Lawyer;

public class LawyerImpl implements Lawyer {
    @Override
    public void fileCase() {
        System.out.println("Lawyer filed a case");
    }
    @Override
    public void argueCase() {
        System.out.println("Lawyer is arguing the case");
    }
    @Override
    public void winCase() {
        System.out.println("Lawyer won the case");
    }
}
