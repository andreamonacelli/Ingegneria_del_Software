package com.amonacelli.ingegneriasoftware.commandCampane;

public class WindBell extends BellDecorator{
    public Bell b;
    public WindBell(Bell b){
        this.b = b;
    }

    @Override
    public String getSound() {
        return b.sound + " tic";
    }
}
