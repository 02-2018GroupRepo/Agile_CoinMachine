package com;

import java.util.List;

public class Machine {

    private List<Coin> coinList;

    public double getTotalValue(){
        double sum = 0.0;
        for(Coin c : coinList){
            sum += c.getCoinValue();
        }
        return sum;
    }

}
