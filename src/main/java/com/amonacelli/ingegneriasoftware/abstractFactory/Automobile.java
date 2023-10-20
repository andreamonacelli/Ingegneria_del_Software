package com.amonacelli.ingegneriasoftware.abstractFactory;

public abstract class Automobile {
    Carrozzeria carrozzeria;
    Motore motore;
    Interni interni;

    public void deliver(){
        System.out.println("The car is being delivered");
    }

    public void build(){
        System.out.println("The car is being built");
        this.carrozzeria.create();
        this.interni.create();
        this.motore.create();
    }
}
