package com.amonacelli.ingegneriasoftware.commandDashButton;

public class DashButton {
    Command buttonCommand;

    public DashButton() {}

    public void setButtonCommand(Command buttonCommand) {
        this.buttonCommand = buttonCommand;
    }

    public void pressButton(){
        this.buttonCommand.execute();
    }
}
