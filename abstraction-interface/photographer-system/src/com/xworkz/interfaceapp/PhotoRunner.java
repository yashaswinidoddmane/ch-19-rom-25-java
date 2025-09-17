package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.PhotographerImpl;
import com.xworkz.interfaceapp.photographer.Photographer;

public class PhotoRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Photographer photographer = new PhotographerImpl();
        photographer.editPhoto();
        photographer.takePhoto();
        photographer.setupCamera();
        System.out.println("main ended");
    }
}
