package com.amonacelli.ingegneriasoftware.strategyPattern;

public class SubsonicBikeMove implements MovementType{
    @Override
    public void move() {
        System.out.println("Moving with Subsonic motorbike");
    }
}
