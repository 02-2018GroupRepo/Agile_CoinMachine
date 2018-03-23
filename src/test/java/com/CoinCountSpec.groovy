package com

import spock.lang.Specification

import java.security.PublicKey


class CoinCountSpec extends Specification {
    def "individual coin count"() {

        given: "A CoinBox"

        CoinBox machine = new CoinBox();

        when: "An operator want to see individual coin counts"

        machine.getIndividualCoincounts() ;
        String IndividualCoincounts=(machine.getIndividualCoincounts());

        then: "The individal coins are returned:"
        IndividualCoincounts.equals("0number of quarters0number of Dimes0number of nickels");

    }

}