package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.writer.Writer;

public class WriterImpl implements Writer {
    @Override
    public void writeDraft() {
        System.out.println("Writer is writing a draft");
    }
    @Override
    public void edit() {
        System.out.println("Writer is editing the draft");
    }
    @Override
    public void publish() {
        System.out.println("Writer is publishing the book");
    }
}
