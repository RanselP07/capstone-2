package com.pluralsight;

import java.util.Scanner;

// Home Screen
public class HomeScreen {

    // Display the home screen menu.
    public static void menu() {
        Scanner myScanner = new Scanner(System.in);
        boolean done = false;

        do {
            // Prompt the user to answer if they would like to order or exit.
            System.out.print("Would you like to order? ");
            String userInput = myScanner.nextLine().toLowerCase();

            // Re-prompt until the user provides an explicit "yes" or "no".
            while (!(userInput.equals("yes") || userInput.equals("no"))) {
                if (userInput.isEmpty()) {
                    System.out.print("Please write something, enter Yes/No: ");
                } else {
                    System.out.print("Invalid Input, please enter Yes/No: ");
                }
                userInput = myScanner.nextLine().toLowerCase();
            }

            // Routes valid input to start a new order or to exit the application.
            switch (userInput) {
                case "yes" -> {
                    OrderScreen.menu();
                }
                case "no" -> {
                    System.out.println("Thanks for coming, hope to see you again soon!");
                    done = true;
                }
                default -> {
                    System.out.println("That was a mistake");
                }
            }
        } while (!done);
    }
}
