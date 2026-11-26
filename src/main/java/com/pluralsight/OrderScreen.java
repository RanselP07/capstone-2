package com.pluralsight;

import java.util.Scanner;

public class OrderScreen {
    // Display the home screen menu.
    public static void menu() {
        Scanner myScanner = new Scanner(System.in);
        boolean exit = false;
        int input = 0;


        do {
            // Prompt the user to answer if they would like to order or exit.
            System.out.print("What would you like to order? ");
            String userInput = myScanner.nextLine().toLowerCase();

            try {
                if (userInput.isEmpty()) {
                    System.out.print("Input cannot be empty, please enter a number between 0-4.\n");
                    OrderScreen.menu();
                }

                switch (userInput){
                    case "zero" -> {input = 0;}
                    case "one" -> {input = 1;}
                    case "two" -> {input = 2;}
                    case "three" -> {input = 3;}
                    case "four" -> {input = 4;}
                    default -> {input = Integer.parseInt(userInput);}
                }

//                if (userInput.equalsIgnoreCase("zero")){
//                    input = 0;
//                } else if (userInput.equalsIgnoreCase("one")) {
//                    input = 1;
//                } else if (userInput.equalsIgnoreCase("two")) {
//                    input = 2;
//                } else if (userInput.equalsIgnoreCase("three")) {
//                    input = 3;
//                } else if (userInput.equalsIgnoreCase("four")) {
//                    input = 4;
//                } else{
//                    input = Integer.parseInt(userInput);
//                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid Input, please enter a number between 0-4.\n");
                OrderScreen.menu();
            }

            // Routes valid input to start a new order or to exit the application.
            switch (input) {
                case 0 -> {
                    System.out.println("Order is canceled");
                    exit = true;
                }
                case 1 -> {
                    System.out.println("Add Item");
                }
                case 2 -> {
                    System.out.println("Add Drinks");
                }
                case 3 -> {
                    System.out.println("Add Sides");
                }
                case 4 -> {
                    System.out.println("Checkout");
                    exit = true;
                }
                default -> {
                    System.out.println("please enter a number between 0-4.");
                }
            }
        } while (!exit);
    }
}
