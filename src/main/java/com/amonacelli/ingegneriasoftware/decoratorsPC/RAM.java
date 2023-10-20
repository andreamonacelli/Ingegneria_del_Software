package com.amonacelli.ingegneriasoftware.decoratorsPC;

public class RAM extends ComponentDecorator {
    Computer computer;
    String name = "RAM";
    double size = 4.25;
    double cost = 125.0;

    public RAM(Computer computer){
        this.computer = computer;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + "\nRAM -> name: " + this.name + "size: " + this.size + " cost: " + this.cost;
    }

    @Override
    public double cost() {
        return computer.cost() + this.cost;
    }
}
