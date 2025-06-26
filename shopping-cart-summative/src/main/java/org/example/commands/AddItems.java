package org.example.commands;

import org.example.service.CartService;
import org.example.data.Item;
import org.example.utilities.TerminalUtilities;

public class AddItems {


    public static void addItem(CartService service) {
        TerminalUtilities utils = new TerminalUtilities();
        Item newItem = utils.addItem();
        service.addItem(newItem);
    }
}
