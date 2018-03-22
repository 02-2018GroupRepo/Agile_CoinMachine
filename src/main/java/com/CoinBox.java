package com;

public class CoinBox {

    private int numQ = 0;
    private int numD = 0;
    private int numN = 0;

    private double totalValue = 0;

    public CoinBox(){}

    public void insertCoin(Coin coin){
        totalValue += coin.getCoinValue();
        if(coin.getCoinValue() == 0.25){
            numQ++;
        }
        else if(coin.getCoinValue() == 0.10){
            numD++;
        }
        else{
            numN++;
        }
    }

    public int getNumQ() {
        return numQ;
    }

    public int getNumD() {
        return numD;
    }

    public int getNumN() {
        return numN;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setNumQ(int numQ) {
        this.numQ = numQ;
    }

    public void setNumD(int numD) {
        this.numD = numD;
    }

    public void setNumN(int numN) {
        this.numN = numN;
    }
}
