package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.ChefImpl;
import com.xworkz.interfaceapp.chef.Chef;

public class ChefRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Chef chef = new ChefImpl();
        chef.chopVegetables();
        chef.cookFood();
        chef.plateDish();
        System.out.println("main ended");
    }
}
