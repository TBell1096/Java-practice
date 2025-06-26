package org.example.utilities;
import org.example.data.Item;

import java.util.ArrayList;
import java.util.Scanner;
public class TerminalUtilities {
    private Scanner scanner = new Scanner(System.in);

    public void DisplayMenu() {
        System.out.println("Welcome to the Shopping Cart App");
        System.out.println("1. Display Cart\n2. Remove an Item\n3. Add an Item\n4. Checkout\n5. Exit");
    }

    public int menuChoice () {
        int userInput = 0;
        String userInputStr = scanner.nextLine();
        System.out.print("Please enter a choice: ");
        try {
            userInput = Integer.parseInt(userInputStr);
            if (userInput < 1 || userInput > 5 ) {
                System.out.println("Please enter a valid choice.");
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }
        return userInput;
    }

    public Item addItem() {
        String name = getItemName();
        int quantity = getQuantity();
        double price = getPrice();
        return new Item(name, quantity, price);
    }

    public String getItemName() {
        System.out.print("Enter the item name: ");
        String itemName = scanner.nextLine();
        if(itemName == null) {
            System.out.println("Please enter a name.");
        }
        return itemName;
    }

    public int getQuantity() {
        boolean validInput = false;
        int itemQuantity = 0;

        do {
            System.out.print("How many would you like to purchase: ");
            String intStr = scanner.nextLine();
            try {
                itemQuantity = Integer.parseInt(intStr);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }while (!validInput);
        return itemQuantity;
    }

    public double getPrice() {
        boolean validInput = false;
        double price = 0.00;

        do {
            System.out.print("How much does this item cost: ");
            String priceStr = scanner.nextLine();
            try {
                price = Double.parseDouble(priceStr);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Please a valid number.");
            }
        }while (!validInput);

        return price;
    }

    public int getItemByIndex(ArrayList<Item> itemsList) {
        if (itemsList.isEmpty()) {
            System.out.println("There are no items in your cart.");
            return -1;
        }

        for (int i = 0; i < itemsList.size(); i++) {
            Item item = itemsList.get(i);
            System.out.println((i + 1) + ". " + item.getName());
        }
        while (!scanner.hasNext()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        String choiceStr = scanner.nextLine();
        int choice = Integer.parseInt(choiceStr);
        if (choice < 1 || choice > itemsList.size()) {
            System.out.println("Invalid selection.");
            return -1;
        }
        return choice -1;
    }

    public void displayMessage(String message) {
        System.out.print(message);
    }
    public int getNumberInput() {
        String numberStr = scanner.nextLine();
        int number = Integer.parseInt(numberStr);
        return number;
    }

    public static void displayItemList(ArrayList<Item> itemList) {
        if (itemList.isEmpty()){
            System.out.println("Your cart is currently empty.");
        }else {
            System.out.println("Your cart:");
            for (Item item: itemList) {
                System.out.println(item.getName());
            }
        }

    }

}
