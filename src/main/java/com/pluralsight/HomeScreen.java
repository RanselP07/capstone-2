package com.pluralsight;

import java.util.Scanner;

// Home Screen
public class HomeScreen extends OrderScreen {

    // Display the home screen menu.
    public static void menu() {
        Scanner myScanner = new Scanner(System.in);
        boolean exit = false;
        String orderScreen = """
                -------------------
                |   ORDER SCREEN   |
                -------------------
                |o 1) Add Item     |
                |o 2) Add Drink    |
                |o 3) Add Main Side|
                |o 4) Checkout     |
                |o 0) Cancel Order |
                -------------------
                """;

        do {
            // Prompt the user to answer if they would like to order or exit.
            System.out.print("Would you like to order? ");
            String userInput = myScanner.nextLine().toLowerCase();

            // Re-prompt until the user provides an explicit "yes" or "no".
            while (!(userInput.equals("yes") || userInput.equals("no"))) {
                if (userInput.isEmpty()) {
                    System.out.print("Input cannot be empty, enter Yes/No: ");
                } else {
                    System.out.print("Invalid Input, please enter Yes/No: ");
                }
                userInput = myScanner.nextLine().toLowerCase();
            }

            // Routes valid input to start a new order or to exit the application.
            switch (userInput) {
                case "yes" -> {
                    System.out.print("\n" + orderScreen + "\n");
                    OrderScreen.menu();
                }
                case "no" -> {
                    System.out.print("Thanks for coming! Have a great day.");
                    exit = true;
                }
                default -> {
                    System.out.println("That was a mistake");
                }
            }
        } while (!exit);
    }
}
