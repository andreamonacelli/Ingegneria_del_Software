package com.amonacelli.ingegneriasoftware.abstractFactory;

public abstract class AutomobileStore {
    public AutomobileStore(AutomobilePartsFactory partsFactory) {
        /* da rivedere!!! */
        Automobile automobile;
        automobile = createCar();
        automobile.build();
        automobile.deliver();
    }

    protected abstract Automobile createCar();
}
