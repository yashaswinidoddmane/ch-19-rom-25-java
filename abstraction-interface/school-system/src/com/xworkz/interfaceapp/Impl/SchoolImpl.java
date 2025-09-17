package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.school.School;

public class SchoolImpl implements School {
    @Override
    public void conductClass() {
        System.out.println("Class conducted");
    }
    @Override
    public void holdExam() {
        System.out.println("Exam held");
    }
    @Override
    public void declareResult() {
        System.out.println("Results declared");
    }
}
