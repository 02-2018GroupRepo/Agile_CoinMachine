package com

import spock.lang.Specification


class ValidCoinSpec extends Specification {

    def "valid coin acceptance"(){

        given: "a coinbox"
        CoinBox coinbox = new CoinBox();
        and: "coins of a valid type"
        Coin coin = new Coin("quarter");
        and: "initial total of 0"
        coinbox.totalValue = 0;
        when: "a valid coin is inserted"
        coinbox.insertCoin(coin);
        then: "the total value increases by the coin value"
        coinbox.totalValue == coin.getCoinValue()

    }

}