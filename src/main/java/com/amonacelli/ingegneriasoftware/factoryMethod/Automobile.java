package com.amonacelli.ingegneriasoftware.factoryMethod;

public abstract class Automobile {
    String carrozzeria;
    String motore;
    String interni;

    public void deliver(){
        System.out.println("The car is being delivered");
    }

    public void build(){
        System.out.println("The car is being built");
    }
}
