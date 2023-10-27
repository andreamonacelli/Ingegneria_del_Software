package com.amonacelli.ingegneriasoftware.strategyPattern;

public class PlasmaRifleBehavior implements FightBehavior{
    @Override
    public void fight() {
        System.out.println("Using plasma rifle");
    }
}
