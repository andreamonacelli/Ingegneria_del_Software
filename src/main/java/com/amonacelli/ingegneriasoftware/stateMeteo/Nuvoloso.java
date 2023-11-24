package com.amonacelli.ingegneriasoftware.stateMeteo;

import java.util.Random;

public class Nuvoloso implements Meteo {
    StazioneMeteo meteoCorrente;

    public Nuvoloso(StazioneMeteo meteoCorrente) {
        this.meteoCorrente = meteoCorrente;
    }

    @Override
    public void previsione(double probabilita) {
        if(probabilita <= 0.3){
            migliora();
        } else if(probabilita <= 0.8){
            meteoCorrente.setMeteoCorrente(meteoCorrente.getMeteoNuvoloso());
        } else{
            peggiora();
        }
    }

    @Override
    public void migliora() {
        meteoCorrente.setMeteoCorrente(meteoCorrente.getMeteoSoleggiato());
    }

    @Override
    public void peggiora() {
        meteoCorrente.setMeteoCorrente(meteoCorrente.getMeteoPiovigginoso());
    }

    @Override
    public String toString() {
        return "Nuvoloso";
    }
}
