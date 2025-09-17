package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.BankImpl;
import com.xworkz.interfaceapp.bank.Bank;

public class BankRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Bank bank = new BankImpl();
        bank.depositMoney();
        bank.openAccount();
        bank.withdrawMoney();
        System.out.println("main ended");
    }
}
