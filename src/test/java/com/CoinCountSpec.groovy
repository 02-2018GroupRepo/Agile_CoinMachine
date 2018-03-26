package com

import spock.lang.Specification

class CoinCountSpec extends Specification {
    def "individual coin count"() {

        given: "A CoinBox"

        CoinBox coinbox= new CoinBox();

        when: "An operator want to see individual coin counts"

        coinbox.getIndividualCoincounts() ;
        String IndividualCoincounts=(coinbox.getIndividualCoincounts());

        then: "The individal coins are returned:"
        IndividualCoincounts.equals("0number of quarters0number of Dimes0number of nickels");

    }

}