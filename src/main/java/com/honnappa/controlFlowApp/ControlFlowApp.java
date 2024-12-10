package com.honnappa.controlFlowApp;

import java.util.Scanner;

public class ControlFlowApp {

    public static void main(String[] args) {
        boolean isDamged = false;
        String carColour = "purple";
        char energyEfficiencyCatogory ='z';

       /* Scanner scanner = new Scanner(System.in);
        isDamged=scanner.nextBoolean();

        System.out.println("Ples enter your car stats by typing isDamaged");
*/
        if (isDamged){
            System.out.println("Damaged car");
        }else {
            System.out.println("Accident free car");
        }

        if (carColour.equals("red")){
            System.out.println("This car is red");
        } else if (carColour.equals("green")) {
            System.out.println("This car is green");
        } else if (carColour.equals("blue")) {
            System.out.println("This car is blue");
        }else {
            System.out.println("I have no idea what is colour of the car");
        }


        switch (energyEfficiencyCatogory){
            case 'A':
            case 'B':
                System.out.println("Low energy efficiency");
                break;
            case 'G':
                System.out.println("Very high energy consumption");
                break;
            default:
                System.out.println("not defined category");
        }

        int numberOfOwners=5;
        {
            numberOfOwners++;
        }
        System.out.println("Number of owners: " +numberOfOwners);
    }

}
