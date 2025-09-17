package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.gamingconsole.GamingConsole;

public class GamingConsoleImpl implements GamingConsole {
    @Override
    public void startGame() {
        System.out.println("Game started");
    }
    @Override
    public void saveProgress() {
        System.out.println("Game progress saved");
    }
    @Override
    public void quitGame() {
        System.out.println("Game exited");
    }

}
