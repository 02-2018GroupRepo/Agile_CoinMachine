package com

import spock.lang.Specification


class CoinReturn extends Specification {

    def "Not Enough Coins are given to the machine"(){

        given: "An Item Price"

        double price = 0.50;

        and: "The amount of money given to the machine"

        double moneyGiven = 0.25;

        when: "not enough money is inserted for selected item"
        Vending_Machine machine = new Vending_Machine();
        boolean test = machine.coinReturn(price, moneyGiven)

        then: "Inserted money is returned"
        test == false;
    }
}