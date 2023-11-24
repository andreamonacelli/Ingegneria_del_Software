package com.amonacelli.ingegneriasoftware.stateMeteo;

import java.util.Random;

public class StazioneMeteo {
    Meteo meteoSoleggiato;
    Meteo meteoNuvoloso;
    Meteo meteoPiovigginoso;
    Meteo meteoNevoso;
    Meteo meteoCorrente;
    Random random = new Random();

    public StazioneMeteo() {
        meteoSoleggiato = new Soleggiato(this);
        meteoNuvoloso = new Nuvoloso(this);
        meteoPiovigginoso = new Piovigginoso(this);

        int current = random.nextInt(0, 3);
        switch (current) {
            case 1:
                meteoCorrente = new Nuvoloso(this);
                break;
            case 2:
                meteoCorrente = new Piovigginoso(this);
                break;
            default:
                meteoCorrente = new Soleggiato(this);
                break;
        }
    }

    public void setMeteoCorrente(Meteo meteoCorrente) {
        this.meteoCorrente = meteoCorrente;
    }

    public Meteo getMeteoSoleggiato() {
        return meteoSoleggiato;
    }

    public Meteo getMeteoNuvoloso() {
        return meteoNuvoloso;
    }

    public Meteo getMeteoPiovigginoso() {
        return meteoPiovigginoso;
    }

    public Meteo getMeteoNevoso(){
        return meteoNevoso;
    }

    public void aggiornaMeteo(){
        double probabilita = random.nextDouble();
        meteoCorrente.previsione(probabilita);
        System.out.println("Meteo aggiornato: " + meteoCorrente);
    }

    @Override
    public String toString() {
        return "Meteo Corrente: " + meteoCorrente;
    }
}
