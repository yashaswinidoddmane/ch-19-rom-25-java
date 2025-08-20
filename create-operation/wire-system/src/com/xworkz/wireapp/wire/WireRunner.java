package com.xworkz.wireapp.wire;

public class WireRunner {
    public static void main(String[] args){
        System.out.println("main started");
       Wire wire = new Wire();
//wire.wireId = 1;
//wire.wireBrand = "finolex";
       wire.setWireId(1);
       wire.setWireBrand("finolex");

       int wireId = wire.getWireId();
       String wireBrand = wire.getWireBrand();

      System.out.println("Wire Id is "+ wireId);
      System.out.println("Wire Brand is "+ wireBrand);

      System.out.println("main ended");
    }
}
