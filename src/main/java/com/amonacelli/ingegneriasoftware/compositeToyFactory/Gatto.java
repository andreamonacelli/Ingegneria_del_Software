package com.amonacelli.ingegneriasoftware.compositeToyFactory;

public class Gatto extends ToyItem{
    @Override
    public String getToyType() {
        return "Gatto";
    }

    @Override
    public String getToyName() {
        return "Basic Lil Cat";
    }

    @Override
    public double getPrice() {
        return 3.50;
    }
}
