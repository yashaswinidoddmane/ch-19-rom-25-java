package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.laptop.Laptop;

public class LaptopImpl implements Laptop {
    @Override
    public void open() {
        System.out.println("Laptop opened");
    }
    @Override
    public void type() {
        System.out.println("Typing on laptop");
    }
    @Override
    public void close() {
        System.out.println("Laptop closed");
    }
}
