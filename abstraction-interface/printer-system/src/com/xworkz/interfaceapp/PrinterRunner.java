package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.PrinterImpl;
import com.xworkz.interfaceapp.printer.Printer;

public class PrinterRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Printer printer = new PrinterImpl();
        printer.copy();
        printer.print();
        printer.scan();
        System.out.println("main ended");
    }
}
