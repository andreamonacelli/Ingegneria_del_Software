package com.amonacelli.ingegneriasoftware.factoryMethod;

public class EUAutoStore extends AutomobileStore{
    public EUAutoStore(String country) {
        super(country);
    }

    @Override
    protected Automobile createCar(String carType) {
        if(carType.equals("sportscar")){
            return new EUSportsCar();
        } else if(carType.equals("citycar")){
            return new EUCityCar();
        } else{
            return null;
        }
    }
}
