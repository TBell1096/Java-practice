package org.example.commands;

import org.example.utilities.TerminalUtilities;
import org.example.service.CartService;

public class DisplayItems {
    public static void displayItemsList(CartService service) {
        TerminalUtilities.displayItemList(service.getItemsList());}
}
