package com.amonacelli.ingegneriasoftware.commandCampane;

public abstract class PostBellSound {
    String sound;

    public String getSound(){
        return sound;
    }

    public abstract void playSound();
}
