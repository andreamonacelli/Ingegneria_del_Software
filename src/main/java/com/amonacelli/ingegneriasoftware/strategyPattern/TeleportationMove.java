package com.amonacelli.ingegneriasoftware.strategyPattern;

public class TeleportationMove implements MovementType{
    @Override
    public void move() {
        System.out.println("Teleporting away");
    }
}
