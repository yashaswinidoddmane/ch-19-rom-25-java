package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.journalist.Journalist;

public class JournalistImpl implements Journalist {
    @Override
    public void collectNews() {
        System.out.println("Journalist is collecting news");
    }
    @Override
    public void writeArticle() {
        System.out.println("Journalist is writing an article");
    }
    @Override
    public void publishNews() {
        System.out.println("Journalist published the news");
    }
}
