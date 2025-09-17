package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.TeacherImpl;
import com.xworkz.interfaceapp.teacher.Teacher;

public class TeacherRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Teacher teacher = new TeacherImpl();
        teacher.checkHomework();
        teacher.prepareLesson();
        teacher.teachStudents();
        System.out.println("main ended");
    }
}
