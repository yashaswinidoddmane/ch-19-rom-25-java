package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.SchoolImpl;
import com.xworkz.interfaceapp.school.School;

public class SchoolRunner {
    public static void main(String[] args){
        System.out.println("main started");
        School school = new SchoolImpl();
        school.conductClass();
        school.declareResult();
        school.holdExam();
        System.out.println("main ended");
    }
}
