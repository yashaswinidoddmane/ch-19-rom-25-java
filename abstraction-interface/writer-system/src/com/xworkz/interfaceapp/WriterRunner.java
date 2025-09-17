package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.WriterImpl;
import com.xworkz.interfaceapp.writer.Writer;

public class WriterRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Writer writer = new WriterImpl();
        writer.publish();
        writer.edit();
        writer.writeDraft();
        System.out.println("main ended");
    }
}
