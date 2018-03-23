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
            q += handler.handler.get(keys[i]).box.numQ;
            d += handler.handler.get(keys[i]).box.numD;
            n += handler.handler.get(keys[i]).box.numN
        }


        then: "the individual amount of coins is returned"
        println "Number of Quarters " + q
        println "Number of Dimes " + d
        println "Number of Nickels " + n
    }

    def "Get total money in machines by location"(){

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

        when: "the operator wants to know total amount in the machines"
        ArrayList<Integer> keys = handler.findMachinesbyLocation(location)

        double total = 0;
        for(int i = 0; i < keys.size(); i++){
            total += handler.handler.get(keys[i]).box.getTotalValue();
        }

        then: "the total of all machines is returned"
        println total
    }
    def "im testing how queues work"() {
        given: "stuff"
        Products chips = new Products("A1", "chips", "potato", 0.50, 1.00);
        Products cracker = new Products("A2", "cracker", "saltine", 0.25, 1.00);
        Products popcorn = new Products("A3", "popcorn", "salted", 0.50, 1.50);
        Queue<Products>[][] machineProducts = new LinkedList<Products>[5][5];
        machineProducts[0][0] = new LinkedList<>();
        machineProducts[0][3] = new LinkedList<>();

        when: "other stuff"
        for(int i = 0; i < 10; i++) {
            machineProducts[0][0].add(chips);
        }
        then: "do stuff"
        println machineProducts[0][0].size()
        println machineProducts[0][0].peek().name

        println machineProducts[0][3].size()

    }
}