package com.amonacelli.ingegneriasoftware.factoryMethod;

public class USAAutoStore extends AutomobileStore{

    public USAAutoStore(String country) {
        super(country);
    }

    @Override
    protected Automobile createCar(String carType) {
        if(carType.equals("sportscar")){
            return new USASportsCar();
        } else if(carType.equals("citycar")){
            return new USACityCar();
        } else if(carType.equals("pickup")){
            return new USAPickup();
        } else{
            return null;
        }
    }
}
