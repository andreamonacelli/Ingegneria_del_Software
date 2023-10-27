package com.amonacelli.ingegneriasoftware.strategyPattern;

public class PoisonousBlobBehavior implements FightBehavior{
    @Override
    public void fight() {
        System.out.println("Using poisonous blob");
    }
}
