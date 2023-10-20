package com.amonacelli.ingegneriasoftware.commandPattern;

public class DashButtonTest {
    public static void main(String[] args) {
        DashButton dashButton = new DashButton();
        /* testing the notebook command */
        dashButton.setButtonCommand(new BuyNotebook(25));
        dashButton.pressButton();
        /* testing the bread command */
        dashButton.setButtonCommand(new CookBreadCommand("Raw"));
        dashButton.pressButton();
    }
}
