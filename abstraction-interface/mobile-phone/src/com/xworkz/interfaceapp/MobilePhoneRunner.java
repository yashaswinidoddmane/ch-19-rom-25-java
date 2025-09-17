package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.MobilePhoneImpl;
import com.xworkz.interfaceapp.mobilephone.MobilePhone;

public class MobilePhoneRunner {
    public static void main(String[] args){
        System.out.println("main started");
        MobilePhone mobilePhone = new MobilePhoneImpl();
        mobilePhone.browseInternet();
        mobilePhone.call();
        mobilePhone.sendMessage();
        System.out.println("main ended");
    }
}
