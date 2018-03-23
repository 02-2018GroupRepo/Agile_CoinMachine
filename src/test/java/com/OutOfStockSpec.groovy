package com

import spock.lang.Specification


class OutOfStockSpec extends Specification {

    def "Item is not in stock"(){

        given: "A vending machine with items not in stock"
        Vending_Machine emptyMachine = new Vending_Machine();
        when: "Item is selected"
        boolean inStock = emptyMachine.isInStock(1,1)
        then: "User is notified about out of stock selection"
        !inStock;

    }

}