package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.teacher.Teacher;

public class TeacherImpl implements Teacher {
    @Override
    public void prepareLesson() {
        System.out.println("Teacher is preparing a lesson");
    }
    @Override
    public void teachStudents() {
        System.out.println("Teacher is teaching students");
    }
    @Override
    public void checkHomework() {
        System.out.println("Teacher is checking homework");
    }

}
