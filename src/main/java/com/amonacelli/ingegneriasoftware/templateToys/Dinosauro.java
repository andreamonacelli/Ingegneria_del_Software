package com.amonacelli.ingegneriasoftware.templateToys;

import java.util.Random;

public class Dinosauro extends Fabbrica {

    @Override
    public void sorteggioBuonoOmaggio() {
        Random random = new Random();
        int probabilita = random.nextInt(0,10);
        if(probabilita < 1){
            System.out.println("COMPLIMENTI Hai vinto!");
        } else{
            System.out.println("Peccaaaaaato");
        }
    }
}
