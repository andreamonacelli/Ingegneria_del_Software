package com.amonacelli.ingegneriasoftware.stateMeteo;

import java.util.Random;

public class Soleggiato implements Meteo {
    StazioneMeteo meteoCorrente;

    public Soleggiato(StazioneMeteo meteoCorrente) {
        this.meteoCorrente = meteoCorrente;
    }

    @Override
    public void previsione(double probabilita) {
        if(probabilita <= 0.5){
            migliora();
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
        meteoCorrente.setMeteoCorrente(meteoCorrente.getMeteoNuvoloso());
    }

    @Override
    public String toString() {
        return "Soleggiato";
    }
}
