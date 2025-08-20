package com.xworkz.jacketapp.jacket;

public class JacketRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Jacket jacket = new Jacket();
        jacket.setJacketId(101);
        jacket.setBrand("Nike");
        jacket.setColor("Black");
        jacket.setSize('L');
        jacket.setPrice(2999.99);
        jacket.setMaterialType("Polyester");

        int id = jacket.getJacketId();
        String brand = jacket.getBrand();
        String color = jacket.getColor();
        char size = jacket.getSize();
        double price = jacket.getPrice();
        String material = jacket.getMaterialType();

        System.out.println("Jacket ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Material Type: " + material);

        System.out.println("Main ended");
    }
}

