package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.RouterImpl;
import com.xworkz.interfaceapp.router.Router;

public class RouterRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Router router = new RouterImpl();
        router.connect();
        router.disconnect();
        router.reset();
        System.out.println("main ended");
    }
}
