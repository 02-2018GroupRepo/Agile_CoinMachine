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

    Map<Products, Integer> inStock = new HashMap<Products, Integer>();
    CoinBox box = new CoinBox();
    Queue<Products>[][] products2DArray = new Queue[5][5];

    public Vending_Machine(){
        initializeItemQueues();
    };

    public Vending_Machine(int ID, String location){
        this.location = location;
        this.ID = ID;
        initializeItemQueues();
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void showMenu(){
        ArrayList<String> productSort = new ArrayList<String>();

        for (Map.Entry<Products, Integer> entry : inStock.entrySet()) {
            productSort.add(entry.getKey().getId() + " " + entry.getKey().getName() + " $" + entry.getKey().getRetailPrice());
        }

        Collections.sort(productSort);

        for(String i: productSort) {
            System.out.println(i);
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public boolean coinReturn(double price, double moneyGiven){
        boolean answer = false;
        if(moneyGiven >= price){
            answer = true;
            return answer;
        }
        else{
            return answer;
        }
=======
=======

>>>>>>> 513ab7433d72e806f4216378cd3d003289c7a6b8
    public void initializeItemQueues (){
        for (int i = 0; i < products2DArray.length; i++){
            for (int j = 0; j < products2DArray[i].length; j++){
                products2DArray[i][j] = new ArrayDeque<Products>();
            }
        }
    }


    public boolean isInStock (int column, int row){
    boolean inStock = true;
        if(products2DArray[column][row].size() == 0){
             inStock = false;
            System.out.println("Out of stock, idiot.");
        }
    return inStock;
<<<<<<< HEAD
>>>>>>> 6b35bb72ff38ca247e76a3626351512b1b0d4c91
=======
    }

    public boolean coinReturn(double price, double moneyGiven){
        boolean answer = false;
        if(moneyGiven >= price){
            answer = true;
            return answer;
        }
        else{
            return answer;
        }

>>>>>>> 513ab7433d72e806f4216378cd3d003289c7a6b8
    }

}
