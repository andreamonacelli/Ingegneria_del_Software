package com.amonacelli.ingegneriasoftware.templateToys;

public abstract class Fabbrica {
    public final void prepareToy(){
        prepareMaterial();
        fusioneMateriale();
        taglio();
        sorteggioBuonoOmaggio();
        impacchettamento();
    }

    public final void prepareMaterial(){
        System.out.println("Il materiale è stato preparato");
    }

    public final void fusioneMateriale(){
        System.out.println("Il materiale è stato fuso!");
    }

    public final void taglio(){
        System.out.println("Il materiale viene tagliato");
    }

    public final void impacchettamento(){
        System.out.println("Il giocattolo viene impacchettato");
    }

    public void sorteggioBuonoOmaggio(){};
}
