package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.student.Student;

public class StudentImpl implements Student {
    @Override
    public void attendClass() {
        System.out.println("Student is attending class");
    }
    @Override
    public void study() {
        System.out.println("Student is studying");
    }
    @Override
    public void writeExam() {
        System.out.println("Student is writing exam");
    }
}
