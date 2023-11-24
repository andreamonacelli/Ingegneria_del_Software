package com.amonacelli.ingegneriasoftware.stateMeteo;

import java.util.Random;

public class Piovigginoso implements Meteo {
    StazioneMeteo meteoCorrente;

    public Piovigginoso(StazioneMeteo meteoCorrente) {
        this.meteoCorrente = meteoCorrente;
    }

    @Override
    public void previsione(double probabilita) {
        if(probabilita <= 0.2){
            meteoCorrente.setMeteoCorrente(meteoCorrente.getMeteoPiovigginoso());
        } else if(probabilita <= 0.9){
            migliora();
        } else{
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
        return "Piovigginoso";
    }
}
