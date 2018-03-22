package com;

import java.util.*;

public class Vending_Machine {

    String location;
    String company = "Shane";
    int ID = 0;

    int MAX_ITEM_COUNT;

    //Starting each vending machine with $20
    int numQ = 50; //Number of Quarters, $12.50
    int numN = 50; //Number of Nickels, $2.50
    int numD = 50; //Number of Dimesm $5.00

    Map<Products, Integer> inStock = new HashMap<Products, Integer>();
    //Coins coin = new Coins();

    public Vending_Machine(){};

    public Vending_Machine(String location){
        this.location = location;
        this.ID = ++ID;
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
        ArrayList<String> candySort = new ArrayList<String>();

        for (Map.Entry<Products, Integer> entry : inStock.entrySet()) {
            candySort.add(entry.getKey().getId() + " " + entry.getKey().getName() + " $" + entry.getKey().getRetailPrice());
        }

        Collections.sort(candySort);

        for(String i: candySort) {
            System.out.println(i);
        }
    }

}
