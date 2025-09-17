package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.JournalistImpl;
import com.xworkz.interfaceapp.journalist.Journalist;

public class JournalistRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Journalist journalist = new JournalistImpl();
        journalist.collectNews();
        journalist.publishNews();
        journalist.writeArticle();
        System.out.println("main ended");
    }
}
