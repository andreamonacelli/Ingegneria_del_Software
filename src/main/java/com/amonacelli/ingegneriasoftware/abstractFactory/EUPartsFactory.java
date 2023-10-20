package com.amonacelli.ingegneriasoftware.abstractFactory;

public class EUPartsFactory implements AutomobilePartsFactory{

    @Override
    public Carrozzeria createCarrozzeria() {
        return new EUCarrozzeria();
    }

    @Override
    public Motore createMotore() {
        return new EUMotore();
    }

    @Override
    public Interni createInterni() {
        return new EUInterni();
    }
}
