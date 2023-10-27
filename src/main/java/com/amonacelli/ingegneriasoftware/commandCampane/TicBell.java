package com.amonacelli.ingegneriasoftware.commandCampane;

public class TicBell extends BellDecorator{
    public Bell b;
    public TicBell(Bell b){
        this.b = b;
    }

    @Override
    public String getSound() {
        return b.sound + " tic";
    }
}
