package com;

public class Coin {
private final static double NICKEL = 0.05;
private final static double DIME = 0.10;
private final static double QUARTER = 0.25;
private double coinValue;

    public Coin(String coinType){
        if(coinType.equals("nickel")){
            coinValue = NICKEL;
        }
        if(coinType.equals("dime")){
            coinValue = DIME;
        }
        if(coinType.equals("quarter")){
            coinValue = QUARTER;
        }
    }

    public static double getNICKEL() {
        return NICKEL;
    }

    public static double getDIME() {
        return DIME;
    }

    public static double getQUARTER() {
        return QUARTER;
    }

    public double getCoinValue(){
        return coinValue;
    }

}
