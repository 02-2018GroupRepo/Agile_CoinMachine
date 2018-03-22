package com

import spock.lang.Specification



class InfoByLocationSpec extends Specification {

    def "Find Total Individual Coins By Location"(){

        given: "A location"
        String location = "Atlanta"
        Vending_Machine machine = new Vending_Machine(1,"Atlanta")
        Vending_Machine machine1 = new Vending_Machine(2,"Atlanta")
        Vending_Machine machine2 = new Vending_Machine(3,"Boston")
        Vending_Machine machine3 = new Vending_Machine(4,"Atlanta")

        MachineHandler handler = new MachineHandler()
        handler.addMachine(machine)
        handler.addMachine(machine1)
        handler.addMachine(machine2)
        handler.addMachine(machine3)

        when: "an operator calls checkMoney"
        ArrayList<Integer> keys = handler.findMachinesbyLocation(location)

        int q = 0;
        int d = 0;
        int n = 0;
        for(int i = 0; i < keys.size(); i++){
            q += handler.handler.get(keys[i]).numQ;
            d += handler.handler.get(keys[i]).numD;
            n += handler.handler.get(keys[i]).numN
        }


        then: "the individual amount of coins is returned"
        println "Number of Quarters " + q
        println "Number of Dimes " + d
        println "Number of Nickels " + n
    }

}