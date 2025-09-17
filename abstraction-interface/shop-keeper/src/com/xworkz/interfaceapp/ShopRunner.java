package com.xworkz.interfaceapp;


import com.xworkz.interfaceapp.Impl.ShopKeeperImpl;
import com.xworkz.interfaceapp.shopkeeper.ShopKeeper;

public class ShopRunner {
    public static void main(String[] args){
        System.out.println("main started");
        ShopKeeper shopKeeper = new ShopKeeperImpl();
        shopKeeper.closeShop();
        shopKeeper.openShop();
        shopKeeper.sellProduct();
        System.out.println("main ended");
    }
}
