package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.library.Library;

public class LibraryImpl implements Library {
    @Override
    public void issueBook() {
        System.out.println("Book issued");
    }
    @Override
    public void returnBook() {
        System.out.println("Book returned");
    }
    @Override
    public void payFine() {
        System.out.println("Fine paid");
    }
}
