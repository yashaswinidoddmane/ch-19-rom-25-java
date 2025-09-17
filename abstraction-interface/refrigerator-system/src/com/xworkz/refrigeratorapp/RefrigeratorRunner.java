package com.xworkz.refrigeratorapp;

import com.xworkz.refrigeratorapp.Impl.RefrigeratorImpl;
import com.xworkz.refrigeratorapp.regrigerator.Refrigerator;

public class RefrigeratorRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Refrigerator fridge = new RefrigeratorImpl();
        fridge.freeze();
        fridge.storeFood();
        fridge.defrost();
        System.out.println("main ended");
    }
}
