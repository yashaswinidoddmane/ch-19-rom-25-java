package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.LibraryImpl;
import com.xworkz.interfaceapp.library.Library;

public class LibraryRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Library library = new LibraryImpl();
        library.issueBook();
        library.payFine();
        library.returnBook();
        System.out.println("main ended");
    }
}
