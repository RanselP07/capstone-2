package com.pluralsight;

import java.util.Scanner;

public class OrderScreen {

    //region ----MENU----

    // Display the order screen menu.
    public static void menu() {
        Scanner myScanner = new Scanner(System.in);
        int input = 5;

        do {
            // Prompt the user to answer if they what they would like order or exit.
            System.out.print("What would you like to order? ");
            String userInput = myScanner.nextLine().trim().toLowerCase();

            // this is a try-catch for a user to handle invalid inputs.
            try {
                // if the input is empty.
                if (userInput.isEmpty()) {
                    System.out.print("Input cannot be empty, please enter a number between 0-4.\n");
                    continue;
                }

                // handles the user input if he entered the number as a string.
                input = switch (userInput) {
                    case "zero" -> 0;
                    case "one" -> 1;
                    case "two" -> 2;
                    case "three" -> 3;
                    case "four" -> 4;
                    default -> Integer.parseInt(userInput);
                };

            } catch (NumberFormatException e) {
                // handles any other input that is NOT a valid integer.
                System.out.print("Invalid Input, please enter a number between 0-4.\n");
                continue;
            }

            // Routes valid input to place the order and exit via checkout or canceled order.
            switch (input) {
                case 0 -> {
                    System.out.println("Order is canceled");
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
                }
                default -> {
                    System.out.println("please enter a number between 0-4.");
                }
            }
        } while (!(input == 4 || input == 0));
    }

    //endregion

    public void addEmpanada(){

    }

    public static Drink addDrink(Scanner myScanner){
        int quantity = UserInput.quantity(myScanner);
        String size = UserInput.size(myScanner);
        String flavor = UserInput.type(myScanner);

        return new Drink(quantity, size, flavor);
    }

    public void addSide(){

    }

    public void checkout(){

    }
}
