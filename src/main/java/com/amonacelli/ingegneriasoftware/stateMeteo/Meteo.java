package com.amonacelli.ingegneriasoftware.stateMeteo;

public interface Meteo {
    public void previsione(double probabilita);
    public void migliora();
    public void peggiora();
}
