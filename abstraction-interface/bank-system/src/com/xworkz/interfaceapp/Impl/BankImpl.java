package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.bank.Bank;

public class BankImpl implements Bank {
    @Override
    public void openAccount() {
        System.out.println("Bank account opened");
    }
    @Override
    public void depositMoney() {
        System.out.println("Money deposited");
    }
    @Override
    public void withdrawMoney() {
        System.out.println("Money withdrawn");
    }
}
