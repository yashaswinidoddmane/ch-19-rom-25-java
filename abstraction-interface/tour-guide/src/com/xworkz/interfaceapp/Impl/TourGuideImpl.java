package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.tourguide.ToureGuide;

public class TourGuideImpl implements ToureGuide {
    @Override
    public void welcomeTourists() {
        System.out.println("Tour guide welcoming tourists");
    }
    @Override
    public void explainPlace() {
        System.out.println("Tour guide explaining the place");
    }
    @Override
    public void endTour() {
        System.out.println("Tour guide ending the tour");
    }
}
