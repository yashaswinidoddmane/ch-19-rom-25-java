package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.GamingConsoleImpl;
import com.xworkz.interfaceapp.gamingconsole.GamingConsole;

public class GamingRunner {
    public static void main(String[] args){
        System.out.println("main started");
        GamingConsole gamingConsole = new GamingConsoleImpl();
        gamingConsole.quitGame();
        gamingConsole.startGame();
        gamingConsole.saveProgress();
        System.out.println("main ended");
    }
}
