package com

import spock.lang.Specification



class InfoByLocationSpec extends Specification {

    def "Find Total Individual Coins By Location"(){

        given: "A location"
        String location = "Atlanta"
        Vending_Machine machine = new Vending_Machine("Atlanta")
        Vending_Machine machine1 = new Vending_Machine("Atlanta")
        Vending_Machine machine2 = new Vending_Machine("Boston")
        Vending_Machine machine3 = new Vending_Machine("Atlanta")

        MachineHandler handler = new MachineHandler()
        handler.addMachine(machine)
        handler.addMachine(machine1)
        handler.addMachine(machine2)
        handler.addMachine(machine3)

        ArrayList<Integer> keys = handler.findMachinesbyLocation(location)

        for(int i = 0; i < keys.size(); i++){
            println keys[i]
        }
        when: "an operator calls checkMoney"

        then: "the individual amount of coins is returned"

    }

}