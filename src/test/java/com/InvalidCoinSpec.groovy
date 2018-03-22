package com

import spock.lang.Specification


class InvalidCoinSpec extends Specification {

    def "invalid coin rejection"(){

        given: "a coinbox"
        CoinBox coinbox = new CoinBox();
        and: "an invalid coin"
        Coin invalidCoin = new Coin("gjaori");
        when: "an invalid coin is inserted"
        coinbox.insertCoin(invalidCoin);
        then: "return the coin"
        coinbox.totalValue == 0.0;

    }

}