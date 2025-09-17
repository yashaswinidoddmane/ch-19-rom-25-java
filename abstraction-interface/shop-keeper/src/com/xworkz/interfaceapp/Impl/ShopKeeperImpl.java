package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.shopkeeper.ShopKeeper;

public class ShopKeeperImpl implements ShopKeeper {
    @Override
    public void openShop() {
        System.out.println("Shopkeeper opened the shop");
    }
    @Override
    public void sellProduct() {
        System.out.println("Shopkeeper sold a product");
    }
    @Override
    public void closeShop() {
        System.out.println("Shopkeeper closed the shop");
    }
}
