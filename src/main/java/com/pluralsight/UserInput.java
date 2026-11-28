package com.pluralsight;

import java.util.Scanner;

public class UserInput {

    public static int quantity(Scanner myScanner) {
        int quantity = 0;

        // Prompt the user to answer if they what they would like order or exit.
        do {
            System.out.print("Enter the quantity: ");
            String quantityString = myScanner.nextLine().trim();

            // this is a try-catch for a user to handle invalid inputs.
            try {
                // if the input is empty.
                if (quantityString.isEmpty()) {
                    System.out.print("Input cannot be empty.\n");
                }

                quantity = Integer.parseInt(quantityString);

            } catch (NumberFormatException e) {
                // handles any other input that is NOT a valid integer.
                System.out.print("Invalid Input, please enter a number greater than 0.\n");
            }

        } while (!(quantity > 0));

        return quantity;
    }

    public static String size(Scanner myScanner) {
        String size = null;

        do {
            // Prompt the user to answer if they what they would like order or exit.
            System.out.print("What would you like to order? ");
            String userInput = myScanner.nextLine().trim().toLowerCase();

            // this is a try-catch for a user to handle invalid inputs.
            // if the input is empty.
            if (userInput.isEmpty()) {
                System.out.print("Input cannot be empty, please enter a number between 0-4.\n");
                continue;
            }

            switch (userInput) {
                case "1", "one", "small" -> size = "Small";
                case "2", "two", "medium" -> size = "Medium";
                case "3", "three", "large" -> size = "Large";
                default -> {
                    size = null;
                    System.out.println("Invalid size, please enter Small, Medium, Large, or 1-3.");
                }
            };

        } while (size != null);

        return size;
    }

    // TODO: Finish the type
    public static String type(Scanner myScanner) {
        return null;
    }
}
