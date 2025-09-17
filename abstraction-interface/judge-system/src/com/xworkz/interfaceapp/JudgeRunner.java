package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.JudgeImpl;
import com.xworkz.interfaceapp.judge.Judge;

public class JudgeRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Judge judge = new JudgeImpl();
        judge.closeCase();
        judge.giveVerdict();
        judge.hearCase();
        System.out.println("main ended");
    }
}
