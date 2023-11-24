package com.amonacelli.ingegneriasoftware.proxyPattern;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
 
    public static void main(String[] args) {
        //String[] location = {"rmi://127:0:0:1/gumballmachine",
        //                     "rmi://boulder.mightygumball.com/gumballmachine",
        //                     "rmi://seattle.mightygumball.com/gumballmachine"}; 
 
        //GumballMonitor[] monitor = new GumballMonitor[location.length];
 
        //for (int i=0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = 
                        (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1/" + args[0] + "/gumballmachine");
                GumballMonitor monitor = new GumballMonitor(machine);
                //monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor);
                monitor.report();
            } catch (Exception e) {
                e.printStackTrace();
            }
       // }
 
 //       for (int i=0; i < monitor.length; i++) {
 //           monitor[i].report();
 //       }
    
    }
}

