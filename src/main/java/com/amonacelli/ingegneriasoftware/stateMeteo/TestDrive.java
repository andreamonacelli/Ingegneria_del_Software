package com.amonacelli.ingegneriasoftware.stateMeteo;

public class TestDrive {
    public static void main(String[] args) {
        StazioneMeteo stazioneMeteo = new StazioneMeteo();
        System.out.println(stazioneMeteo);
        stazioneMeteo.aggiornaMeteo();
        stazioneMeteo.aggiornaMeteo();
        stazioneMeteo.aggiornaMeteo();
        stazioneMeteo.aggiornaMeteo();
        stazioneMeteo.aggiornaMeteo();
        stazioneMeteo.aggiornaMeteo();
    }
}
