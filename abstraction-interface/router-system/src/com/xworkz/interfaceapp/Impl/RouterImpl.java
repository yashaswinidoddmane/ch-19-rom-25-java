package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.router.Router;

public class RouterImpl implements Router {
    @Override
    public void connect() {
        System.out.println("Router connected to internet");
    }
    @Override
    public void disconnect() {
        System.out.println("Router disconnected");
    }
    @Override
    public void reset() {
        System.out.println("Router reset performed");
    }
}

