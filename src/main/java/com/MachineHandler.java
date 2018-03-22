package com;

import java.util.ArrayList;
import java.util.HashMap;

public class MachineHandler {

    private HashMap<Integer, Vending_Machine> handler = new HashMap<Integer, Vending_Machine>();

    public HashMap<Integer, Vending_Machine> getHandler() {
        return handler;
    }

    public void addMachine(Vending_Machine machine){
        handler.put(machine.ID,machine);
    }

    public Vending_Machine findMachine(int key){
        return handler.get(key);
    }

    public ArrayList<Integer> findMachinesbyLocation(String location){
        ArrayList<Integer> foundMachines = new ArrayList<>();

        for(Vending_Machine object: handler.values()){
            if(object.location.equals(location)){
                foundMachines.add(object.ID);
            }
        }

        return foundMachines;
    }


}