package com

import spock.lang.Specification


class CoinsInMachineSpec extends Specification {

    def "check coins in machine"(){
        given: 'all machines'

        HashMap<Integer, Vending_Machine> handler = new HashMap<Integer, Vending_Machine>();

        Vending_Machine shakirasIphone = new Vending_Machine(0001, "Atlanta")
        Vending_Machine newMachine1 = new Vending_Machine(0002, "Atlanta")
        Vending_Machine newMachine2 = new Vending_Machine(0003, "Chattanooga")
        Vending_Machine newMachine3 = new Vending_Machine(0004, "Atlanta")
        Vending_Machine newMachine4 = new Vending_Machine(0005, "Starkville")

        handler.put(shakirasIphone.ID,shakirasIphone)
        handler.put(newMachine1.ID,newMachine1)
        handler.put(newMachine2.ID,newMachine2)
        handler.put(newMachine3.ID,newMachine3)
        handler.put(newMachine4.ID,newMachine4)

        when: 'I want to check individual coin totals'

        String lotsOfTotals = MachineHandler.getIndividualCoinTotalsOfAllMachines(handler);

        then: 'return individual coins for all machines'
        String validString = "Quarter: 0" + "\nDimes: 0"+ "\nNickels: 0";
        lotsOfTotals.equals(validString)
    }

}