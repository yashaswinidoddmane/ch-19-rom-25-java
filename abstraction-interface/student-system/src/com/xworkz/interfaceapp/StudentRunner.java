package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.StudentImpl;
import com.xworkz.interfaceapp.student.Student;

public class StudentRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Student student = new StudentImpl();
        student.attendClass();
        student.study();
        student.writeExam();
        System.out.println("main ended");
    }
}
