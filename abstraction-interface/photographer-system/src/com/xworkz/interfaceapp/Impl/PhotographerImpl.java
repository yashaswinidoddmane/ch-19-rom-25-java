package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.photographer.Photographer;

public class PhotographerImpl implements Photographer {
    @Override
    public void setupCamera() {
        System.out.println("Photographer setting up camera");
    }
    @Override
    public void takePhoto() {
        System.out.println("Photographer taking a photo");
    }
    @Override
    public void editPhoto() {
        System.out.println("Photographer editing the photo");
    }
}
