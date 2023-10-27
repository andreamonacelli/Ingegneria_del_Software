package com.amonacelli.ingegneriasoftware.commandCampane;

public class BellCommand extends BellDecorator implements Command{
    public Bell b;

    public BellCommand(Bell b) {
        this.b = b;
    }

    @Override
    public String execute() {
        return getSound();
    }

    @Override
    public String getSound() {
        return b.sound;
    }
}
