package com.amonacelli.ingegneriasoftware.stateMeteo;

public class Nevoso implements Meteo{

    StazioneMeteo meteoCorrente;

    @Override
    public void previsione(double probabilita) {
        if(probabilita <= 0.8){
            migliora();
        } else if(probabilita <= 0.9){
            peggiora();
        }
    }

    @Override
    public void migliora() {
        meteoCorrente.setMeteoCorrente(meteoCorrente.getMeteoNuvoloso());
    }

    @Override
    public void peggiora() {
        meteoCorrente.setMeteoCorrente(meteoCorrente.getMeteoPiovigginoso());
    }

    @Override
    public String toString() {
        return "Nevoso";
    }
}
