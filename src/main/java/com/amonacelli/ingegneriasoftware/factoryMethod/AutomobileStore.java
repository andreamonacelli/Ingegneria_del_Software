package com.amonacelli.ingegneriasoftware.factoryMethod;

public abstract class AutomobileStore {
    public AutomobileStore(String country) {
        Automobile automobile;
        automobile = createCar(country);
        automobile.build();
        automobile.deliver();
    }

    protected abstract Automobile createCar(String country);
}
