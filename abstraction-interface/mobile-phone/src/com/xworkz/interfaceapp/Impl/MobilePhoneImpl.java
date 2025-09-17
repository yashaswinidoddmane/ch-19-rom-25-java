package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.mobilephone.MobilePhone;

public class MobilePhoneImpl implements MobilePhone {
    @Override
    public void call() {
        System.out.println("Making a call");
    }
    @Override
    public void sendMessage() {
        System.out.println("Sending a message");
    }
    @Override
    public void browseInternet() {
        System.out.println("Browsing the internet");
    }

}
