package com.amonacelli.ingegneriasoftware.proxyPattern;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = null;

		int count = 0;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
        	count = Integer.parseInt(args[1]);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		//try{
//		String[] location = {"rmi://127.0.0.1/gumballmachine"}; 

//GumballMonitor[] monitor = new GumballMonitor[location.length];

       // GumballMachine gumballMachine = new GumballMachine(args[0], count);

		
		try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("rmi://127.0.0.1/" + args[0] + "/gumballmachine", gumballMachine);
            System.out.println(gumballMachine);
            gumballMachine.insertQuarter();
    		gumballMachine.turnCrank();
    		gumballMachine.insertQuarter();
    		gumballMachine.turnCrank();
    		

    		System.out.println(gumballMachine);

        } catch (Exception e) {
            e.printStackTrace();
        }
 }
}	
