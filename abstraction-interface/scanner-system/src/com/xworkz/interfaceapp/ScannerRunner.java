package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.ScannerImpl;
import com.xworkz.interfaceapp.scanner.Scanner;

public class ScannerRunner {
    public static  void main(String[] args){
        System.out.println("main started");
        Scanner sc = new ScannerImpl();
        sc.saveFile();
        sc.scanDocument();
        sc.sendToEmail();
        System.out.println("main ended");
    }
}
