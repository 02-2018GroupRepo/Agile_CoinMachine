package com;

import java.util.*;


public class Vending_Machine {

    String location;
    String company = "Shame";
    int ID = 0;

    int MAX_ITEM_COUNT;

//    //Starting each vending machine with $20
//    int numQ = 50; //Number of Quarters, $12.50
//    int numN = 50; //Number of Nickels, $2.50
//    int numD = 50; //Number of Dimes $5.00

    CoinBox box = new CoinBox();
    Queue<Products>[][] products2DArray = new Queue[5][5];

    public Vending_Machine() {
        initializeItemQueues();
    }

    public Vending_Machine(int ID, String location) {
        this.location = location;
        this.ID = ID;
        initializeItemQueues();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getChange(double change){

        boolean done = false;
        int q = 0, d = 0, n = 0;
        while(!done){
            if(((change - .25) >= 0.0) && (box.getNumQ() > 0)){
                box.setNumQ(box.getNumQ() - 1);
                q++;
                change -= .25;
            }
            else if(((change - .10) >= 0.0)  && (box.getNumD() > 0)){
                box.setNumD(box.getNumD() - 1);
                d++;
                change -= .10;
            }
            else if(((change - .05) >= 0.0) && (box.getNumN() > 0)){
                box.setNumN(box.getNumN() - 1);
                n++;
                change -= 0.05;
            }
            else
                done = true;
        }
        System.out.println("Your Change: "+ change + "\n" + q + " Quarters " + d + " Dimes " + n + " Nickels");

        return change;
    }

    public void initializeItemQueues() {
        for (int i = 0; i < products2DArray.length; i++) {
            for (int j = 0; j < products2DArray[i].length; j++) {
                products2DArray[i][j] = new ArrayDeque<Products>();
            }
        }
    }

    public boolean isInStock(int column, int row) {
        boolean inStock = true;
        if (products2DArray[column][row].size() == 0) {
            inStock = false;
            System.out.println("Out of stock, idiot.");
        }
        return inStock;
    }

    public int buyProduct(int column, int row, int q, int d, int n){
        double total = (q * 0.25) + (d * 0.10) + (n * 0.05);
        if(isInStock(column,row)){
            if(coinReturn(products2DArray[column][row].element().getRetailPrice(), total)){
                //buy stuff
                return 1;
            }
            else{
                //return money because didnt have enough
                return 2;
            }
        }
        else{
            //item is out of stock
            System.out.printf("Here is your money back $%.2f\n", total);
            return 0;
        }

    }

    public boolean coinReturn(double price, double moneyGiven) {
        if (moneyGiven >= price)
            return true;
        return false;
    }

}
