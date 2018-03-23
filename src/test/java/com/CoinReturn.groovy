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

    def "Item is out of Stock"(){
        given:"Item is Selected"
        int column = 0; int row = 0;

        and: "item is out of stock"
        Vending_Machine machine = new Vending_Machine()

        and: "money has been inserted"
        int q = 1; int d = 1; int n = 1;

        when: "out of stock is selected"

        int itemIsgone = machine.buyProduct(column, row, q, d, n)

        then: "return inserted moneys"
        itemIsgone == 0

    }

    def "Too many coins"(){
        given:"Coins were inserted"
        double total = 1.50; //buck fity

        and:"an item price"
        double itemPrice = 0.65;

        when:"money inserted is greater than price"
        Vending_Machine machine = new Vending_Machine()

        double testChange;

        if(machine.coinReturn(itemPrice, total)){
            testChange = machine.getChange(total-itemPrice)
        }

        then:"return difference between inserted money and item price"
        testChange == 0.85

    }
}