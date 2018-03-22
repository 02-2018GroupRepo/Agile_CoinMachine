package com;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        Vending_Machine machine = new Vending_Machine(4,"Atlanta");
        MachineHandler handler = new MachineHandler();
        handler.addMachine(machine);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Option stuff");
        String option = scan.next();




        if(option.toLowerCase().equals("operator")){
            SecurityCode security = new SecurityCode();
            System.out.println("Enter Security Code: ");
            String code = scan.next();

            if(security.checkPassword(code)) {
                //operator stuff
                System.out.println("1) Get Coin Totals by Location ");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Which Location?");
                        System.out.println(handler.getCoinTotalsbyLocation(scan.next()));
                        break;

                }
            }
            else
                System.out.println("Your mother is a hamster & your father smells of elderberries");
        }
        else{
            //your machine stuff
        }
    }



}
