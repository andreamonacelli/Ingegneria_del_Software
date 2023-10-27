package com.amonacelli.ingegneriasoftware.strategyPattern;

public class InterstellarShipMove implements MovementType{
    @Override
    public void move() {
        System.out.println("Moving with interstellar ship");
    }
}
