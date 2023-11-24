package com.amonacelli.ingegneriasoftware.compositeToyFactory;

public class Cane extends ToyItem{
    @Override
    public String getToyType() {
        return "Cane";
    }

    @Override
    public String getToyName() {
        return "Basic Doggo";
    }

    @Override
    public double getPrice() {
        return 4.50;
    }

    @Override
    public void print(){
        System.out.println("Toy: " + getToyType() + " - " + getToyName() + " Prezzo: " + getPrice());
    }
}
