package com.amonacelli.ingegneriasoftware.commandPattern;

public class CookBreadCommand implements Command{

    String breadState;

    public CookBreadCommand(String breadState){
        this.breadState = breadState;
    }

    @Override
    public void execute() {
        System.out.println(this.breadState);
        this.breadState = "Cooked";
        System.out.println(this.breadState);
    }
}
