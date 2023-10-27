package com.amonacelli.ingegneriasoftware.adapterCampane;

import com.amonacelli.ingegneriasoftware.commandCampane.*;

public class CampanaBeep extends Bell {
    public CampanaBeep(){
        sound = "beep";
    }

    public String getSuono(){
        return getSound();
    }
}
