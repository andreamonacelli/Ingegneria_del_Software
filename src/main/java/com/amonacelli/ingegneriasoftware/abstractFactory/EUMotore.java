package com.amonacelli.ingegneriasoftware.abstractFactory;

public class EUMotore extends Motore{

    @Override
    public void create() {
        this.nome = "Motore europeo";
    }
}
