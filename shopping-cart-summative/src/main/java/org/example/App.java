package org.example;

import org.example.commands.AddItems;
import org.example.commands.DisplayItems;
import org.example.commands.RemoveItems;
import org.example.service.CartService;
import org.example.utilities.TerminalUtilities;

public class App
{
    public static void main( String[] args )
    {
       TerminalUtilities utils = new TerminalUtilities();
       CartService service = new CartService();
        boolean keepRunning = true;
        int choice = 0;

        while(keepRunning) {
            utils.DisplayMenu();
            choice = utils.menuChoice();
            switch (choice) {
                case 1:
                    DisplayItems.displayItemsList(service);
                    break;
                case 2:
                    RemoveItems.removeItem(service);
                    break;
                case 3:
                    AddItems.addItem(service);
                    break;
                case 4:
                    CheckOutCart.checkOutTotal(service);
                    break;
                case 5:
                    keepRunning = false;
                default:
                    utils.displayMessage("Please enter a valid input.");
            }

        }
    }
}
