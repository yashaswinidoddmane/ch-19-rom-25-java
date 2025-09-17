package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.chef.Chef;

public class ChefImpl implements Chef {
    @Override
    public void chopVegetables() {
        System.out.println("Chef is chopping vegetables");
    }
    @Override
    public void cookFood() {
        System.out.println("Chef is cooking food");
    }
    @Override
    public void plateDish() {
        System.out.println("Chef is plating the dish");
    }
}
