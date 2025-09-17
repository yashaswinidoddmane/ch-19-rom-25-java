package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.BlenderImpl;
import com.xworkz.interfaceapp.blender.Blender;

public class BlenderRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Blender blender = new BlenderImpl();
        blender.blend();
        blender.mix();
        blender.chop();
        System.out.println("main ended");
    }
}
