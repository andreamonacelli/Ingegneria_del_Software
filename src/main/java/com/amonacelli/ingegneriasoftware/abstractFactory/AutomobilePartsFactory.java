package com.amonacelli.ingegneriasoftware.abstractFactory;

public interface AutomobilePartsFactory {
    public Carrozzeria createCarrozzeria();
    public Motore createMotore();
    public Interni createInterni();
}
