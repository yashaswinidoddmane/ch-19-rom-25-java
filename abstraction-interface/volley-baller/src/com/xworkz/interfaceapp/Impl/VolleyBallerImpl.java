package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.volleyballer.VolleyBaller;

public class VolleyBallerImpl implements VolleyBaller {
    @Override
    public void serveBall() {
        System.out.println("Volleyball player serving the ball");
    }
    @Override
    public void block() {
        System.out.println("Volleyball player blocking the ball");
    }
    @Override
    public void spike() {
        System.out.println("Volleyball player spiking the ball"); }
}
