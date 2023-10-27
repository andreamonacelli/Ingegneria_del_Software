package com.amonacelli.ingegneriasoftware.commandCampane;

public abstract class SoundDecorator extends PostBellSound{
    PostBellSound postBellSound;

    public abstract String getSound();
}
