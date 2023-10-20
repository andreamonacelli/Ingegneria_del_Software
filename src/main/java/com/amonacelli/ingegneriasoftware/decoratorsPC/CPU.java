package com.amonacelli.ingegneriasoftware.decoratorsPC;

public class CPU extends ComponentDecorator{
    Computer computer;
    String name = "CPU";
    String description = "This is a CPU";
    double cost = 125.0;

    public CPU(Computer computer){
        this.computer = computer;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + "\nCPU -> name: " + this.name + " description: " + this.description + " cost: " + this.cost;
    }

    @Override
    public double cost() {
        return computer.cost() + this.cost;
    }
}
