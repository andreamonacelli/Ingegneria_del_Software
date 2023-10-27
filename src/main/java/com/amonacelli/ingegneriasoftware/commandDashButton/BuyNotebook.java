package com.amonacelli.ingegneriasoftware.commandDashButton;

public class BuyNotebook implements Command{

    int notebookCount;

    public BuyNotebook(int notebookCount){
        this.notebookCount = notebookCount;
    }

    @Override
    public void execute() {
        System.out.println(this.notebookCount);
        this.notebookCount = Math.max(0, this.notebookCount - 1);
        System.out.println(this.notebookCount);
    }
}
