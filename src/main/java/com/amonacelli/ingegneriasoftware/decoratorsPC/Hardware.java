package com.amonacelli.ingegneriasoftware.decoratorsPC;

public class Hardware extends ComponentDecorator{
    Computer computer;
    String name = "Hardware";
    double size = 4.25;
    double cost = 125.0;

    public Hardware(Computer computer){
        this.computer = computer;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + "\nHardware -> name: " + this.name + "size: " + this.size + " cost: " + this.cost;
    }

    @Override
    public double cost() {
        return computer.cost() + this.cost;
    }
}
