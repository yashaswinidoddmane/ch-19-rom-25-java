package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.printer.Printer;

public class PrinterImpl implements Printer {
    @Override
    public void print() {
        System.out.println("Printing document");
    }
    @Override
    public void scan() {
        System.out.println("Scanning document");
    }
    @Override
    public void copy() {
        System.out.println("Copying document");
    }
}
