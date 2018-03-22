package com;

public class CoinBox {

    private double totalValue = 0;

    public CoinBox(){}

    public void insertCoin(Coin coin){
        totalValue += coin.getCoinValue();
    }


}
