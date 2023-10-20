package com.amonacelli.ingegneriasoftware.abstractFactory;

public class EUAutomobileStore extends AutomobileStore{
    public EUAutomobileStore(AutomobilePartsFactory partsFactory) {
        super(partsFactory);
    }

    @Override
    protected Automobile createCar() {
        Automobile automobile = null;
        AutomobilePartsFactory partsFactory = new EUPartsFactory();

        return null;
    }
}
