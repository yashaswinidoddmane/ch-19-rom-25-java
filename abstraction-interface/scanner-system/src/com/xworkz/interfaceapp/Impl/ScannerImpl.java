package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.scanner.Scanner;

public class ScannerImpl implements Scanner {
    public void scanDocument() {
        System.out.println("Document scanned");
    }
    public void saveFile() {
        System.out.println("File saved");
    }
    public void sendToEmail() {
        System.out.println("File sent via email");
    }
}
