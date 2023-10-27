package com.amonacelli.ingegneriasoftware.strategyPattern;

public class LaserGunBehavior implements FightBehavior{
    @Override
    public void fight() {
        System.out.println("Using laser gun");
    }
}
