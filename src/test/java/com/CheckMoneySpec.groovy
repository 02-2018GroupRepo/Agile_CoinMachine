package com

import spock.lang.Specification


class CheckMoneySpec extends Specification {

    def "Check total amount in a machine" (){

        given: "A machine "

        Machine vendingMachine = new Machine();

        and: "a collection of coins"

        Coin nickel = new Coin("nickel");
        Coin dime = new Coin("dime");
        Coin quarter = new Coin("quarter");

        List<Coin> coinList = new ArrayList<>();
        coinList.add(nickel);
        coinList.add(dime);
        coinList.add(quarter);
        coinList.add(quarter);

        vendingMachine.coinList = coinList;

        when: "the total value of money is requested"

        double amount = vendingMachine.getTotalValue();

        then: "the total value of all coins in the machine is returned"

        List<Coin> CoinList = new ArrayList<>();
        coinList(nickel);
        coinList(dime);
        coinList(quarter);
        coinList(quarter);
    }

}