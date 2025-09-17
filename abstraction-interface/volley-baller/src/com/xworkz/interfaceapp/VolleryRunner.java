package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.VolleyBallerImpl;
import com.xworkz.interfaceapp.volleyballer.VolleyBaller;

public class VolleryRunner {
    public static void main(String[] args){
        System.out.println("main started");
        VolleyBaller volleyBaller = new VolleyBallerImpl();
        volleyBaller.block();
        volleyBaller.serveBall();
        volleyBaller.spike();
        System.out.println("main ended");
    }
}
