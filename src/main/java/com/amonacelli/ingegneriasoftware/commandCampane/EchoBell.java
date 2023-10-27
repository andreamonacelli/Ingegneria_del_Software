package com.amonacelli.ingegneriasoftware.commandCampane;

public class EchoBell extends BellDecorator{
    public Bell b;
    public EchoBell(Bell b){
        this.b = b;
    }

    @Override
    public String getSound() {
        return b.sound + " " + b.sound;
    }
}
