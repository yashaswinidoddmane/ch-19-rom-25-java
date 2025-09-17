package com.xworkz.interfaceapp;


import com.xworkz.interfaceapp.Impl.TourGuideImpl;
import com.xworkz.interfaceapp.tourguide.ToureGuide;

public class TourRunner {
    public static void main(String[] args){
        System.out.println("main started");
        ToureGuide toureGuide = new TourGuideImpl();
        toureGuide.endTour();
        toureGuide.explainPlace();
        toureGuide.welcomeTourists();
        System.out.println("main ended");
    }
}
